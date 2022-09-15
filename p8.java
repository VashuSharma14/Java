import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String branch;
    private String city;
    private String university;
    public Student(int id , String name ){
         this.id = id;
         this.name = name;
    }
    public Student(int id , String name , String branch     {
        this(id , name);
        this.branch = branch;

}
     public Student(int id , String name , String       branch , String city){
        this(id , name , branch);
        this.city = city;
    }
     public Student(int id , String name , String branch , String city , String university){
        this(id , name , branch , city);
        this.university = university;
     }
     public void setId(int id){
       this.id = id;
     }
     public void setName(String name){
       this.name = name;
     }
     public void showDetails(){

        System.out.println("ID -> " + id);
        System.out.println("Name -> " + name);
        System.out.println("Branch -> " + branch);
        System.out.println("City -> " + city);
        System.out.println("University -> " + university);
     }
        public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID -> ");
        int id = scanner.nextInt();
        System.out.println("Enter Name -> ");
        String name = scanner.next();
        System.out.println("Enter Branch -> ");
        String branch = scanner.next();
        System.out.println("Enter City -> ");
        String city = scanner.next();
        System.out.println("Enter University -> ");
        String uni = scanner.next();
        Student emp = new Student(id , name , branch ,       city , uni);
       emp.showDetails();
      }
}
