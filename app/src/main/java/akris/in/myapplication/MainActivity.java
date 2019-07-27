package akris.in.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import akris.in.myapplication.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ButtonTap(View v){
        Toast myToast = Toast.makeText(getApplicationContext(), "Meow! 🐱", Toast.LENGTH_LONG);
        myToast.show();
        MediaPlayer meow = MediaPlayer.create(MainActivity.this, R.raw.meow);
        meow.start();
    }
}
