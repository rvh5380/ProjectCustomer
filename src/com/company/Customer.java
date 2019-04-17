package com.company;

/*
Project: Team Project Design: Car Dealership Create the Java Classes
Purpose Details: Sales Lead Java Class
Course: IST 242
Team:  4
Date Developed: 02/17/2019
Last Date Changed: 04/17/2019
Rev:
*/

import java.util.ArrayList;

public class Customer {
    //---- Data Members ----//

    //Name
    private int customerId;
    private String First;
    private String Last;
    private String phone;

    //Car
    private String preference;


    //---- Method Members ----//

    //--Name--//

    public Customer(int _customerId) {
        this. customerId = _customerId;  //Increments the ID count
    }

    //Setter and Getter for CustomerID
    public int getCustomerId() { return customerId; }
    public void setCustomerId(int _customerId) {this.customerId = _customerId;}

    //Setter and Getter for First
    public String getFirst() {
        return First;
    }

    public void setFirst(String _First) {
        this.First = _First;
    }

    //Setter and Getter for Last

    public String getLast() { return Last; }
    public void setLast(String _Last) {this.Last = _Last;}

    public String getphone() { return phone; }
    public void setphone(String _phone) {this.phone = _phone;}

    public String getpreference() { return preference; }
    public void setpreference(String _preference) {this.preference = _preference;}


    public static void printCustomer(ArrayList<Customer> cList) {
        for (Customer cust : cList) {
            System.out.println("Customer Id: " + cust.getCustomerId());
            System.out.println("Customer Name: " + cust.getFirst() + " " + cust.getLast());
            System.out.println("Customer Phone: " + cust.getphone());
            System.out.println("Buying Preference: " + cust.getpreference());
        }
    }
}