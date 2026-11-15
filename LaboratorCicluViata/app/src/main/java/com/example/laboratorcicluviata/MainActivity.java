package com.example.laboratorcicluviata;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WindowCompat.enableEdgeToEdge(getWindow());
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d("LifecycleDemo", "onCreate a fost apelată");
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Metoda onStart() este apelată când activitatea devine vizibilă pe ecran.
        Log.e("LifecycleDemo", "onStart - Error");
        Log.w("LifecycleDemo", "onStart - Warning");
        Log.d("LifecycleDemo", "onStart - Debug");
        Log.i("LifecycleDemo", "onStart - Info");
        Log.v("LifecycleDemo", "onStart - Verbose");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Metoda onResume() este apelată când activitatea este în prim-plan și utilizatorul poate interacționa cu ea.
        Log.e("LifecycleDemo", "onResume - Error");
        Log.w("LifecycleDemo", "onResume - Warning");
        Log.d("LifecycleDemo", "onResume - Debug");
        Log.i("LifecycleDemo", "onResume - Info");
        Log.v("LifecycleDemo", "onResume - Verbose");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Metoda onPause() este apelată când activitatea își pierde focusul (ex: apare altă fereastră deasupra).
        Log.e("LifecycleDemo", "onPause - Error");
        Log.w("LifecycleDemo", "onPause - Warning");
        Log.d("LifecycleDemo", "onPause - Debug");
        Log.i("LifecycleDemo", "onPause - Info");
        Log.v("LifecycleDemo", "onPause - Verbose");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Metoda onStop() este apelată când activitatea nu mai este vizibilă pe ecran.
        Log.e("LifecycleDemo", "onStop - Error");
        Log.w("LifecycleDemo", "onStop - Warning");
        Log.d("LifecycleDemo", "onStop - Debug");
        Log.i("LifecycleDemo", "onStop - Info");
        Log.v("LifecycleDemo", "onStop - Verbose");
    }
}