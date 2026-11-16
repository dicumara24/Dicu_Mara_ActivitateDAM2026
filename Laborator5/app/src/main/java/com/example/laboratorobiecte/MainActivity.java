package com.example.laboratorobiecte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Aici vom salva toate dronele (Cerinta 1)
    public static ArrayList<Drona> listaDrone = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdauga = findViewById(R.id.btnAdauga);
        Button btnVeziLista = findViewById(R.id.btnVeziLista);

        btnAdauga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AdaugaActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        btnVeziLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            Drona dronaPrimita = (Drona) data.getSerializableExtra("OBIECT_TRIMIS");
            if (dronaPrimita != null) {
                listaDrone.add(dronaPrimita); // Adaugam in lista
                Toast.makeText(this, "Drona a fost adaugata!", Toast.LENGTH_SHORT).show();
            }
        }
    }
}