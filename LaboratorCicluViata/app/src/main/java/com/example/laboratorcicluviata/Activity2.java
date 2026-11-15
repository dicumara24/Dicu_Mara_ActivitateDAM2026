package com.example.laboratorcicluviata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Button btnDeschide = findViewById(R.id.btnDeschide);
        btnDeschide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2.this, Activity3.class);

                // Trimitem datele catre Activity3
                intent.putExtra("MESAJ", "Salut din Activity 2!");
                intent.putExtra("VALOARE1", 10);
                intent.putExtra("VALOARE2", 20);

                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            String mesajRetur = data.getStringExtra("MESAJ_RETUR");
            int sumaRetur = data.getIntExtra("SUMA_RETUR", 0);

            // Afisam rezultatul primit de la Activity3
            Toast.makeText(this, mesajRetur + "\nRezultat: " + sumaRetur, Toast.LENGTH_LONG).show();
        }
    }
}