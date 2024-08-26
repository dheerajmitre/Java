package Basicj.Exception.Estring;

public class StudentEx {
    int id;
    String name ;
    StudentEx(int i, String n ) {

        id = i;
        name = n;
    }
        void display(){
            System.out.println(id+""+ name );
            StudentEx s1 = new StudentEx(111,"dheeraj");
            StudentEx s2 = new StudentEx(222,"shubya");

            s1.display();
s2.display();

        }
    }

