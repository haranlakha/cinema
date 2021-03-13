import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Customer newCustomer = new Customer();
        Film taxiDriver = new Film("Taxi Driver", 10.00, 18, "Drama", "Cinema");

        System.out.println("Enter name:");

        Scanner scnr = new Scanner(System.in);
        newCustomer.setName(scnr.next());
        System.out.println("Hello " + newCustomer.getName());

        System.out.println("Enter age:");
        newCustomer.setAge(scnr.nextInt());

        if(newCustomer.checkAge(newCustomer.getAge(), taxiDriver.certification)){
            System.out.println("You are old enough to watch this film.");
        }else{
            System.out.println("You are not old enough to watch this film.");
            System.exit(0);
        }
    }
}
