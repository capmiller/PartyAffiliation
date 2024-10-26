import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAfilliation = "";

        // create a scanner and read in the PartyAfil
        System.out.println("Enter your party affiliation: ");
        partyAfilliation = in.nextLine();

        if(partyAfilliation.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");

        }
        else if(partyAfilliation.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if(partyAfilliation.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man");
        }
        else
            System.out.println("You belong to another party.");
    }
}