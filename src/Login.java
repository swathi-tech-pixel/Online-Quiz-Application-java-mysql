import java.sql.*;
import java.util.Scanner;
public class Login{

public boolean login() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter username: ");
    String user = sc.nextLine();

    System.out.print("Enter password: ");
    String pass = sc.nextLine();

    if(user.equals("admin") && pass.equals("admin123")) {
        System.out.println("Login Successful!");
        return true;
    } else {
        System.out.println("Invalid Login!");
        return false;
    }
}
}
