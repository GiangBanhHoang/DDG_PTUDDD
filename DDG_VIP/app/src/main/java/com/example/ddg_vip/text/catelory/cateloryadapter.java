package com.example.ddg_vip.text.catelory;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ddg_vip.R;
import com.example.ddg_vip.text.bookadapter;

import java.util.List;

public class cateloryadapter extends RecyclerView.Adapter<cateloryadapter.Cteloryholdel> {

    private Context mcontext;
    private List<catelory> list;

    public cateloryadapter(Context context) {
        this.mcontext = context;
    }

    public void setdata(List<catelory> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public Cteloryholdel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.khoahoc1, parent, false);
        return new Cteloryholdel(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Cteloryholdel holder, int position) {
        catelory catelory = list.get(position);
        if (catelory == null) {
            return;
        }
        holder.tvcatelory.setText(catelory.getNameCatelory());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mcontext,RecyclerView.HORIZONTAL,false);
holder.rcvbook.setLayoutManager(linearLayoutManager);
        bookadapter bookadapter = new bookadapter();
        bookadapter.setdata(catelory.getBooks());
        holder.rcvbook.setAdapter(bookadapter);
    }

    @Override
    public int getItemCount() {
        if (list == null) {
            return list.size();
        }
        return 0;
    }

    public static class Cteloryholdel extends RecyclerView.ViewHolder {
        public TextView tvcatelory;
        public RecyclerView rcvbook;

        public Cteloryholdel(@NonNull View itemView) {

            super(itemView);
            tvcatelory = itemView.findViewById(R.id.tvkhoahoc1);
            rcvbook = itemView.findViewById(R.id.rcv1);
        }
    }
}
