package Practice.Oops;

public class Newstudent {
    int rollNo;
    String studentName;
}
class student{
    public static void main(String[] args) {
  Newstudent obj1=new Newstudent();
  Newstudent obj2=new Newstudent();
  // Initializing Objects
        obj1.rollNo=100;
        obj1.studentName="shushil";
        obj2.rollNo=200;
        obj2.studentName="chaubey";
        System.out.println(obj1.rollNo+" "+obj1.studentName);
        System.out.println( obj2.rollNo+ " " +obj2.studentName);
    }
}
