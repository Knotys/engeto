package com.engeto.hotel;

public class Room {
    int number;
    int numberOfBeds;
    boolean balcony;
    boolean seaViews;
    int price;

    public Room(int number, int numberOfBeds, boolean balcony,
                boolean seaViews, int price)
    {
        this.number = number;
        this.numberOfBeds = numberOfBeds;
        this.balcony = balcony;
        this.seaViews = seaViews;
        this.price = price;
    }

    public String getDescription() {
        return getNumber()+". pokoj; Počet lůžek: "+getNumberOfBeds()+
                "; Cena: "+getPrice()+" kč/noc; Pokoj s balkonem: "
                +isBalcony()+"; Pokoj s výhledem na moře: "+isSeaViews();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaViews() {
        return seaViews;
    }

    public void setSeaViews(boolean seaViews) {
        this.seaViews = seaViews;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
