package com.example.ddg_vip.text.catelory;

import com.example.ddg_vip.text.book;

import java.util.List;

public class catelory {
    private String nameCatelory;
    private List<book> books;

    public catelory(String nameCatelory, List<book> books) {
        this.nameCatelory = nameCatelory;
        this.books = books;
    }

    public String getNameCatelory() {
        return nameCatelory;
    }

    public void setNameCatelory(String nameCatelory) {
        this.nameCatelory = nameCatelory;
    }

    public List<book> getBooks() {
        return books;
    }

    public void setBooks(List<book> books) {
        this.books = books;
    }
}
