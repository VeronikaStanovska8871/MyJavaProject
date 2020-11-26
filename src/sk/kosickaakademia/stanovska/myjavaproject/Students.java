package sk.kosickaakademia.stanovska.myjavaproject;

import java.util.Scanner;

public class Students {
    private String fname;
    private String lname;
    private int age;
    private double height;
    private int weight;
    int students;

    public Students(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }


    public void setFname(String fname) {
        this.fname = fname;
    }


    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void getListOfStudents() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Meno študenta: ");
        students = sc.nextInt();
        for (int i=0; i>students; i++) {
            System.out.println(students);
        }
    }
}
