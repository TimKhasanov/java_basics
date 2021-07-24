package ru.skillbox;

public class Product {
    private final String name;
    int prise;
    private final int barCode;

    public Product(String name, int barCode){
        this.name = name;
        this.barCode = barCode;
    }
    public String getName(){
        return name;
    }
    public int getPrise(){
        return prise;
    }
    public int getBarCode(){
        return barCode;
    }
    public void setPrise(int prise){
        this.prise = prise;
    }
}
