package sv.edu.itca.pianogrupo14;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.pianoTradicional) {
            Intent intento1 = new Intent(this, Piano_tradicional.class);
            startActivity(intento1);
            finish();

            return true;
        } else if (item.getItemId() == R.id.pianoSelva) {
            Intent intento2 = new Intent(this, MainActivity.class);
            startActivity(intento2);
            finish();

            return true;
        } else if (item.getItemId() == R.id.pianoInstrumentos) {
            Intent intento3 = new Intent(this, PianoInstrumentos.class);
            startActivity(intento3);
            finish();

            return true;
        } else if (item.getItemId() == R.id.menuopc1) {
            Intent intento4 = new Intent(this,acercade.class);
            startActivity(intento4);
            finish();

            return true;
        } else if (item.getItemId() == R.id.menuopc2) {
            System.exit(0);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void sonidocabra(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }

        mPlayer = MediaPlayer.create(this, R.raw.cabra);
        mPlayer.start();

        Toast.makeText(this, "Cabra", Toast.LENGTH_SHORT).show();
    }

    public void sonidocerdo(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer= MediaPlayer.create(this,R.raw.cerdo);
        mPlayer.start();
        Toast.makeText(this, "Cerdo", Toast.LENGTH_SHORT).show();

    }

    public void sonidogallina(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer= MediaPlayer.create(this,R.raw.gallina);
        mPlayer.start();
        Toast.makeText(this, "Gallina", Toast.LENGTH_SHORT).show();

    }

    public void sonidogato(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }

        mPlayer=MediaPlayer.create(this,R.raw.gato);
        mPlayer.start();
        Toast.makeText(this, "Gato", Toast.LENGTH_SHORT).show();

    }

    public void sonidoleon(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }
        mPlayer=MediaPlayer.create(this,R.raw.leon);
        mPlayer.start();
        Toast.makeText(this, "León", Toast.LENGTH_SHORT).show();

    }

    public void sonidoperico(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }

        mPlayer=MediaPlayer.create(this,R.raw.perico);
        mPlayer.start();
        Toast.makeText(this, "Perico", Toast.LENGTH_SHORT).show();

    }

    public void sonidoperro(View view) {
        if (mPlayer != null) {
            mPlayer.stop();
            mPlayer.release();
        }

        mPlayer=MediaPlayer.create(this,R.raw.perro);
        mPlayer.start();
        Toast.makeText(this, "Perro", Toast.LENGTH_SHORT).show();

    }

    public void DetenerReproduccion(View view) {
        if (mPlayer != null) {
            if (mPlayer.isPlaying()) {
                mPlayer.stop();
            }
            mPlayer.release();
            mPlayer = null;
        }
    }
}