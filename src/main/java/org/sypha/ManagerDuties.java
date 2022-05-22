package org.sypha;

public interface ManagerDuties {

    void  createProduct(String name, String price, int Stock, Store store);
    void hire(Applicant applicant,Qualification qualification);

}
