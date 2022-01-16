package com.example.associations;

import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Game extends AppCompatActivity {

    int i;
    String l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        TextView text = findViewById(R.id.word);
        TextView nameTeam = findViewById(R.id.name_team);
        TextView timer = findViewById(R.id.timer);
        Button yes = findViewById(R.id.yes);
        Button no = findViewById(R.id.no);


        DBHelper dbHelper = new DBHelper(this);
        SQLiteDatabase database = dbHelper.getReadableDatabase();
        ContentValues contentValues = new ContentValues();

        ArrayList massWord = new ArrayList<String>();
        String category = (String) getIntent().getSerializableExtra("cat");

        Cursor cursor = database.query(DBHelper.TABLE_CONTACTS,null,"category = ?" ,new String[]{category},null,null,null);

        if(cursor.moveToFirst()){
            int Word = cursor.getColumnIndex(DBHelper.KEY_WORD);
                do { massWord.add(cursor.getString(Word));
            } while (cursor.moveToNext());
        }
        else{
            text.setText("Что-то пошло не так");
        }
        cursor.close();

        Random rnd = new Random();

        i = rnd.nextInt(massWord.size());
        l = (String) massWord.get(i);
        text.setText(l);

        int count = (int) getIntent().getSerializableExtra("count");



        String[] name_team = (String[]) getIntent().getSerializableExtra("name_team");
        int counter = (int) getIntent().getSerializableExtra("counter");

        nameTeam.setText(name_team[counter]);

        int[] point = (int[]) getIntent().getSerializableExtra("point");


        yes.setOnClickListener(v ->{
            i = rnd.nextInt(massWord.size());
            l = (String) massWord.get(i);
            text.setText(l);
            point[counter]++;
        });
        no.setOnClickListener(v ->{
            i = rnd.nextInt(massWord.size());
            l = (String) massWord.get(i);
            text.setText(l);
        });

        Intent intent = new Intent(Game.this, Main.class);
        intent.putExtra("cat", category);
        intent.putExtra("name_team", name_team);
        intent.putExtra("Count", count);
        intent.putExtra("counter", counter);

        int[] t = new int[]{1, 2, 3};

        CountDownTimer countTimer = new CountDownTimer(10*1000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timer.setText(Integer.toString((int) millisUntilFinished / 1000));
                for (int i = 0; i < t.length;i++) {
                    if (millisUntilFinished / 1000 == t[i]) {
                        timer.setTextColor(Color.parseColor("#CD3737"));
                        timer.setTextSize(30);
                    }
                }
            }

            @Override
            public void onFinish() {
                intent.putExtra("point", point);
                startActivity(intent);
            }
        }.start();

    }
    @Override
    public void onBackPressed() {

    }
}