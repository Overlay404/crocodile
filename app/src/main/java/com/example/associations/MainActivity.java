package com.example.associations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[] name_team;
    String[] mass = {"2","3","4","5","6","7","8"};
    int count = 2;
    boolean f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = findViewById(R.id.spinner);
        Button but = findViewById(R.id.bt_category);
        EditText team1 = findViewById(R.id.team1);
        EditText team2 = findViewById(R.id.team2);
        EditText team3 = findViewById(R.id.team3);
        EditText team4 = findViewById(R.id.team4);
        EditText team5 = findViewById(R.id.team5);
        EditText team6 = findViewById(R.id.team6);
        EditText team7 = findViewById(R.id.team7);
        EditText team8 = findViewById(R.id.team8);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this , android.R.layout.simple_spinner_item, mass);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                // Получаем выбранный объект
                String item = (String)parent.getItemAtPosition(position);
                count = Integer.parseInt(item);
                name_team = new String[count];

                switch (count){
                    case 2:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.GONE);
                        team4.setVisibility(View.GONE);
                        team5.setVisibility(View.GONE);
                        team6.setVisibility(View.GONE);
                        team7.setVisibility(View.GONE);
                        team8.setVisibility(View.GONE);
                        break;
                    case 3:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.VISIBLE);
                        team4.setVisibility(View.GONE);
                        team5.setVisibility(View.GONE);
                        team6.setVisibility(View.GONE);
                        team7.setVisibility(View.GONE);
                        team8.setVisibility(View.GONE);
                        break;
                    case 4:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.VISIBLE);
                        team4.setVisibility(View.VISIBLE);
                        team5.setVisibility(View.GONE);
                        team6.setVisibility(View.GONE);
                        team7.setVisibility(View.GONE);
                        team8.setVisibility(View.GONE);
                        break;
                    case 5:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.VISIBLE);
                        team4.setVisibility(View.VISIBLE);
                        team5.setVisibility(View.VISIBLE);
                        team6.setVisibility(View.GONE);
                        team7.setVisibility(View.GONE);
                        team8.setVisibility(View.GONE);
                        break;
                    case 6:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.VISIBLE);
                        team4.setVisibility(View.VISIBLE);
                        team5.setVisibility(View.VISIBLE);
                        team6.setVisibility(View.VISIBLE);
                        team7.setVisibility(View.GONE);
                        team8.setVisibility(View.GONE);
                        break;
                    case 7:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.VISIBLE);
                        team4.setVisibility(View.VISIBLE);
                        team5.setVisibility(View.VISIBLE);
                        team6.setVisibility(View.VISIBLE);
                        team7.setVisibility(View.VISIBLE);
                        team8.setVisibility(View.GONE);
                        break;
                    case 8:
                        team1.setVisibility(View.VISIBLE);
                        team2.setVisibility(View.VISIBLE);
                        team3.setVisibility(View.VISIBLE);
                        team4.setVisibility(View.VISIBLE);
                        team5.setVisibility(View.VISIBLE);
                        team6.setVisibility(View.VISIBLE);
                        team7.setVisibility(View.VISIBLE);
                        team8.setVisibility(View.VISIBLE);
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        };

        spinner.setOnItemSelectedListener(itemSelectedListener);


        f = false;

        but.setOnClickListener(v -> {
            switch (count){
                case 2:
                    if (!team1.getText().toString().equals("") && !team2.getText().toString().equals("")) {
                        f = true;
                    } else {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }
                    name_team[0] = team1.getText().toString();
                    name_team[1] = team2.getText().toString();


                    break;
                case 3:
                    if(team1.getText().toString().equals("") && team2.getText().toString().equals("") && team3.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }else{
                        f = true;
                    }
                        name_team[0] = team1.getText().toString();
                        name_team[1] = team2.getText().toString();
                        name_team[2] = team3.getText().toString();

                    break;
                case 4:
                    if(team1.getText().toString().equals("") && team2.getText().toString().equals("") && team3.getText().toString().equals("") && team4.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }else{
                        f = true;
                    }
                        name_team[0] = team1.getText().toString();
                        name_team[1] = team2.getText().toString();
                        name_team[2] = team3.getText().toString();
                        name_team[3] = team4.getText().toString();

                    break;
                case 5:
                    if(team1.getText().toString().equals("") && team2.getText().toString().equals("") && team3.getText().toString().equals("") && team4.getText().toString().equals("") && team5.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }else{
                        f = true;
                    }
                        name_team[0] = team1.getText().toString();
                        name_team[1] = team2.getText().toString();
                        name_team[2] = team3.getText().toString();
                        name_team[3] = team4.getText().toString();
                        name_team[4] = team5.getText().toString();

                    break;
                case 6:
                    if(team1.getText().toString().equals("") && team2.getText().toString().equals("") && team3.getText().toString().equals("") && team4.getText().toString().equals("") && team5.getText().toString().equals("") && team6.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }else{
                        f = true;
                    }
                        name_team[0] = team1.getText().toString();
                        name_team[1] = team2.getText().toString();
                        name_team[2] = team3.getText().toString();
                        name_team[3] = team4.getText().toString();
                        name_team[4] = team5.getText().toString();
                        name_team[5] = team6.getText().toString();

                    break;
                case 7:
                    if(team1.getText().toString().equals("") && team2.getText().toString().equals("") && team3.getText().toString().equals("") && team4.getText().toString().equals("") && team5.getText().toString().equals("") && team6.getText().toString().equals("") && team7.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }else{
                        f = true;
                    }
                        name_team[0] = team1.getText().toString();
                        name_team[1] = team2.getText().toString();
                        name_team[2] = team3.getText().toString();
                        name_team[3] = team4.getText().toString();
                        name_team[4] = team5.getText().toString();
                        name_team[5] = team6.getText().toString();
                        name_team[6] = team7.getText().toString();

                    break;
                case 8:
                    if(team1.getText().toString().equals("") && team2.getText().toString().equals("") && team3.getText().toString().equals("") && team4.getText().toString().equals("") && team5.getText().toString().equals("") && team6.getText().toString().equals("") && team7.getText().toString().equals("") && team8.getText().toString().equals("")) {
                        Toast.makeText(getApplicationContext(), "Введите название команд", Toast.LENGTH_SHORT).show();
                        f = false;
                    }else{
                        f = true;
                    }
                        name_team[0] = team1.getText().toString();
                        name_team[1] = team2.getText().toString();
                        name_team[2] = team3.getText().toString();
                        name_team[3] = team4.getText().toString();
                        name_team[4] = team5.getText().toString();
                        name_team[5] = team6.getText().toString();
                        name_team[6] = team7.getText().toString();
                        name_team[7] = team8.getText().toString();

                    break;
            }


            if(f) {
                Intent intent = new Intent(MainActivity.this, Category.class);
                intent.putExtra("name_team", name_team);
                intent.putExtra("Count", count);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed() {
    }
}