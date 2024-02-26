package models;


public class Items {
    private String item;
    private String category;
    private int quantity;
    private double price;

    public Items(){

    }
    public Items(String item, String category, int quantity, double price){
        this.item = item;
        this.category = category;
        this.quantity = quantity;
        this.price = price;
    }

    public void setItem(String item){
        this.item = item;
    }

    public String getItem(){
        return this.item;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getCategory(){
        return this.category;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity(){
        return this.quantity;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

}