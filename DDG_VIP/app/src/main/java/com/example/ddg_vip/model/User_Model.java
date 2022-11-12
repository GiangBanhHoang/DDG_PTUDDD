package com.example.ddg_vip.model;

import com.example.ddg_vip.class_DDG.User;

import java.util.ArrayList;
import java.util.Iterator;

public class User_Model {
    private static ArrayList<User> items;

    public static ArrayList<User> getItems() {
        if (items == null) {
            items = new ArrayList<User>();
            items.add(new User(1,"giang", "gialai","123","hoanggiang","9-9-2001","nam","giang@gmail.com","0123456789","quan ly",
                    null,10000000,null));
        }
        return items;
    }

    public static String getNameByID(String ID) {
        if(items==null){
            getItems();
        }
        Iterator<User> itr = items.iterator();
        while (itr.hasNext()) {
            User Curent = itr.next();
            if (Curent.getIdUser().equals(Curent.getIdUser()))
                return Curent.getFullName();
        }
        return null;
    }
}

