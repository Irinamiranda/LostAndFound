package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Item> myList = new ArrayList<>();
        myList.add(new Item("12345", "Hat", "clothing"));
        myList.add(new Item("13254", "cat", "pet"));
        myList.add(new Item("15243", "bike", "other"));
        myList.add(new Item("42513", "umbrella", "other"));
        myList.add(new Item("23514", "pants", "clothing"));
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Lost and Found!");
        System.out.println("What do you wish? check/add/delete/undelete");
        String answer = s.nextLine();


            if (answer.equalsIgnoreCase("check")) {
                System.out.println("itemID" + "\t\t" + "ItemName" + "\t\t" + "ItemCategory" + "\t" + "index");
                for (Item items : myList) {
                    System.out.println(items);
                }
            } else if (answer.equalsIgnoreCase("add")) {
                myList.add(addItem());
                for (Item items : myList) {
                    System.out.println(items);
                }/*
            } else if (answer.equalsIgnoreCase("delete")) {
                System.out.println("Pick the item");
                System.out.println("itemID" + "\t\t" + "ItemName" + "\t\t" + "ItemCategory" + "\t" + "index");
                for (Item items : myList) {
                    System.out.println(items.toString());
                }*/

                // write your code here
            } else {
                System.out.println("Try again!");

            }
        }

    public static Item addItem(){
        Item newItem = new Item();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter item ID");
        String id = s.nextLine();
        newItem.setItemID(id);

        System.out.println("Enter the item name");
        String name = s.nextLine();
        newItem.setItemName(name);

        System.out.println("Enter item category");
        String category = s.nextLine();
        newItem.setItemCategory(category);
        newItem.setLost(true);


        return newItem;




    }


}
