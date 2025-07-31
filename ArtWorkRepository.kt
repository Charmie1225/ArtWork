// ArtWorkRepository.kt
package com.example.artwork

import com.example.artwork.R

data class ArtWork(
    val title: String,
    val artist: String,
    val year: String,
    val imageResId: Int,
    val artistDescription: String
)

object ArtWorkRepository {
    val artworks = listOf(
        ArtWork(
            title = "Princess Astrid of Sweden, later Queen (1930s)",
            artist = "Bernhard Österman (Swedish, 1870 – 1938)",
            year = "1930s",
            imageResId = R.drawable.princess_astrid, // replace with actual image name
            artistDescription = """
                Gustaf Bernhard Österman was a Swedish painter, illustrator and curator. His twin brother, Emil, was also an artist.

                His father was a dye master. His brother Emil had already started at the Royal Swedish Academy of Fine Arts when he followed him to Stockholm and entered the Tekniska skolan to prepare for studies at the academy. During this time, he painted portraits from photographs to support himself. He was finally admitted to the academy and was there from 1892 to 1895. Both brothers received good marks and Bernhard was awarded the Royal Medal. In 1896, he took private lessons in etching from Axel Tallberg.

                Later, he received a travel scholarship that enabled him to visit the Netherlands, Belgium, France, Italy and Germany from 1897 to 1901. Although he originally studied history painting, he decided to become a portrait painter, as had his brother. They held a joint exhibition in 1903, but it was not very successful.

                Soon after, he moved to Paris and opened a studio. He was much more successful there. By 1907, he was a member of the Royal Academy and, in 1919, was appointed a hovintendent (a type of supervisor) at the Royal Court of Sweden. In 1933, he was promoted to överintendent (in this case, as a curator).

                He exhibited widely, receiving medals at the Louisiana Purchase Exhibition (1904), the Munich Fine Art Exhibition (1905) and the Baltic Exhibition (1914). He was named an honorary member of the Société Nationale des Beaux-Arts. Other showings were held in London (1928), Philadelphia (1928) and Washington (1931).

                He is buried at the Norra begravningsplatsen. In 1948 his widow, Hilda (1880–1950), donated his remaining works to the Sörmlands museum in Nyköping. His works may also be seen at the Gothenburg Museum of Art, Skokloster Castle, Uppsala University and the Nationalmuseum. The library of the French Senate has his portrait of General Maxime Weygand.
            """.trimIndent()
        ),
        ArtWork(
            title = "The Grand Vizier",
            artist = "Edwin Lord Weeks (American, 1849–1903)",
            year = "Late 1800s",
            imageResId = R.drawable.grand_vizier, // replace with actual image name
            artistDescription = """
                Edwin Lord Week was an American artist, noted for his Orientalist works.
                Weeks was born in Boston, Massachusetts in 1849. His parents were affluent spice and tea merchants from Newton, a suburb of Boston, and as such they were able to finance their son's youthful interest in painting and travelling.

                As a young man Weeks visited the Florida Keys to draw, and also travelled to Surinam in South America. His earliest known paintings date from 1867 when he was eighteen years old, although it is not until his Landscape with Blue Heron, dated 1871 and painted in the Everglades, that Weeks started to exhibit a dexterity of technique and eye for composition—presumably having taken professional tuition.

                In 1872 Weeks relocated to Paris, becoming a pupil of Léon Bonnat and Jean-Léon Gérôme.

                After his studies in Paris, Weeks emerged as one of America's major painters of Orientalist subjects. Throughout his adult life he was an inveterate traveler and journeyed to South America (1869), Egypt and Persia (1870), Morocco (frequently between 1872 and 1878), and India (1882–83).

                In 1895 Weeks wrote and illustrated a book of travels, From the Black Sea through Persia and India, and in 1897 he published Episodes of Mountaineering. Weeks died in Paris in November 1903.

                He was a member of the Légion d'honneur, France, an officer of the Order of Saint Michael (Bavaria), and a member of the Munich Secession.
            """.trimIndent()
        ),
        ArtWork(
            title = "Leda and the Swan",
            artist = "Virgil Solis (German, 1514–1562)",
            year = "Mid-1500s",
            imageResId = R.drawable.leda_swan, // replace with actual image name
            artistDescription = """
                Virgil Solis or Virgilius Solis, a member of a prolific family of artists, was a German draughtsman and printmaker in engraving, etching and woodcut who worked in his native city of Nuremberg.

                His prints were sold separately or formed the illustrations of books; many prints signed by him are probably by assistants. After his death his widow married his assistant and continued the workshop into the early seventeenth century.

                His woodcuts illustrating Ovid were especially influential. They were reprinted and copied in many different editions in various languages. He published an armorial of the Holy Roman Empire in 1555. Jost Amman was his assistant before starting his own workshop.

                Solis eventually died in Nuremberg. Eduard von Ubisch wrote a comprehensive description of Solis' life and work in relation to Bible images in 1889.
            """.trimIndent()
        )
    )
}
