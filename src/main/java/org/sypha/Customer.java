package org.sypha;

import java.util.*;

public class Customer extends Person{
    String [] first = new String[2];
    private ArrayList<String[]> cart = new ArrayList<>();

    public Customer (String name, String address)
    {
        super(name, address);
    }

    public String[] getFirst() {
        return first;
    }

    public void setFirst(String[] first) {
        this.first = first;
    }

    public ArrayList<String[]> getCart() {
        return cart;
    }

    public void setCart(ArrayList<String[]> cart) {
        this.cart = cart;
    }

//customer buys product
    public void addToCart(String productName, Store store)
    {
        Product product= new Product();
        for(int i=0; i<store.getListOfproduct().size(); i++){

            if(store.getListOfproduct().get(i).getProductName().equals(productName))
            {

                first[0]=product.getProductName();
                first[1]=product.getPrice();
                cart.add(first);
            }

            else {
                System.out.println("Product not available");
            }
        }
    }
}
