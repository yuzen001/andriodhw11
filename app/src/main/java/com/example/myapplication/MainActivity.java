package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        Log.d("Activity Flow", "Main1 onCreate");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Activity Flow", "Main1 onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Activity Flow", "Main1 onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Activity Flow", "Main1 onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Activity Flow", "Main1 onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Activity Flow", "Main1 onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Activity Flow", "Main1 onDestroy");
    }
}