package com.mycompany._javaclasses;

import com.mycompany.another.MyGenerator;

class ContactPrinter{
    private MyContact contacts[];
    public ContactPrinter(MyContact contacts[]){
        this.contacts = contacts;
    }
    public void print(){
        for(MyContact c: contacts)
            c.printName();
    }
}

public class MyMain {
    
    public static void main(String[] args) {
        // Array of classes
        MyContact contactsA[] = new MyContact[]{
            new MyContact("Mark Marky", 12, 91212),
            new MyContact(),
            new MyContact("John Smith", 42, 1721),
            new MyContact("Joe Jordan", 27, 1111)
        };
        int listSize = contactsA.length*2;
        MyContact contactsB[] = new MyContact[listSize];
        for(int i=0;i<contactsA.length; i++){
            contactsB[i] = contactsA[i];
            contactsB[i+contactsA.length] = contactsA[i];
            contactsB[i+contactsA.length].increaseAge();
        }
        
        // Using static methods
        int select = MyGenerator.generateRandBetween(1,listSize);
        System.out.print("Index "+select+":: ");
        contactsB[select].printName();
        
        ContactPrinter pr = new ContactPrinter(contactsB);
        pr.print();
    }
}
