package com.example.menumakanan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recMenu;
    private ArrayList<Menu> menumakanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recMenu = findViewById(R.id.m);
        initData();

        recMenu.setAdapter(new MenuAdapter(menumakanan, this));
        recMenu.setLayoutManager(new LinearLayoutManager(this));
    }

    private void initData(){
        this.menumakanan = new ArrayList<>();
        menumakanan.add(new Menu( "Ketoprak",
                "Makanan Indonesia yang berisi ketupat.",
                "15.000",
                R.drawable.ketoprak));

        menumakanan.add(new Menu( "Bubur Ayam",
                "Beras yang dimasak dengan air yg banyak.",
                "10.000",
                R.drawable.bubur));

        menumakanan.add(new Menu( "Kerak Telor",
                "Makanan ini berasal dari betawi.",
                "15.000",
                R.drawable.keraktelor));

        menumakanan.add(new Menu( "Soto Daging",
                "Makanan Indonesia yg terbuat dari kaldu.",
                "25.000",
                R.drawable.sotodaging));

        menumakanan.add(new Menu( "Bakso",
                "Bakso terbuat dari daging sapi giling.",
                "15.000",
                R.drawable.bakso));
    }
}