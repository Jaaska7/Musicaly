package cat.boscdelacoma.musicaly

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referència al LinearLayout
        val canco1Layout: LinearLayout = findViewById(R.id.Canco1)

        // Afegir un clic al LinearLayout
        canco1Layout.setOnClickListener {
            // Crear un intent per iniciar la nova activitat
            val intent = Intent(this@MainActivity, MusicPlayer::class.java)

            // Iniciar la nova activitat
            startActivity(intent)
        }

        val playlistImageView: ImageView = findViewById(R.id.Playlist)

        // Afegir un clic a la ImageView de la Playlist
        playlistImageView.setOnClickListener {
            // Crear un intent per iniciar la nova activitat (PlaylistActivity)
            val intent = Intent(this@MainActivity, Playlist::class.java)

            // Iniciar la nova activitat
            startActivity(intent)
        }
    }
}
