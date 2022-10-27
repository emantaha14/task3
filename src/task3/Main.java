package task3;

public class Main {
    public static void main(String[] args) {

        if( job.recruiting)
            System.out.println("lucky");
        else System.out.println("unlucky");
        Programmer obj = new Programmer("eman", 20);
        if( job.recruiting)
            System.out.println("lucky");
        else System.out.println("unlucky");
    }

}
// fist I made the Programmer class inherit from the Employee class and because of this the constructor of Employee is called
// and print the value I put it in the constructor
//why did the word of Employee come first ? because the constructor is the first thing called in the class
// why did the job become available ? because of the static word , this word makes me call a variable without make an object
//so i could change the value of recruiting