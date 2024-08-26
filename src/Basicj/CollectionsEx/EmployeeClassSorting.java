//package Basicj.CollectionsEx;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//class EmployeeSort implements Comparable<EmployeeSort>{
//    String firstName;
//    String lastName;
//    int salary;
//
//
//    public EmployeeSort(String firstName, String lastName, int salary) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.salary = salary;
//    }
//
//    @Override
//    public String toString() {
//        return "EmployeeSort{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", salary=" + salary +
//                '}';
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//    public int getSalary() {
//        return salary;
//    }
//
//    public void setSalary(int salary) {
//        this.salary = salary;
//    }
//
//    @Override
//    public int compareTo(EmployeeSort o) {
//        return this.getSalary() - o.getSalary();
//    }
//}
//
//public class EmployeeClassSorting {
//
//    public static void main(String[] args) {
//        EmployeeSort es1 = new EmployeeSort("A","B", 15000);
//        EmployeeSort es2 = new EmployeeSort("Z","P", 10000);
//        EmployeeSort es3 = new EmployeeSort("B","L", 55000);
//        EmployeeSort es4 = new EmployeeSort("R","M", 5000);
//
//        List<EmployeeSort> list = new ArrayList<>();
//        list.add(es1);
//        list.add(es2);
//        list.add(es3);
//        list.add(es4);
//
//        System.out.println("Before sorting "+list);
//
//        //sorting
//        Collections.sort(list);
//
//        System.out.println("After sorting "+list);
//
//       /* Before sorting [EmployeeSort{firstName='A', lastName='B'}, EmployeeSort{firstName='Z', lastName='P'}, EmployeeSort{firstName='B', lastName='L'}, EmployeeSort{firstName='R', lastName='M'}]
//        After sorting [EmployeeSort{firstName='A', lastName='B'}, EmployeeSort{firstName='B', lastName='L'}, EmployeeSort{firstName='R', lastName='M'}, EmployeeSort{firstName='Z', lastName='P'}]
//*/
//
//    }
//}
