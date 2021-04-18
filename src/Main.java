import java.util.*;

public class Main {

    static Scanner scnr = new Scanner(System.in);
    static List<Film> filmList = new ArrayList<>(); //list to store films

    public static void main(String[] args) {

        Customer newCustomer = new Customer(); //new customer object

        Film taxiDriver = new Film("Taxi Driver", 10.00, 18,"18", 100);
        Film joker = new Film("Joker",10.00,15, "15", 100);
        Film spiritedAway = new Film("Spirited Away",10.00,8, "PG", 100);
        Film toyStory4 = new Film("Toy Story", 10.00, 4, "U", 100);

        System.out.println("Enter name:");

        newCustomer.setName(scnr.next());
        System.out.println("Hello " + newCustomer.getName());

        System.out.println("Enter age:");
        newCustomer.setAge(scnr.nextInt());

        showFilms(taxiDriver, joker, spiritedAway, toyStory4);
        checkAge(newCustomer);
    }

    public static void showFilms(Film taxiDriver, Film joker, Film spiritedAway, Film toyStory4){

        filmList.add(taxiDriver);
        filmList.add(spiritedAway);
        filmList.add(joker);
        filmList.add(toyStory4);

        String headNum = "#", headTitle = "Film Title", headPrice = "Price", headRating = "Rating", headTickets = "Tickets";
        System.out.printf("\n| %s | %-13s | %s | %-6s | %-7s | \n", headNum, headTitle, headPrice, headRating, headTickets);

        for (int i = 0; i < filmList.size(); i++) {
            System.out.printf("| %d | %-13s | £%s | %-6s | %-7d | \n", (i+1), filmList.get(i).title,
                    filmList.get(i).price, filmList.get(i).certString, filmList.get(i).noOfTickets);
        }
        System.out.println();
    }

    public static void checkAge(Customer newCustomer){

        int input;
        //loops round until input between 1 and size of list
        do{
            System.out.println("Please select a film to watch (1-" + filmList.size() + "):");
            input = scnr.nextInt();
        }while(input < 1 || input > filmList.size());

        if(newCustomer.checkAge(newCustomer.getAge(), filmList.get(input-1).certification)){
            System.out.println("You are old enough to watch " + filmList.get(input-1).title + "!");
        }else{
            System.out.println("You are not old enough to watch " + filmList.get(input-1).title + "!");
            System.exit(0);
        }
    }
}
