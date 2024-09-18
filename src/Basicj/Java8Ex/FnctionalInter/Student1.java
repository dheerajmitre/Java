package Basicj.Java8Ex.FnctionalInter;

import Basicj.Java8Ex.Student;            // How To Use OF predicate Functional interface
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
public class Student1 {

    int id;
    String name;
    Double Percentage;
    String Speicialization;

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
        return Percentage;
    }

    public void setPercentage(Double percentage) {
        Percentage = percentage;
    }

    public String getSpeicialization() {
        return Speicialization;
    }

    public void setSpeicialization(String speicialization) {
        Speicialization = speicialization;
    }

    Student1(int id , String name , Double percentage, String Specialization){
        this.id =  id;
        this.name = name ;
        this.Percentage = percentage;
        this.Speicialization = Specialization;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Percentage=" + Percentage +
                ", Speicialization='" + Speicialization + '\'' +
                '}';
    }
}
class Student2 extends Student1 {

    Student2(int id, String name, Double percentage, String Specialization) {
        super(id, name, percentage, Specialization);
    }

    public static void main(String[] args) {


    List<Student1> listofstudents = new ArrayList<Student1>();

    listofstudents.add(new Student1(111, "John", 81.0, "Mathematics"));

    listofstudents.add(new Student1(222, "Harsha", 79.5, "History"));

    listofstudents.add(new Student1(333, "Ruth", 87.2, "Computers"));

    listofstudents.add(new Student1(444, "Aroma", 63.2, "Mathematics"));

    listofstudents.add(new Student1(555, "Zade", 83.5, "Computers"));

    listofstudents.add(new Student1(666, "Xing", 58.5, "Geography"));

}

Predicate<Student1> Mathematics

}

