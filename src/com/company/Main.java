package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("Smith family:  \n");


        Grandfather grandfather = new Grandfather("David",60,HobbiesEnum.PLAYING_CHESS,new Home("baker street 221b"));

        System.out.println("Grandfather: " +grandfather.getInfo());

        System.out.println("");

        Father father = new Father("Mike",35,"Programmer",HobbiesEnum.CODING,new Home("baker street 220b"));
        System.out.println("Father: " +father.getInfo());
        father.FatherisBusy("Mike is working as a programmer ");

        System.out.println("");

        Son son1 = new Son("Peter",16,"Student",HobbiesEnum.COOKING,new Home("baker street 220b"));
        System.out.println("Son(Peter):"+ son1.getInfo());
        son1.FatherisBusy("Peter is working  as a referee in Football federation");



        System.out.println("");

        Son son = new Son("Martin",22,"Consultant",HobbiesEnum.DRAWING,new Home("baker street 219b"));
        System.out.println("Son(Martin):"+ son.getInfo());
        son.FatherisBusy("Martin is working as a consultant");
        System.out.println("___________copy method_____________");
        son.copy();
        System.out.println("");
        son1.copy1();




    }
    }

