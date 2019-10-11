package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class MobilePhone {
    private ArrayList<Contacts> list;
    static Scanner in;

    public MobilePhone() {
        this.list = new ArrayList<>();
        this.in = new Scanner(System.in);
    }

    public void menu(){
        // quit, print contacts, add new contact, update existing contact, remove contact
        boolean exit = false;
        while(!exit) {
            System.out.println("Mobile Phone Menu \nPlease make a selection:");
            System.out.println("1: Quit");
            System.out.println("2: Print Contacts");
            System.out.println("3: Add New Contact");
            System.out.println("4: Update Contact");
            System.out.println("5: Remove Contact");
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();

            switch (choice) {
                case 2:
                    printContacts();
                    break;
                case 3:
                    addContact();
                    break;
                case 4:
                    updateContact();
                    break;
                case 5:
                    removeContact();
                    break;
                default:
                    System.out.println("Quitting....");
                    exit = true;
                    break;
            }
        }
        in.close();
    }

    public void printContacts(){
        System.out.println("You have "+list.size()+" Contacts:");
        for(Contacts contact: list){
            System.out.println(contact.getName()+": "+contact.getNumber());
        }
    }

    public void addContact(){
        System.out.println("*****Add Contact*****");
        System.out.println("Please enter name:");
        String name = in.next();
        if(contactExists(name)){
            System.out.println("Contact Already Exists!!");
        }else{
            System.out.println("Please enter number:");
            String number = in.next();
            Contacts contact = new Contacts(name, number);
            System.out.println("Adding new Contact: "+name+" with number: "+ number+"...");
            list.add(contact);
        }
    }

    public void updateContact(){
        System.out.println("*****Update Contact*****");
        System.out.println("Please Enter Name of Contact to Update:\n");
        String nameToUpdate = in.next();
        int contactIndex = findContact(nameToUpdate);
        if(contactExists(nameToUpdate)){
            System.out.println("Please Enter New Name:");
            list.get(contactIndex).setName(in.next());
            System.out.println("Please Enter New Number:");
            list.get(contactIndex).setNumber(in.next());
            System.out.println("Updating Contact...");
        }else{
            System.out.println("Contact Does Not Exist");
        }
    }

    public void removeContact(){
        System.out.println("*****Delete Contact*****");
        System.out.println("Please Enter Name of Contact to Delete:");
        String contactToDelete = in.next();
        int contactIndex = findContact(contactToDelete);
        if(contactExists(contactToDelete)){
            System.out.println("Removing: "+ contactToDelete+"...");
            list.remove(contactIndex);
        }else{
            System.out.println("Contact Does Not Exist");
        }
    }

    public ArrayList<Contacts> getList() {
        return list;
    }


    private int findContact(String searchContact){
       for(Contacts contact: list){
           if(searchContact.equalsIgnoreCase(contact.getName())){
           return list.indexOf(contact);
           }
       }
       return -1;
    }

    private boolean contactExists(String contactName){
        int position = findContact(contactName);
        if(position>=0){
            return true;
        }
        return false;
    }

}
