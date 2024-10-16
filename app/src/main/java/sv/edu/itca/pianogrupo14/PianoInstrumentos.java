package sv.edu.itca.pianogrupo14;

import android.app.Activity;
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

import java.util.ArrayList;
import java.util.List;

public class PianoInstrumentos extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_piano_instrumentos);
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

    public void ins_do(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_do_guitarra);
        ndo.start();
        MessageBox("DO, GUITARRA");
    }
    public void ins_re(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_re_saxo);
        ndo.start();
        MessageBox("RE, SAXOFÓN");
    }
    public void ins_mi(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_mi_violin);
        ndo.start();
        MessageBox("MI, VIOLIN");
    }
    public void ins_fa(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_fa_arpa);
        ndo.start();
        MessageBox("FA, ARPA");
    }
    public void ins_sol(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_sol_trompeta);
        ndo.start();
        MessageBox("SOL, TROMPETA");
    }
    public void ins_la(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_la_bajo);
        ndo.start();
        MessageBox("LA, BAJO");
    }
    public void ins_si(View view) {
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.ins_si_elec_guitar);
        ndo.start();
        MessageBox("SI, GUITARRA ELECTRICA");
    }
    private void MessageBox(String mensaje) {
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }

}