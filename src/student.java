public class student {
    String name ;
    String emailAddress;
    String phone ;
    String department;
    String address ;
    int yearOfBirth;
    public student(){
        System.out.println("no parameter constructor");
    }
    public student(String name, String emailAddress , String phone , String department , String address , int yearOfBirth){
        this.name = name ;
        this.emailAddress = emailAddress ;
        this.phone = phone ;
        this.department = department ;
        this.address = address ;
        this.yearOfBirth = yearOfBirth ;
    }
    public void setName(String name){
        this.name = name ;
    }
    public String getName(){
        return  name;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress ;
    }
    public String getEmailAddress(){
        return  emailAddress ;
    }
    public void setPhone(String phone){
        this.phone = phone ;
    }
    public String getPhone(){
        return  phone ;
    }
    public void setDepartment(String department){
        this.department = department ;
    }
    public String getDepartment(){
        return department;
    }
    public void setAddress(String address){
        this.address = address ;
    }
    public String getAddress(){
        return address;
    }
    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth ;
    }
    public int getYearOfBirth(){
        return  yearOfBirth ;
    }




//    int  val ;
//    public  student(){
//
//    }
//    public  student(int val){
//        this.val= val ;
//    }

    //    public static student add(student n1, student n2){
//        student n3 = new student();
//         n3.val = n1.val+n2.val;
//        return n3;
//    }
//    public student add(student obj1){
//        student obj3 = new student();
//        obj3.val = this.val + obj1.val;
//        return obj3 ;
//    }
//    public boolean isEqual(student obj1){
//        if(this.val == obj1.val){
//            return true ;
//        }
//        else
//            return false ;
//    }
}
