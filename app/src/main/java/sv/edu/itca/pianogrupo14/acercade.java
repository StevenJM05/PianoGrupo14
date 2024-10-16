package sv.edu.itca.pianogrupo14;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class acercade extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_acercade);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.acercade), (v, insets) -> {
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
}