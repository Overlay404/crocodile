package com.example.associations;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        Button c1 = findViewById(R.id.category1);
        Button c2 = findViewById(R.id.category2);
        Button c3 = findViewById(R.id.category3);
        Button c4 = findViewById(R.id.category4);
        Button c5 = findViewById(R.id.category5);
        Button c6 = findViewById(R.id.category6);
        Button c7 = findViewById(R.id.category7);
        Button c8 = findViewById(R.id.category8);

        String[] name_team = (String[]) getIntent().getSerializableExtra("name_team");
        int count = (int) getIntent().getSerializableExtra("Count");
        int[] point = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

        Intent intent = new Intent(Category.this, Main.class);
        intent.putExtra("name_team", name_team);
        intent.putExtra("Count", count);
        intent.putExtra("point", point);
        intent.putExtra("counter", -1);

        c1.setOnClickListener(v ->{
            intent.putExtra("cat", "Животные");
            startActivity(intent);
        });
        c2.setOnClickListener(v ->{
            intent.putExtra("cat", "Профессии");
            startActivity(intent);
        });
        c3.setOnClickListener(v ->{
            intent.putExtra("cat", "Вещи");
            startActivity(intent);
        });
        c4.setOnClickListener(v ->{
            intent.putExtra("cat", "Компьютерные игры");
            startActivity(intent);
        });
        c5.setOnClickListener(v ->{
            intent.putExtra("cat", "Спорт");
            startActivity(intent);
        });
        c6.setOnClickListener(v ->{
            intent.putExtra("cat", "Певцы");
            startActivity(intent);
        });
        c7.setOnClickListener(v ->{
            intent.putExtra("cat", "Актёры");
            startActivity(intent);
        });
        c8.setOnClickListener(v ->{
            intent.putExtra("cat", "Разное");
            startActivity(intent);
        });
    }
    @Override
    public void onBackPressed() {
    }
}