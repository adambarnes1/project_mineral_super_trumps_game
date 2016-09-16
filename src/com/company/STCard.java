package com.company;


import java.util.ArrayList;

public class STCard extends ArrayList<STCard> {
//public class STCard{

    int id;
    public STCard(int id) {
        this.id= id;

    }

    public String toString(){
    return "id" + id;
}
}
