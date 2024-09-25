package Basicj.Java8Ex.FnctionalInter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class PredicateEX {

    //Predicate is Represent an operation which takes an Argument T and returns boolean
    // if you want Defne lambda Expression which perform some test on an argument and
    // Returns True or false Depending on outcome of the test

    int id;
    String name;
    Double percentage;  // Fixed casing
    String specialization;  // Fixed casing

    public PredicateEX(int id, String name, Double percentage, String specialization) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
        this.specialization = specialization;
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percentage=" + percentage +
                ", specialization='" + specialization + '\'' +
                '}';
    }
    public static void main(String[] args) {

        //  list of students
        List<PredicateEX> listOfStudents = new ArrayList<>();

        listOfStudents.add(new PredicateEX(111, "John", 81.00, "Mathematics"));
        listOfStudents.add(new PredicateEX(222, "Harsha", 79.00, "History"));
        listOfStudents.add(new PredicateEX(333, "Ruth", 87.00, "Computers"));
        listOfStudents.add(new PredicateEX(444, "Aroma", 63.89, "Mathematics"));
        listOfStudents.add(new PredicateEX(555, "Zade", 83.00, "Computers"));
        listOfStudents.add(new PredicateEX(666, "Xing", 58.50, "Geography"));

        // Create a Predicate
        Predicate<PredicateEX> mathematicsPredicate = (PredicateEX student) -> student.getSpecialization().equals("Mathematics");

        // Create Function to extract the students name
        Function<PredicateEX, String> getNameFunction = (PredicateEX student) -> student.getName();

        // Filter the list using the Predicate
        List<PredicateEX> mathematicsStudents = new ArrayList<>();

        for (PredicateEX student : listOfStudents) {
            if (mathematicsPredicate.test(student)) {
                mathematicsStudents.add(student);
            }
        }
        // use the Function to extract names From Filtered in mathematics
        System.out.println("Students with Specialization in mathss");

        for (PredicateEX student : mathematicsStudents) {
            String name = getNameFunction.apply(student);
            System.out.println(student);

        }
    }
}