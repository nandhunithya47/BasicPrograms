import java.util.Scanner;
class Address{
    String Street;
    String city;
    String state;
    String Country;
    public Address(String Street,String city,String State,String Country){
        this.Country=Country;
        this.Street=Street;
        this.city=city;
        this.state=State;
    }
}
class Staff{
    String name;
    int id;
    Address addre;
    int phno;
    String mailid;
    int age;
    String subjectExpertise;
    int experience;

    public void addressDetails(String Street,String city,String State,String Country){
        Address add=new Address(Street,city,State,Country);
        this.addre=add;
    }
    public String staffDetails(){
        return "name= "+this.name+ ",  age="+this.age+ ",  phno="+this.phno+",  email id="+this.mailid+",  id="+this.id+",  subjectExpertise= "+this.subjectExpertise;
    }
}
class Student{
    String name;
    int age;
    int rollnumber;
    String mailid;

    public String studentDetails(){
        return "name= "+this.name+", age="+this.age+",  rollnumber="+this.rollnumber+",  mailid= "+this.mailid;
    }
}
public class StudentAplication {
    public static void main(String args[]){

        Student s=new Student();
        s.name="Nandhu";
        s.age=24;
        s.rollnumber=105;
        s.mailid="nandhushrinithya@gmail.com";
        System.out.println("Student details: "+s.studentDetails());
        System.out.println();
        System.out.println();
        System.out.println("Second student record");
        Student s1=new Student();
        s1.name="Nandhu Shree";
        s1.age=18;
        s1.rollnumber=54;
        s1.mailid="nandhunithya47@gmail.com";
        System.out.println("Student details: "+s1.studentDetails());
        System.out.println();
        System.out.println();
        System.out.println("Staff Details");
        Staff s3=new Staff();
        s3.name="Nandhu";
        s3.age=50;
        s3.id=45;
        s3.experience=2;
        s3.phno=23456789;
        s3.subjectExpertise="Social";
        s3.addressDetails("parvathipura", "Bengaluru", "Karnataka", "India");
        System.out.println("Staff deatlis: "+s3.staffDetails());
        System.out.println("Adress:  "+s3.addre.Street);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Staff record 2");
        Staff s4=new Staff();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name: ");
        s4.name=sc.nextLine();
        System.out.println("Enter the age: ");
        s4.age=sc.nextInt();
        System.out.println("Enter the id: ");
        s4.id=sc.nextInt();
        System.out.println("Enter the experience: ");
        s4.experience=sc.nextInt();
        System.out.println("Enter the phno: ");
        s4.phno=sc.nextInt();
        System.out.println("Enter the subjectExpertise: ");
        s4.subjectExpertise=sc.nextLine();
        s4.subjectExpertise=sc.nextLine();
        s4.addressDetails("Parvathipura", "Bengaluru", "Karnataka", "india");
        System.out.println("Staff deatils: "+s4.staffDetails());
        System.out.print("Adress:  "+s4.addre.city+", ");
        System.out.print(s4.addre.state+", ");
        System.out.print(s4.addre.Street+", ");
        System.out.print(s4.addre.Country+", ");
        sc.close();




    }

}
