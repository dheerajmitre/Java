import java.io.*;

class Student implements Serializable {

    int rollno;
    String name;
    String address;

    Student( int rollno , String name, String address) {
        this.name = name;
        this.rollno = rollno;
        this.address = address;

    }
    public static void main(String[] args) {

        Student s1 = new Student(5 ,"dheeraj","Parbhani");
        System.out.println(s1.name + s1.rollno);
        String filename = "D:\\Task\\test.txt";

        try {
            FileOutputStream fos = new FileOutputStream(filename);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s1);

            oos.close();
            fos.close();

            System.out.println("object saved in file");

        } catch (IOException e) {

            System.out.println(e.getMessage());
        }
    }
}

