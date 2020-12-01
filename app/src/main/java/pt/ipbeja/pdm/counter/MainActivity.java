package pt.ipbeja.pdm.counter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private int counter = 0;
    private TextView counterText;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate " + (savedInstanceState == null ? "No bundle" : "Bundle available"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counterText = findViewById(R.id.counter);
        Button btn = findViewById(R.id.increment_btn);
        Button launch = findViewById(R.id.transparent_btn);


        btn.setOnClickListener(v -> {
            counter++;
            counterText.setText(counter + "");
        });


        launch.setOnClickListener(v -> {
            TransparentActivity.start(this);
            /*new Thread(() -> {
                try {
                    while(true) {
                        Thread.sleep(1000);
                        counter++;
                        runOnUiThread(() -> {
                            counterText.setText(counter + "");
                        });
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();*/
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStop");
        super.onStop();
    }


    @Override
    protected void onDestroy() {
        Log.i(TAG, "onDestroy");
        super.onDestroy();
    }



}