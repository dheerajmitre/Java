//package Basicj.CollectionsEx;
//
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Sortcollection implements Comparable<Sortcollection> {
//    String Name;
//    String Lastname;
//    int mobile_no;
//
//
//    @Override
//    public String toString() {
//        return "Sortcollection{" +
//                "Name='" + Name + '\'' +
//                ", Lastname='" + Lastname + '\'' +
//                ", mobile_no=" + mobile_no +
//                '}';
//    }
//
//    public Sortcollection(String name, String lname, int mobile_no) {
//        this.Name = name;
//        this.Lastname = lname;
//        this.mobile_no = mobile_no;
//
//    }
//    public String getName() {
//        return Name;
//    }
//    public void setName(String name) {
//        this.Name = Name;
//    }
//    public String getLastname() {
//        return Lastname;
//    }
//    public void setLastname(String lastname) {
//    }
//    public int getMobile_no() {
//        return mobile_no;
//    }
//    public void setMobile_no(int mobile_no) {
//        this.mobile_no = mobile_no;
//    }
//
//    @Override
//    public int compareTo(Sortcollection o1) {
//   //   return this.getMobile_no() - o.getMobile_no();
////return this.getLastname() .compareTo( o1.getLastname());
//        return this.getName().compareTo(o1.getName());
//    }
//}
//
//class Sortclasscollection {
//
//    public static void main(String[] args) {
//
//        Sortcollection s1 = new Sortcollection("D", "F", 123);
//        Sortcollection s2 = new Sortcollection("C", "G", 876);
//        Sortcollection s3 = new Sortcollection("B", "H", 987);
//        Sortcollection s4 = new Sortcollection("A", "I", 453);
//
//        List<Sortcollection> List = new ArrayList<>();
//        List.add(s1);
//        List.add(s4);
//        List.add(s2);
//        List.add(s3);
//
//        System.out.println("Before Sorting" + List);
//
//        Collections.sort(List);
//
//        System.out.println("after Sorting" + List);
//
//    }
//}
