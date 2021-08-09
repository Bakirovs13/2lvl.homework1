package com.company;

public class Son extends Father{

//    @Override
//    public String getInfo() {
//        return super.getInfo();
//
//    }


    @Override
    public void FatherisBusy(String working) {
        super.FatherisBusy(working);
    }

    public Son(String name, int age, String Job, HobbiesEnum hobbies, Home home) {
        super(name, age, Job, hobbies, home);

    }


    public void copy(){
        System.out.println("Name: " + getName() +
                "\nAge: " + getAge()+
                "\nHobby : " + HobbiesEnum.COOKING);

    }
    public void copy1(){
        System.out.println("Name: " + getName() +
                "\nAge: " + getAge()+
                "\nHobby : " + HobbiesEnum.DRAWING);
    }




}
