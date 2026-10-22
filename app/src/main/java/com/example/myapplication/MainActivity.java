package com.example.myapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("SpellCheckingInspection")
public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleCallback";
    private TextView tvStatus;
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvStatus = findViewById(R.id.tvStatus);

        if (savedInstanceState != null) {
            clickCount = savedInstanceState.getInt("COUNT_KEY", 0);
            tvStatus.setText("Restored Count: " + clickCount);
            Log.d(TAG, "onCreate: State restored with count " + clickCount);
        } else {
            tvStatus.setText("State: onCreate");
            Log.d(TAG, "onCreate called fresh");
        }

        Button btnOpenSecond = findViewById(R.id.btnOpenSecond);
        btnOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                tvStatus.setText("Button Clicked: " + clickCount);
                Log.d(TAG, "Button clicked, count incremented to " + clickCount);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT_KEY", clickCount);
        Log.d(TAG, "onSaveInstanceState saved count: " + clickCount);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart called");
    }
}