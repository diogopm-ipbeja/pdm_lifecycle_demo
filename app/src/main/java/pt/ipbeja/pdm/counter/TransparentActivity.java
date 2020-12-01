package pt.ipbeja.pdm.counter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class TransparentActivity extends AppCompatActivity {

    public static final String TAG = TransparentActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreate " + (savedInstanceState == null ? "No bundle" : "Bundle available"));
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
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



    public static void start(Context context) {
        Intent starter = new Intent(context, TransparentActivity.class);
        context.startActivity(starter);
    }

}