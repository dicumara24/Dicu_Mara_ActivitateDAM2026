package com.example.laboratorobiecte;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import androidx.appcompat.app.AppCompatActivity;

public class AdaugaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adauga);

        EditText etModel = findViewById(R.id.etModel);
        EditText etAutonomie = findViewById(R.id.etAutonomie);
        CheckBox cbCamera = findViewById(R.id.cbCamera);
        Spinner spinnerCuloare = findViewById(R.id.spinnerCuloare);
        RatingBar ratingBar = findViewById(R.id.ratingBar);
        Switch swPornita = findViewById(R.id.swPornita);
        Button btnSalveaza = findViewById(R.id.btnSalveaza);

        String[] culori = {"Alb", "Negru", "Gri", "Rosu"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, culori);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCuloare.setAdapter(adapter);

        btnSalveaza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String model = etModel.getText().toString();
                String autonomieStr = etAutonomie.getText().toString();
                int autonomie = autonomieStr.isEmpty() ? 0 : Integer.parseInt(autonomieStr);
                boolean cuCamera = cbCamera.isChecked();
                String culoare = spinnerCuloare.getSelectedItem().toString();
                float rating = ratingBar.getRating();
                boolean estePornita = swPornita.isChecked();

                Drona dronaNoua = new Drona(model, autonomie, cuCamera, culoare, rating, estePornita);

                Intent intentRezultat = new Intent();
                intentRezultat.putExtra("OBIECT_TRIMIS", dronaNoua);

                setResult(RESULT_OK, intentRezultat);
                finish();
            }
        });
    }
}