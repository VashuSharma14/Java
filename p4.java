import java.util.Scanner;
public class Employee {
    int ID;
    String name;
    String Department;
    int salary;
   public Employee(int ID, String name, String Department, int salary)
    {
        this.ID = ID;
        this.name = name;
        this.Department = Department;
        this.salary = salary;
    }
   void showDetalis(){
    System.out.println("****Details of the Employee****");
        System.out.println("Id is :- "+ ID);
        System.out.println("Name is :- "+ name);
        System.out.println("Department is :- "+ Department);
        System.out.println("Salary is :- "+ salary);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Id");
        int id = sc.nextInt();
        System.out.println("Enter the name");
        String s = sc.next();
        System.out.println("Enter the Department");
        String dep = sc.next();
        System.out.println("Enter the salary");
        int sal = sc.nextInt();
       Employee obj = new Employee(id, s, dep, sal);
        obj.showDetalis();
}
}

