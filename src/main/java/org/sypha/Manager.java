package org.sypha;

import java.util.List;

public class Manager extends Person implements ManagerDuties{


    public Manager(String name, String address, Integer age) {
        super(name, address, age);
    }


    @Override
    public  void createProduct (String name, String price, int Stock, Store store) {
        Product product = new Product();
        product.setProductName(name);
        product.setPrice(price);
        product.setStock(Stock);

        List<Product> listProd = store.getListOfproduct();
        listProd.add(product);

    }

    @Override
    public void hire(Applicant applicant, Qualification qualification) {

        //this is a big store and we do not want staffs who's age is more than 29 and qualificatin is less than HND working for us

        if (applicant.getAge()>29 && (applicant.getQualification()==qualification.PRIMARY || applicant.getQualification()==qualification.SSCE)){

            System.out.println(applicant.getName()+" Does not meet the requirements to be employed");
        }

        else{

            System.out.println(applicant.getName()+" is employed");
        }

    }


}
