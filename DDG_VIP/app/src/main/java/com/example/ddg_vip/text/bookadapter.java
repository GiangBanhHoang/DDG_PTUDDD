package com.example.ddg_vip.text;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ddg_vip.R;

import java.util.List;

public class bookadapter extends RecyclerView.Adapter<bookadapter.bookview>{

    private List<book> books1;
    public void setdata(List<book> list){
        this.books1 = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public bookview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.khoahoc,parent,false);

        return new bookview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bookview holder, int position) {
        book books = books1.get(position);
        if(books == null)
        {
            return;
        }
        holder.imagebook.setImageResource(books.getId());
        holder.textbook.setText(books.getTitle());


    }

    @Override
    public int getItemCount() {
        if(books1 != null )
        {
            return books1.size();
        }
        return 0;
    }

    public class bookview extends RecyclerView.ViewHolder{

        public ImageView imagebook;
        public TextView textbook;

        public bookview(@NonNull View itemView) {
            super(itemView);
            imagebook = itemView.findViewById(R.id.imkhoahoc);
            textbook = itemView.findViewById(R.id.tvkhoahoc);
        }
    }
}
