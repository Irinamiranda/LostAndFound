package com.company;

public class Item {
    private String itemID;
    private String itemName;
    private String itemCategory;
    private boolean isLost;

    public Item() {

    }

    public Item (String itemID, String itemName, String itemCategory ) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
    }


    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        itemCategory = itemCategory;
    }
    public boolean isLost() {
        return isLost;
    }

    public void setLost(boolean lost) {
        isLost = lost;
    }



    public String toString() {

        String avail = isLost() ? "lost" : "found";

        return getItemID() + "\t\t" + getItemName() + "\t\t\t" + getItemCategory() +  "\t\t\t" + avail;

    }

}
