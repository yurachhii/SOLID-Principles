package SRP;
import java.util.*;
public class SRP {
// this code violates SRP 
    public class UserManager {

    public void addUser(String name, String email) {
        if (name == null || email == null) {
            System.out.println("Invalid data"); // 1) validation on name and null
            return;
        }

        System.out.println("Saving user to database"); // 2) checking on data base

        System.out.println("Sending welcome email"); // 3) checking on email
    }

}
// solution

// 1) validation
public class Validation{
    public static void Valid(String data) throws RuntimeException{
        if(data==null)
            throw new NullPointerException("Invalid data");
    }
} 
// 2) saving user in DB 

 public class User_Manager_name{
     public static void addUser(String name){
        System.out.println("Saving user to database");
     }
 }
 // 3) sending email
  public class User_Manager_email{
     public static void addUser(String email){
        System.out.println("Sending welcome email");
     }
 }
// 4) cobining data 
public class AddUser{
    public void Adduser(String name , String email){
        Validation.Valid(name);
        Validation.Valid(email);
        User_Manager_name.addUser(name);
        User_Manager_email.addUser(email);
    }
}
}
