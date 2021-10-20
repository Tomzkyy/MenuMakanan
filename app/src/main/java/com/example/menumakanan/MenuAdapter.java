package com.example.menumakanan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuAdapter extends RecyclerView.Adapter <MenuAdapter.ViewHolder> {


    private Context context;
    private final ArrayList<Menu> menumakanan;



    public MenuAdapter(ArrayList<Menu> menumakanan, Context context) {

        this.context = context;
        this.menumakanan = menumakanan;
    }

    @NonNull
    @Override
    public MenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        ViewHolder holder = new ViewHolder(inflater.inflate(R.layout.item_menu, parent, false));

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapter.ViewHolder holder, @SuppressLint("RecyclerView") final int position) {
        Menu menu = menumakanan.get(position);
        holder.n.setText(menu.getNama());
        holder.h.setText(menu.getHarga());
        holder.foto.setImageResource(menu.getId_gambar());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(holder.itemView.getContext(), menu.getNama(), Toast.LENGTH_LONG).show();
                //Toast.makeText(holder.itemView.getContext(), menu.getHarga(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent((Context) context, Menu2.class);

                intent.putExtra("nama_makanan", menu.getNama());
                intent.putExtra("harga_makanan", menu.getHarga());
                intent.putExtra("deskripsi_makanan", menu.getDeskripsi());
                intent.putExtra("foto_makanan", menu.getId_gambar());

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return menumakanan.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView n,h;
        public ImageView foto;
        public ConstraintLayout itemView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            n = (TextView) itemView.findViewById(R.id.n);
            h = (TextView) itemView.findViewById(R.id.h);
            foto = (ImageView) itemView.findViewById(R.id.foto);
            this.itemView = (ConstraintLayout) itemView.findViewById(R.id.menuLayout);
        }
    }
}
