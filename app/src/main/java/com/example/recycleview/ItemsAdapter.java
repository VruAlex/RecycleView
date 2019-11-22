package com.example.recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ItemsAdapter  extends RecyclerView.Adapter<ItemsAdapter.MyViewHolder> {
    private List<Items> itemsList;

    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title, name , date;
        ImageView imageView;

        MyViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.img);
            title = view.findViewById(R.id.Title);
            name = view.findViewById(R.id.Name);
            date = view.findViewById(R.id.Date);
        }
    }

    ItemsAdapter(List<Items> itemsList){
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ItemsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new ItemsAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemsAdapter.MyViewHolder holder, int position){
        Items movie = itemsList.get(position);
        holder.imageView.setImageResource(movie.getScreenImg());
        holder.title.setText(movie.getTitle());
        holder.name.setText(movie.getName());
        holder.date.setText(movie.getDate());
    }

    @Override
    public int getItemCount(){
        return itemsList.size();
    }
}