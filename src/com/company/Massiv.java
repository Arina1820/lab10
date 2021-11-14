package com.company;


public class Massiv <E> {
    private E [] mass;

    public E getIndex(int i){
        return  mass[i] ;
    }

    public void setMass( E [] mass){
        this.mass =  mass;
    }

    public int getLength(){
        return  mass.length ;
    }



}