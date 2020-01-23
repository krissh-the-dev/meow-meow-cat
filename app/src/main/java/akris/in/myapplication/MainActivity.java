package akris.in.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int[] audio = new int[4];
    int iteration = 0;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        audio[0] = R.raw.meow1;
        audio[1] = R.raw.meow2;
        audio[2] = R.raw.meow4;
        audio[3] = R.raw.meow4;
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast myToast = Toast.makeText(getApplicationContext(), "Meow! 🐱", Toast.LENGTH_LONG);
                myToast.show();
                MediaPlayer meow = MediaPlayer.create(MainActivity.this, audio[iteration]);
                meow.start();
                iteration += 1;
                if (iteration > 3)
                    iteration = 0;
            }
        });
    }
}