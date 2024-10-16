package sv.edu.itca.pianogrupo14;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Piano_tradicional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_piano_tradicional);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void MessageBox(String mensaje) {
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
    }

    public void d_o(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.n_do);
        ndo.start();
        MessageBox("DO");
    }
    public void re(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.re);
        ndo.start();
        MessageBox("RE");

    }
    public void mi(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.mi);
        ndo.start();
        MessageBox("MI");
    }
    public void fa(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.fa);
        ndo.start();
        MessageBox("FA");
    }
    public void sol(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.sol);
        ndo.start();
        MessageBox("SOL");
    }
    public void la(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.la);
        ndo.start();
        MessageBox("LA");
    }
    public void si(View view){
        MediaPlayer ndo=MediaPlayer.create(this,R.raw.si);
        ndo.start();
        MessageBox("SI");

    }

}