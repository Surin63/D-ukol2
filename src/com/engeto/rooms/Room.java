package com.engeto.rooms;

public class Room {
    private int numberOfRoom;
    private int numberofBed;
    private boolean viewOnSea;
    private boolean balcony;
    private int price;


    public Room(int numberOfRoom, int numberofBed, boolean viewOnSea, boolean balcony, int price) {
        this.numberOfRoom = numberOfRoom;
        this.numberofBed = numberofBed;
        this.viewOnSea = viewOnSea;
        this.balcony = balcony;
        this.price = price;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberofBed() {
        return numberofBed;
    }

    public void setNumberofBed(int numberofBed) {
        this.numberofBed = numberofBed;
    }

    public boolean isViewOnSea() {
        return viewOnSea;
    }

    public void setViewOnSea(boolean viewOnSea) {
        this.viewOnSea = viewOnSea;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return
                "\n" + "Room number: " + numberOfRoom +
                ", Beds = " + numberofBed +
                ", View on sea = " + viewOnSea +
                ", Balcony = " + balcony +
                ", Price = " + price + " kc";



    }
}
