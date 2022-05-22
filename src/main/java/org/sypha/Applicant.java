package org.sypha;

public class Applicant {

    private String name;
    private Integer age;
    private  String address;
    private Sex sex;
    private Qualification qualification;

    public Applicant() {
    }

    public Applicant(String name, Integer age, String address, Sex sex, Qualification qualification) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                ", qualification=" + qualification +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
}
