package com.example.associations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.MotionLayout;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends AppCompatActivity {

    int counter;
    boolean f;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button btn = findViewById(R.id.next);
        Button exit = findViewById(R.id.exit);
        Button con = findViewById(R.id.con);
        Button res = findViewById(R.id.restart);
        TextView c1 = findViewById(R.id.check1);
        TextView t1 = findViewById(R.id.title1);
        TextView c2 = findViewById(R.id.check2);
        TextView t2 = findViewById(R.id.title2);
        TextView c3 = findViewById(R.id.check3);
        TextView t3 = findViewById(R.id.title3);
        TextView c4 = findViewById(R.id.check4);
        TextView t4 = findViewById(R.id.title4);
        TextView c5 = findViewById(R.id.check5);
        TextView t5 = findViewById(R.id.title5);
        TextView c6 = findViewById(R.id.check6);
        TextView t6 = findViewById(R.id.title6);
        TextView c7 = findViewById(R.id.check7);
        TextView t7 = findViewById(R.id.title7);
        TextView c8 = findViewById(R.id.check8);
        TextView t8 = findViewById(R.id.title8);
        TextView winner = findViewById(R.id.textView6);
        TextView textView = findViewById(R.id.textView2);
        MotionLayout motionLayout = findViewById(R.id.motion_container);


        String[] name_t = (String[]) getIntent().getSerializableExtra("name_team");
        int count = (int) getIntent().getSerializableExtra("Count");

        switch (count){
            case 2:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.GONE);
                c4.setVisibility(View.GONE);
                c5.setVisibility(View.GONE);
                c6.setVisibility(View.GONE);
                c7.setVisibility(View.GONE);
                c8.setVisibility(View.GONE);
                break;
            case 3:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.VISIBLE);
                c4.setVisibility(View.GONE);
                c5.setVisibility(View.GONE);
                c6.setVisibility(View.GONE);
                c7.setVisibility(View.GONE);
                c8.setVisibility(View.GONE);
                break;
            case 4:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.VISIBLE);
                c4.setVisibility(View.VISIBLE);
                c5.setVisibility(View.GONE);
                c6.setVisibility(View.GONE);
                c7.setVisibility(View.GONE);
                c8.setVisibility(View.GONE);
                break;
            case 5:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.VISIBLE);
                c4.setVisibility(View.VISIBLE);
                c5.setVisibility(View.VISIBLE);
                c6.setVisibility(View.GONE);
                c7.setVisibility(View.GONE);
                c8.setVisibility(View.GONE);
                break;
            case 6:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.VISIBLE);
                c4.setVisibility(View.VISIBLE);
                c5.setVisibility(View.VISIBLE);
                c6.setVisibility(View.VISIBLE);
                c7.setVisibility(View.GONE);
                c8.setVisibility(View.GONE);
                break;
            case 7:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.VISIBLE);
                c4.setVisibility(View.VISIBLE);
                c5.setVisibility(View.VISIBLE);
                c6.setVisibility(View.VISIBLE);
                c7.setVisibility(View.VISIBLE);
                c8.setVisibility(View.GONE);
                break;
            case 8:
                c1.setVisibility(View.VISIBLE);
                c2.setVisibility(View.VISIBLE);
                c3.setVisibility(View.VISIBLE);
                c4.setVisibility(View.VISIBLE);
                c5.setVisibility(View.VISIBLE);
                c6.setVisibility(View.VISIBLE);
                c7.setVisibility(View.VISIBLE);
                c8.setVisibility(View.VISIBLE);
                break;
        }

        switch (count){
            case 2:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                break;
            case 3:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.GONE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                t3.setText(name_t[2]);
                break;
            case 4:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.GONE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                t3.setText(name_t[2]);
                t4.setText(name_t[3]);
                break;
            case 5:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.GONE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                t3.setText(name_t[2]);
                t4.setText(name_t[3]);
                t5.setText(name_t[4]);
                break;
            case 6:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.GONE);
                t8.setVisibility(View.GONE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                t3.setText(name_t[2]);
                t4.setText(name_t[3]);
                t5.setText(name_t[4]);
                t6.setText(name_t[5]);
                break;
            case 7:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.GONE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                t3.setText(name_t[2]);
                t4.setText(name_t[3]);
                t5.setText(name_t[4]);
                t6.setText(name_t[5]);
                t7.setText(name_t[6]);
                break;
            case 8:
                t1.setVisibility(View.VISIBLE);
                t2.setVisibility(View.VISIBLE);
                t3.setVisibility(View.VISIBLE);
                t4.setVisibility(View.VISIBLE);
                t5.setVisibility(View.VISIBLE);
                t6.setVisibility(View.VISIBLE);
                t7.setVisibility(View.VISIBLE);
                t8.setVisibility(View.VISIBLE);
                t1.setText(name_t[0]);
                t2.setText(name_t[1]);
                t3.setText(name_t[2]);
                t4.setText(name_t[3]);
                t5.setText(name_t[4]);
                t6.setText(name_t[5]);
                t7.setText(name_t[6]);
                t8.setText(name_t[7]);
                break;
        }

       int[] point = (int[]) getIntent().getSerializableExtra("point");

        c1.setText(Integer.toString(point[0]));
        c2.setText(Integer.toString(point[1]));
        c3.setText(Integer.toString(point[2]));
        c4.setText(Integer.toString(point[3]));
        c5.setText(Integer.toString(point[4]));
        c6.setText(Integer.toString(point[5]));
        c7.setText(Integer.toString(point[6]));
        c8.setText(Integer.toString(point[7]));

