package com.example.laboratorcicluviata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        // Cerinta 9: Preluam datele trimise
        Intent intentPrimit = getIntent();
        String mesaj = intentPrimit.getStringExtra("MESAJ");
        int val1 = intentPrimit.getIntExtra("VALOARE1", 0);
        int val2 = intentPrimit.getIntExtra("VALOARE2", 0);

        int suma = val1 + val2;

        // Afisam in Toast
        Toast.makeText(this, "Mesaj: " + mesaj + "\nValoarea 1: " + val1 + "\nValoarea 2: " + val2, Toast.LENGTH_LONG).show();

        // Cerinta 10: Butonul de retur
        Button btnInapoi = findViewById(R.id.btnInapoi);
        btnInapoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentRezultat = new Intent();
                intentRezultat.putExtra("MESAJ_RETUR", "Calcul efectuat cu succes!");
                intentRezultat.putExtra("SUMA_RETUR", suma);

                setResult(RESULT_OK, intentRezultat);
                finish();
            }
        });
    }
}