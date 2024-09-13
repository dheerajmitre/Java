package Basicj.Java8Ex;
import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Data {

    private String name ;
    private int id;
    private double Salary ;

    public Data(String name , int id, double Salary) {
        this.name = name;
        this.id = id;
        this.Salary = Salary;

    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Double getSalary() {
        return Salary;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(Double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name ='" + name + '\'' +
                ", id=" + id +
                ",Salary=" + Salary +
                '}';
    }
}
