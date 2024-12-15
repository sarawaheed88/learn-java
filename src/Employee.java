
// General Class
//super class
public class Employee {
   private String name;
   private String emailAddress;
   private String phone;
   private String department;
   private String address;
   private int yearOfBirth;

    //no-arg constructor
    public Employee (){
        System.out.println(" No Parameter constructor ");
    }

    //parameterized constructor
    public Employee ( String name , String emailAddress , String phone , String department , String address , int yearOfBirth){
       this.name = name ;
       this.emailAddress = emailAddress ;
       this.phone = phone ;
       this.department = department ;
       this.address = address ;
       this.yearOfBirth = yearOfBirth ;
    }

    //Setter & Getter
    // 1- name
    public void setName ( String name ){
        this.name = name ;
    }
    public String getName(){
        return name ;
    }
    // 2- email address
    public void setEmailAddress ( String emailAddress ){
        this.emailAddress = emailAddress ;
    }
    public String getEmailAddress(){
        return emailAddress ;
    }
    // 3- phone
    public void setPhone ( String phone ){
        this.phone = phone ;
    }
    public String getPhone(){
        return phone ;
    }
    // 4- department
    public void setDepartment ( String department ){
        this.department = department ;
    }
    public String getDepartment(){
        return department ;
    }
    // 5- address
    public void setAddress ( String address ){
        this.address = address ;
    }
    public String getAddress(){
        return address ;
    }
    // 6- year of birth
    public void setYearOfBirth ( int yearOfBirth ){
        this.yearOfBirth = yearOfBirth ;
    }
    public int getYearOfBirth(){
        return yearOfBirth ;
    }




}
