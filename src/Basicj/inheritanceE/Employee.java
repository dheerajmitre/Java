package Basicj.inheritanceE;

public class Employee {
    int salary = 900;
}
    class Engineer extends Employee{
    int Benefits = 800;
}

class fog{

    public static void main(String[] args) {

        Engineer s1 = new Engineer();

        System.out.println("salary: " +s1.salary + "\n"+ "Benefits: "+ s1.Benefits);
    }
}
