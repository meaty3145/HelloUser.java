import java.util.Scanner;

public class HelloUser {

      public static void main(String[] args) {

            Scanner user_imput = new Scanner(System.in);

            String first_name;
            System.out.print("Enter your first name: ");
            first_name = user_imput.next();

            String family_name;
            System.out.print("Enter your family name: ");
            family_name = user_imput.next();

            String full_name;
            full_name = first_name + " " + family_name;

            System.out.println("Hello! " + full_name);

      }
}
