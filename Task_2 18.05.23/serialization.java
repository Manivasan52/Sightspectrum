package task3;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 class Employee implements Serializable{
       private static final long serialVersionUID = 1L;
       int id;
       String name;
       public Employee(int id, String name) {
             this.id = id;
             this.name = name; 
       }
}
public class serialization {
public static void main(String[] args) {
	try{
        Employee emp1 =new Employee(20110,"John");
        Employee emp2 =new Employee(22110,"Jerry");
        Employee emp3 =new Employee(20120,"Sam");
        FileOutputStream fout=new FileOutputStream("output.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(emp1);
        out.writeObject(emp2);
        out.writeObject(emp3);
        out.flush();
        out.close();
        System.out.println("Serialization is been successfully executed");
 }
 catch(Exception e){
        System.out.println(e);}
 }
}

