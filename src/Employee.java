import MyPackage1.MyClass1;
import Package2.Pakage2Class1;
class ByteXL {
    static int EmpId = 131;
    int salary = 28000;
    int durationMonth = 8;
}

public class Employee {
    public static void main(String[] args) {

        ByteXL Vinayak = new ByteXL();
        System.out.println("Employee EmpId: " + ByteXL.EmpId);
        System.out.println("EmpId: " + Vinayak.EmpId);
        System.out.println("Salary: " + Vinayak.salary);
        System.out.println("Duration(in month): " + Vinayak.durationMonth);

        //MyClass1.print();
        MyClass1 obj1 = new MyClass1();
        obj1.print();

        Pakage2Class1 obj2 = new Pakage2Class1();
        obj2.print();
    }
}