package sk.kosickaakademia.stanovska.myjavaproject;

public class Grades extends Students {
    public Grades(String fname, String lname, String name) {
        super(fname, lname);
        this.name = name;
    }

    private String name;


    public String getName() {
        return name;
    }
}

