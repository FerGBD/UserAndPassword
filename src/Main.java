import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String admin = "admin";
        String adminuser = "adminuser";
        System.out.print("User:");
        String user = sc.nextLine();
        System.out.print("Password:");
        String pass = sc.next();

        while(!user.equals(admin) || !pass.equals(adminuser)){
            System.out.println("Invalid user or password!");
            System.out.println("Try again!");
            System.out.print("User:");
            user = sc.next();
            System.out.print("Password:");
            pass = sc.next();
        }
        System.out.println("Login successful!");
        sc.close();
    }
}
