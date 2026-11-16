package com.example.laboratorobiecte;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        ListView listView = findViewById(R.id.listViewDrone);
        ArrayList<Drona> lista = MainActivity.listaDrone;

        ArrayAdapter<Drona> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        listView.setAdapter(adapter);

        // Cerinta 3: Click simplu -> Toast
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Drona dronaSelectata = lista.get(position);
                Toast.makeText(Activity3.this, dronaSelectata.toString(), Toast.LENGTH_LONG).show();
            }
        });

        // Cerinta 4: Long Click -> Sterge
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                lista.remove(position);
                adapter.notifyDataSetChanged();
                Toast.makeText(Activity3.this, "Drona a fost stearsa!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}