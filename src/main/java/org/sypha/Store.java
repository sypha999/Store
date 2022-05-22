package org.sypha;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Product> listOfproduct = new ArrayList<>();

    public List<Product> getListOfproduct() {
        return listOfproduct;
    }

    public void setListOfproduct(List<Product> listOfproduct) {
        this.listOfproduct = listOfproduct;
    }

    @Override
    public String toString() {
        return "Store{" +
                "listOfproduct=" + listOfproduct +
                '}';
    }
}
