package com.example.ddg_vip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.ddg_vip.text.book;
import com.example.ddg_vip.text.catelory.catelory;
import com.example.ddg_vip.text.catelory.cateloryadapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    public cateloryadapter cateloryadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);}
//        recyclerView = findViewById(R.id.rcv1);
//        cateloryadapter = new cateloryadapter(this);
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
//        recyclerView.setLayoutManager(linearLayoutManager);
//        cateloryadapter.setdata(getlistcatelory());
//        recyclerView.setAdapter(cateloryadapter);
//    }

//        DBHelper dbHelper = new DBHelper(this);
//        SQLiteDatabase database = dbHelper.getReadableDatabase();
//        database.close();
//    private List<catelory> getlistcatelory() {
//        List<catelory> list = new ArrayList<>();
//
//        List<book> listbooks = new ArrayList<>();
//        listbooks.add(new book(R.drawable.c_plus_plus, "book1"));
//        listbooks.add(new book(R.drawable.c_sharp, "book2"));
//        listbooks.add(new book(R.drawable.c_plus_plus, "book3"));
//        listbooks.add(new book(R.drawable.c_sharp, "book4"));
//
//        listbooks.add(new book(R.drawable.c_plus_plus, "book1"));
//        listbooks.add(new book(R.drawable.c_sharp, "book2"));
//        listbooks.add(new book(R.drawable.c_plus_plus, "book3"));
//        listbooks.add(new book(R.drawable.c_sharp, "book4"));
//
//        list.add(new catelory("catelory1", listbooks));
//        list.add(new catelory("catelory1", listbooks));
//        list.add(new catelory("catelory1", listbooks));
//        list.add(new catelory("catelory1", listbooks));
//        return list;
//    }
}