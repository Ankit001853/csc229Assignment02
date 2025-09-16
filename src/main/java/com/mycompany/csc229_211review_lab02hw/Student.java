package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */

//Student class will extend Person and will hold the GPA variable.
public class Student extends Person {
    private String address;
    private double gpa;

    // Constructor
    public Student(String name, short age) {
        super(name, age);
    }

    // GPA getter and setter
    public double getGpa() {
        return gpa;
    }
    public void setGpa (double gpa){
        this.gpa = gpa; }

    //Implement the abstract methods of Person
    @Override
    public String getAddress () {
        return address;}
    @Override
    public void setAddress (String address){
        this.address = address; }

    //Override toString method to display the details of student object.
    @Override
    public String toString () {
        return "Student: [ Name = " + getName() + ", Age = " + getAge() + ", GPA = " + gpa + " ]";
    }
}







