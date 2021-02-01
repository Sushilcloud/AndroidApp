package com.example.shiva.daburemployee;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    private List<fruit> fruits=new ArrayList<>();

    public RecyclerAdapter(List<fruit>fruits)
    {
        this.fruits=fruits;
    }



    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item,parent,false);


        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder viewHolder, int position) {

        viewHolder.FruitName.setText(fruits.get(position).getFruit_name());
        viewHolder.FruitImage.setImageResource(fruits.get(position).getFruit_image_id());





    }

    @Override
    public int getItemCount() {
        return fruits.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder
    {
        ImageView FruitImage;
        TextView FruitName;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            FruitImage=itemView.findViewById(R.id.fruitalbum);
            FruitName=itemView.findViewById(R.id.fruitname);

        }



    }

    private interface OnNoteListener{
        void onNoteClick(int position);
    }

}
