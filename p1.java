
class Student{
    int ID;
    String Name;
    String Branch;
    String University;
    void setDetails(int id,String n,String b,String u){
     ID=id;
     Name =n;
     Branch=b;
     University=u;
    }
    void showDetails(){
        System.out.println("ID:"+ID+"\nName:"
        +Name+"\nBranch:"+Branch+"\nUniversity:"+University);
    }
    public static void main(String args[]){
        Student s=new Student();
        s.setDetails(20011879, "Sachin Aswal", "CSE", "Graphic Era Hill University");
        s.showDetails();
    }
}
