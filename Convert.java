import java.util.Scanner;

public class Convert{

    double grams;
    double kilograms;
    String userConvert;
    String userAnswer = "\0";

    Convert(){

        System.out.println("\n-------------------------------------------------------------");
        System.out.println("Mass Converter");

    }

    void convertToKilograms(int amountGrams){

        kilograms = amountGrams/1000.00;

    }

    void convertToGrams(int amountKilograms){

        grams = amountKilograms*1000.00;

    }

    void showMenu(){

        Scanner scanner = new Scanner(System.in);

        do {

            System.out.println("-------------------------------------------------------------");
            
            System.out.print("What would you like to convert? (Grams or Kilograms): ");
            
            userConvert = scanner.nextLine();

            switch(userConvert){

                case "Grams":

                System.out.println("-----------------------------------------------------------");

                System.out.print("Enter the amount of grams you would like to convert: ");

                int userGrams = scanner.nextInt();

                convertToKilograms(userGrams);

                System.out.println("-----------------------------------------------------------");

                System.out.println(userGrams + " grams is equivalent to " + kilograms + " kilograms");

                System.out.println("-----------------------------------------------------------");

                break;


                case "Kilograms":

                System.out.println("-----------------------------------------------------------");

                System.out.print("Enter the amount of kilograms you would like to convert: ");

                int userKilograms = scanner.nextInt();

                convertToGrams(userKilograms);

                System.out.println("-----------------------------------------------------------");
                
                System.out.println(userKilograms + " kilograms is equivalent to " + grams + " grams");

                System.out.println("-----------------------------------------------------------");

                break;

                default:

                System.out.println("That's not an option.");

            }

            System.out.print("Would you like to convert again? (Y/N): ");

            userAnswer = scanner.next();

            switch(userAnswer){

                case "Y":

                showMenu();


                case "N":

                System.out.println("\nGoodbye\n");

                System.exit(0);


                default:

                System.out.println("That's not an option. You're getting kicked for that");

                System.exit(0);

            }



        } while (1 != 0);

    }

}