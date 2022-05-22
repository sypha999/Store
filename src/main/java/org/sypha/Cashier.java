package org.sypha;

import org.jetbrains.annotations.NotNull;

public class Cashier extends Person implements CashierDuties{


    public Cashier(String name, String address, Integer age) {
        super(name, address, age);
    }




    @Override
    public void giveReciept(@NotNull Customer customer) {

        int total=0;
        System.out.println("LIST OF ITEMS");
        for(int i=0; i<customer.getCart().size(); i++)
        {
        System.out.println("Product name: "+customer.getCart().get(i)[0]+" Price: "+customer.getCart().get(i)[1]);
        }
        for(int i=0; i<customer.getCart().size(); i++)
        {
             total=Integer.parseInt(customer.getCart().get(i)[1]) + total;
        }

        System.out.println("Total: " +total);
    }

    @Override
    public int sell(Customer customer) {
        int total=0;
        for(int i=0; i<customer.getCart().size(); i++)
        {
            total=Integer.parseInt(customer.getCart().get(i)[1]) + total;
        }
        //total is the total price a customer should pay
        return total;
    }
}
