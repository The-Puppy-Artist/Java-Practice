package com.mycompany._javaclasses;

public class MyContact {
    private String name;
    int age; // automatic private
    private int phoneNumber;
    
    public MyContact(String name,int age,int phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
    
    public MyContact(){
        this("John Dela Cruz",30,192168001);
    }
    
    public void printName(){
        System.out.printf("%10s (%d): %d\n", 
                name, this.age, this.phoneNumber);
    }
    
    public void increaseAge(){
        this.age++;
    }
    
    
    public static void main(String[] args) {
        MyContact c1 = new MyContact("Hi",30,0); 
        MyContact c2 = c1; // age=30
        c1.increaseAge();
        c2.increaseAge();
        c1.printName();
        c2.printName();
    }
}
