package org.sypha;




public class Main {
    public static void main(String[] args) {
        Manager boss = new Manager("Bond","Edo tech park",33);
        Cashier cashier = new Cashier("Lawal","Edo tech park",27);
        Customer customer = new Customer("Arinze","Edo tech park");

        Applicant applicant=new Applicant("jude",39,"Edo park",Sex.MALE,Qualification.SSCE);
        boss.hire(applicant,Qualification.SSCE);
        Store adamu = new Store();
        boss.createProduct("Benz","2500",25,adamu);
        boss.createProduct("Toyota","2000",20,adamu);
        boss.createProduct("Honda","1000",10,adamu);
        System.out.println(adamu.getListOfproduct());
        System.out.println(adamu.getListOfproduct().size());
        System.out.println(adamu.getListOfproduct().get(0).getProductName());
        customer.addToCart("Benz",adamu);
        customer.addToCart("Toyota",adamu);
        customer.addToCart("Honda",adamu);
        cashier.giveReciept(customer);




    }
}