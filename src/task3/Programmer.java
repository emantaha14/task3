package task3;

public class Programmer extends Employee {
    String name ;
    int age ;
    public Programmer(String name , int age){
        this.name = name ;
        this.age = age ;
        System.out.println(name +" "+ age+" years" );
        job.recruiting = true ;
    }
}