//        String a = "Военнослужащий Конвоир Пожарный Разведчик Спасатель Телохранитель Верстальщик Редактор Дата-журналист Журналист Издатель Корректор Переплетчик Печатник Редактор Фальцовщик Администратор Аналитик Блогер Разработчик Диктор Контент-менеджер Копирайтер Радиоведущий Инженер Спичрайтер Тележурналист Тестировщик Акушер Анестезиолог Врач-диетолог Генетик Дерматолог Иммунолог Кардиолог Кардиохирург Косметолог Лаборант Логопед Массажист Медсестра Невропатолог Нейрохирург Онколог Офтальмолог Педиатр Психолог Психотерапевт Стоматолог Терапевт Фармацевт Философ Химик Эколог Воспитатель Педагог Преподаватель Ректор Учитель Булочник Винодел Дегустатор Диетолог Мясник Пекарь Повар Повар-кондитер Шеф-повар";
//        String[] b = a.split(" ");


        DBHelper dbHelper  = new DBHelper(this);
        SQLiteDatabase database = dbHelper.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        counter = (int) getIntent().getSerializableExtra("counter");
        f = false;

        btn.setOnClickListener(v ->{
//        for(int i = 0;i < b.length;i++) {
//            contentValues.put(DBHelper.KEY_CATEGORY, "Профессии");
//            contentValues.put(DBHelper.KEY_WORD, b[i]);
//            database.insert(DBHelper.TABLE_CONTACTS, null, contentValues);
//        }


           // database.delete(DBHelper.TABLE_CONTACTS, "category = ?" ,new String[]{"Профессии"});
            counter++;

            if(counter >= count) {
                counter = 0;
            }


            String category = (String) getIntent().getSerializableExtra("cat");

            Intent intent = new Intent(Main.this, Game.class);
            intent.putExtra("cat", category);
            intent.putExtra("name_team", name_t);
            intent.putExtra("count", count);
            intent.putExtra("counter", counter);
            intent.putExtra("point", point);

            startActivity(intent);

        });

        con.setOnClickListener(v ->{
            motionLayout.transitionToStart();
        });
        res.setOnClickListener(v ->{
            Intent intent = new Intent(Main.this, MainActivity.class);
            startActivity(intent);
        });

        exit.setEnabled(true);
        exit.setOnClickListener(v -> {
            String winners = "";
            String winnersId = "";

            int max = 0;
            for (int i = 0; i < point.length; i++) {
                if (point[i] >= max) {
                    max = point[i];
                }
            }
            for (int i = 0; i < point.length; i++) {
                if (point[i] == max) {

                    winnersId += i + " ";
                }
            }

            String[] id = winnersId.split(" ");
            for (int i = 0; i < id.length; i++) {

                if (id.length > 0) {
                    textView.setText("Победили команды:");
                }
                winners += name_t[Integer.parseInt(id[i])] + "    ";

            }
            winner.setText(winners);
            motionLayout.transitionToEnd();


        });
    }
    @Override
    public void onBackPressed() {

    }

}