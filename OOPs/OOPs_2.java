package OOPs;

public class OOPs_2 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="aman";
        s1.age=24;

        Student s2=new Student(s1);
        s1.printInfo();
        s2.printInfo();
    }
}


class Student{
    String name;
    int age;

    Student(){
        
    }

    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
        System.out.println("constructor called with parameter");
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}