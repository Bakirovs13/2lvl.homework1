package com.company;

public class Grandfather {
    private int age ;
    private HobbiesEnum hobbies;
    private Home home;
    private String name;

    public int getAge() {
        return age;
    }

    public HobbiesEnum getHobbies() {
        return hobbies;
    }

    public Home getHome() {
        return home;
    }

    public String getName() {
        return name;
    }

    public Grandfather(String name, int age, HobbiesEnum hobbies, Home home) {
        this.age = age;
        this.hobbies = hobbies;
        this.home = home;
        this.name = name;
    }

    public String getInfo(){
        if (home != null){
            return  "\nName: "+name+
                    "\nAge: " + age +
                    "\nHobbies: " + hobbies +
                    "\nHome address: " + home.getAddress();
        }else {
            return "\nAge: " + age +
                    "\nHobbies: " + hobbies;


        }}}

