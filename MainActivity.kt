package com.example.artwork

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.artwork.ui.theme.ArtWorkTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            ArtWorkTheme {
                NavHost(navController = navController, startDestination = "home") {
                    composable("home") { HomePage(navController) }
                    composable("artist/{index}") { backStackEntry ->
                        val index = backStackEntry.arguments?.getString("index")?.toIntOrNull() ?: 0
                        ArtistPage(navController, index)
                    }
                }
            }
        }
    }
}

@Composable
fun HomePage(navController: NavController) {
    var index by remember { mutableIntStateOf(0) }
    val artworkList = ArtWorkRepository.artworks
    val artwork = artworkList[index]

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Homepage() // Section A
        Spacer(modifier = Modifier.height(16.dp))
        ArtWall(artwork, index, navController) // Section B
        Spacer(modifier = Modifier.height(36.dp))
        ArtDescription(artwork) // Section C
        Spacer(modifier = Modifier.height(16.dp))
        ArtNavigation(index, artworkList.size) { index = it }
    }
}

@Composable
fun Homepage() {
    Text(text = "Art Space", style = MaterialTheme.typography.headlineLarge)
}

@Composable
fun ArtWall(artwork: ArtWork, index: Int, navController: NavController) {
    Image(
        painter = painterResource(id = artwork.imageResId),
        contentDescription = artwork.title,
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .clickable { navController.navigate("artist/$index") }
    )
}

@Composable
fun ArtDescription(artwork: ArtWork) {
    Column {
        Text(text = artwork.title, style = MaterialTheme.typography.headlineSmall)
        Text(text = "by ${artwork.artist} (${artwork.year})", fontSize = 18.sp)
    }
}

@Composable
fun ArtNavigation(index: Int, total: Int, updateIndex: (Int) -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(onClick = { if (index > 0) updateIndex(index - 1) }, enabled = index > 0) {
            Text("Previous")
        }
        Button(onClick = { if (index < total - 1) updateIndex(index + 1) }, enabled = index < total - 1) {
            Text("Next")
        }
    }
}

@Composable
fun ArtistPage(navController: NavController, index: Int) {
    val artwork = ArtWorkRepository.artworks[index]
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        ArtistProfile(artwork)
        Spacer(modifier = Modifier.height(16.dp))
        ArtistBio(artwork)
        Spacer(modifier = Modifier.height(24.dp))
        ArtistNavigation(navController)
    }
}

@Composable
fun ArtistProfile(artwork: ArtWork) {
    Text(text = "About ${artwork.artist}", style = MaterialTheme.typography.headlineMedium)
}

@Composable
fun ArtistBio(artwork: ArtWork) {
    Text(text = artwork.artistDescription, fontSize = 16.sp)
}

@Composable
fun ArtistNavigation(navController: NavController) {
    Button(onClick = { navController.popBackStack() }) {
        Text("Back to Collection")
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    ArtWorkTheme {
        HomePage(navController = rememberNavController())
    }
}




