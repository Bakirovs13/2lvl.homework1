package com.company;

public class Father extends Grandfather{

    private String Job;


    public String getJob() {
        return Job;
    }

    public Father(String name, int age, String Job, HobbiesEnum hobbies, Home home) {
        super(name, age, hobbies, home);
        this.Job = Job;





    }
    public void FatherisBusy(String working){
        System.out.println(working);
    }

    final public void FatherisBusy(){
        System.out.println("Father is reading");
    }






    @Override
    public String getInfo() {
        return super.getInfo()+
                "\nJob :" +Job;


    }
}
