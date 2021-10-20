package com.example.menumakanan;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Menu2 extends AppCompatActivity {
    ImageView foto2;
    TextView n2,d2,h2;
    String nama, harga, deskripsi;
    Integer foto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_menu2);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Detail Makanan: ");

        //Integer foto = getIntent().getIntExtra("foto_makanan");
        nama = getIntent().getStringExtra("nama_makanan");
        harga = getIntent().getStringExtra("harga_makanan");
        deskripsi = getIntent().getStringExtra("deskripsi_makanan");

        setTitle("Detail Makanan: "+ nama);
        foto2 = findViewById(R.id.foto2);
        foto2.setImageResource(getIntent().getIntExtra("foto_makanan" , 0));
        n2 = findViewById(R.id.n2); n2.setText(nama);
        h2 = findViewById(R.id.h2); h2.setText("Harga: " + harga);
        d2 = findViewById(R.id.d2); d2.setText(deskripsi);

    }
    public boolean onOptionsItemSelected(MenuItem item){
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(intent, 0);
        return true;
    }
}
