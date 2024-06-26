/*
 * Author: Tariq Chowdhury
 * Date: 2/05/2024
 * Purpose: This class is a superclass and represents a gadget. It has attributes model, price, weight and size. The class has a constructor, getPrice method, getWeight method, getSize method and display method.
 */
public class Gadget {
    private String model;
    private double price;
    private int weight;
    private String size;


    public Gadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

    public double getPrice(){
        return price;
    }

    public int getWeight(){ 
        return weight;
    }

    public String getSize(){
        return size;
    }

    public String getModel(){
        return model;
    }

    public String display() {
        String output = ("Model: " + model + "\n" + "Price: £" + price + "\n" + "Weight: " + weight + " grams" + "\n" + "Size: " + size + "\n");
        return output;
    }
}
