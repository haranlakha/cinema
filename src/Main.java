import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {

    static Scanner scnr = new Scanner(System.in);
    static ArrayList<Film> filmList = new ArrayList<>(); //list to store films
    static Customer newCustomer = new Customer(); //new customer object

    static int selection;
    static int numTickets;

    public static void main(String[] args) {

        Film taxiDriver = new Film("Taxi Driver", 10.00, 18,"18", 100);
        Film joker = new Film("Joker",10.00,15, "15", 100);
        Film spiritedAway = new Film("Spirited Away",10.00,8, "PG", 100);
        Film toyStory4 = new Film("Toy Story", 10.00, 4, "U", 100);

        addFilms(taxiDriver, joker, spiritedAway, toyStory4);
        userInformation();
        showFilms();
        selectFilm();
        printReceipt(numTickets, selection);
    }

    public static void addFilms(Film taxiDriver, Film joker, Film spiritedAway, Film toyStory4) {

        filmList.add(taxiDriver);
        filmList.add(spiritedAway);
        filmList.add(joker);
        filmList.add(toyStory4);
    }

    public static void userInformation(){
        System.out.println("Enter name:");

        newCustomer.setName(scnr.next());
        System.out.println("Hello " + newCustomer.getName());

        System.out.println("Enter age:");
        newCustomer.setAge(scnr.nextInt());

    }

    public static void showFilms(){

        String headNum = "#", headTitle = "Film Title", headPrice = "Price", headRating = "Rating", headTickets = "Tickets";
        System.out.printf("\n| %s | %-13s | %s | %-6s | %-7s | \n", headNum, headTitle, headPrice, headRating, headTickets);

        for (int i = 0; i < filmList.size(); i++) {
            System.out.printf("| %d | %-13s | £%s | %-6s | %-7d | \n", (i+1), filmList.get(i).getTitle(),
                    filmList.get(i).getPrice(), filmList.get(i).getCertString(), filmList.get(i).getNoOfTickets());
        }
        System.out.println();
    }

    public static void selectFilm(){

        int input;
        //loops round until input between 1 and size of list
        do{
            System.out.println("Please select a film to watch (1-" + filmList.size() + "):");
            input = scnr.nextInt();
        }while(input < 1 || input > filmList.size());

        selection = input-1; //no of users film selection

        if(newCustomer.checkAge(newCustomer.getAge(), filmList.get(selection).getCertification())){
            System.out.println("You are old enough to watch " + filmList.get(selection).getTitle() + "!");
            buyTickets(selection);
        }else{
            System.out.println("You are not old enough to watch " + filmList.get(selection).getTitle() + "!");
            System.exit(0);
        }
    }

    public static void buyTickets(int selection){

        System.out.println(filmList.get(selection).getTitle() + ": " + filmList.get(selection).getNoOfTickets());
        System.out.println("How many tickets do you want to buy?");

        numTickets = scnr.nextInt();

        if(numTickets > filmList.get(selection).getNoOfTickets()){
            char c;
            System.out.println("Sorry, there are not enough tickets available!");
            do{
                System.out.println("Do you want to choose a different film? (Y or N)");
                c = scnr.next().charAt(0);
            }while(c != 'Y' && c != 'y' && c != 'N' && c != 'n');

            if(c == 'Y' || c == 'y'){
                showFilms();

                selectFilm();
            }else{
                System.out.println("Goodbye");
                System.exit(0);
            }

        }else{
            filmList.get(selection).buyTicket(numTickets);
        }
    }

    public static void printReceipt(int numTickets, int selection){

        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy\nHH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);

        System.out.println("-------RECEIPT-------");
        System.out.println("Customer: " + newCustomer.getName());
        System.out.println("Film: " + filmList.get(selection).getTitle());
        System.out.println("Rating: " + filmList.get(selection).getCertString());
        System.out.println("No. of tickets: " + numTickets);
        System.out.println("Price: £" + filmList.get(selection).getPrice() * numTickets + "\n");
        System.out.println(formattedDate + "\n");
    }
}
