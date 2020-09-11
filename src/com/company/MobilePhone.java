package com.company;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> phoneContacts = new ArrayList<Contacts>();


//INT - return position
    public int findContact(String searchable){
        for(int i = 0; i<phoneContacts.size(); i++){
            if(phoneContacts.get(i).getName().equals(searchable)){
                return i;
            };
            if(phoneContacts.get(i).getPhoneNumber().equals(searchable)){
                return i;
            };
        }
        return -1;
    }

//Bool - check if exists
//Contact - return searched contact or "does not exist"
//Remove Contact
//modify existing contact
//print all contacts
    public void printContacts(){
        System.out.println("Contacts saved on phone:");
        for (int i = 0; i<phoneContacts.size(); i++){
            System.out.println(i+1 + ". " + phoneContacts.get(i).getName() + ": " + phoneContacts.get(i).getPhoneNumber());
        }
    }

//add contact
    public void addContact(String name, String number){
        phoneContacts.add(Contacts.createContacts(name,number));
    }


}
