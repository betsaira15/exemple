package com.company;

public class Phone {
    private String name;
    private String company;
    private String country;
    private int price;

    public Phone(String name, String comp, String country, int price){
        this.name=name;
        this.company=comp;
        this.country=country;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCompany() { return company; }
    public String getCountry() {return  country;}

    public String toString() {
        return name + country+'(' + price + ')';
    }
}

