package Basicj.CollectionsEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeComparatorSort {
    String firstName;
    String lastName;
    int salary;

    public EmployeeComparatorSort() {
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public EmployeeComparatorSort(String firstName, String lastName, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}

class FirstNameComparator implements Comparator<EmployeeComparatorSort> {

    @Override
    public int compare(EmployeeComparatorSort o1, EmployeeComparatorSort o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class SalaryComparator implements Comparator<EmployeeComparatorSort> {
    @Override
    public int compare(EmployeeComparatorSort o1, EmployeeComparatorSort o2) {
        return o1.getSalary() - (o2.getSalary());
    }
}

class LastNameComparator implements Comparator<EmployeeComparatorSort> {

    @Override

    public int compare(EmployeeComparatorSort o1, EmployeeComparatorSort o2) {

        return o1.getLastName().compareTo(o2.getLastName());
    }
}

public class ComparatorEmployeeTest {
    public static void main(String[] args) {
        EmployeeComparatorSort es1 = new EmployeeComparatorSort("ABCD", "POPP", 15000);
        EmployeeComparatorSort es2 = new EmployeeComparatorSort("PQRS", "VRETT", 10000);
        EmployeeComparatorSort es3 = new EmployeeComparatorSort("DEF", "LOSTT", 55000);
        EmployeeComparatorSort es4 = new EmployeeComparatorSort("RVNL", "MONEY", 5000);

        List<EmployeeComparatorSort> list = new ArrayList<>();
        list.add(es1);
        list.add(es2);
        list.add(es3);
        list.add(es4);

//firstname Sorting

        System.out.println("Firstname Before sorting " + list); //
        //Collections.sort(list);  //
        FirstNameComparator firstNameComparator = new FirstNameComparator();
        Collections.sort(list, firstNameComparator);
        System.out.println("Firstname After using First Name sorting " + list); //


// salary Sorting

        System.out.println("Salary before salary listing" + list);
        SalaryComparator sal = new SalaryComparator();
        Collections.sort(list, sal);
        System.out.println("salary after Sorting" + list);


//lastname Sorting

        System.out.println("Lastname Before sorting " + list);
        LastNameComparator lastNameComparator = new LastNameComparator();
        Collections.sort(list, lastNameComparator);

        System.out.println(" lastname After using Last Name sorting " + list); //
    }
}

