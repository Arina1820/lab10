package com.company;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Main {
    //сохранение массива в список
    public static <E> void  intolistX  (String s, E [] mass){

        E [] some = mass;
        Massiv <E> intolistX = new Massiv <E> ();
        intolistX.setMass(some);
        for(int i = 0; i< intolistX.getLength(); i++)
            System.out.print(intolistX.getIndex(i)+" ");

        System.out.println();
    }

    //для вывода 5ти элементов
    public static <E> void  intolistX2  (String s, E [] mass){

        E [] some = mass;
        Massiv <E> intolistX2 = new Massiv <E> ();
        intolistX2.setMass(some);
        for(int i = 0; i< 5; i++)
            System.out.print(intolistX2.getIndex(i)+" ");

        System.out.println();
    }

    //для вывода каталога
    public static <E> void  intolistX3  (String s, E [] mass){

        E [] some = mass;
        Massiv <E> intolistX3 = new Massiv <E> ();
        intolistX3.setMass(some);
        for(int i = 0; i< intolistX3.getLength(); i++)
            System.out.println(" / "+intolistX3.getIndex(i)+" / ");

        System.out.println();
    }


    //содержимое каталога
    public static void Filelist(String path){
        File f = new File(path);
        String[] fmass = null;
        if (f.exists()||f.isDirectory()) {
            fmass = f.list(null);
            intolistX3("String",fmass);
        }
        else System.out.print("Папка не найдена");

    }


    public static void main(String[] args) {

        //добавление в список
        Double [] ad = {3.14,9.8,3400.0};
        intolistX("Double" , ad);

        //добавление с выводом 5ти элементов
        Integer [] intr = { 0,1,2,3,4,5,6,7,8,9};
        intolistX2("Integer" , intr);

        //вывод каталога
        Filelist("C:\\");


    }
}





/*System.out.println("Введите кол-во элементов массива:");
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for(int j = 0; j < i; j++){
            System.out.println("Введите " +(j+1)+"-й элемент");

            arrayList.add(scan.next());*/

/*
* // сохранение массива в список еще вариант
    public static <T> ArrayList<T> intomass(T[] mass){
        ArrayList<T> arrayList = new ArrayList<T>();

        for(T i:mass){//для каждого элемента массива
            arrayList.add(i);
        }
        return arrayList;
        }
* */



/*
*       //Доп для добавления в список и вывода 5ти элементов
        public static <T> void intomass2(T[] mass){
            ArrayList<T> arrayList = new ArrayList<T>();

            for(T i:mass){//для каждого элемента массива
                arrayList.add(i);
            }
            for(int i = 0; i<5; i++){
                System.out.println("Element #"+(i+1)+arrayList);}
        }
    //*/