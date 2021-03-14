import java.util.*;

public class Main {

    public static void main(String[] args) {

        Customer newCustomer = new Customer();

        /*
        film age ratings from bbfc:
        "U" = 4
        "PG" = 8
        "12" = 12
        "12A" = 12
        "15" = 15
        "18" = 18
        */

        Film taxiDriver = new Film("Taxi Driver", 10.00, 18,"18");
        Film joker = new Film("Joker",10.00,15, "15");
        Film spiritedAway = new Film("Spirited Away",10.00,8, "PG");
        Film toyStory4 = new Film("Toy Story", 10.00, 4, "U");

        System.out.println("Enter name:");

        Scanner scnr = new Scanner(System.in);
        newCustomer.setName(scnr.next());
        System.out.println("Hello " + newCustomer.getName());

        System.out.println("Enter age:");
        newCustomer.setAge(scnr.nextInt());

        List<Film> filmList = new ArrayList<>(); //list to store films

        filmList.add(taxiDriver);
        filmList.add(spiritedAway);
        filmList.add(joker);
        filmList.add(toyStory4);

        for (int i = 0; i < filmList.size(); i++) {
            System.out.println((i + 1) + ". " + filmList.get(i).title + " £" + filmList.get(i).price + " " + filmList.get(i).certString);
        }
        System.out.println();

        int input;
        do{
            System.out.println("Please select a film to watch (1-" + filmList.size() + "):");
            input = scnr.nextInt();
        }while(input < 1 || input > filmList.size());

        if(newCustomer.checkAge(newCustomer.getAge(), filmList.get(input-1).certification)){
            System.out.println("You are old enough to watch this film!");
        }else{
            System.out.println("You are not old enough to watch this film!");
            System.exit(0);
        }
    }
}
