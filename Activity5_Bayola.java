import java.util.Scanner;

public class Activity5_Bayola {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("This is a program which loops a number based on a user input. ");
        System.out.println("Please enter a number which will be the limit of your loop: ");
        int limit=scanner.nextInt();
        System.out.println("Your program will be looped by: ");
        int loop=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please choose whether in an increasing or decreasing order(In any chracter casing, type Decrease or Increase): ");
        String order=scanner.nextLine();
        if (order.equalsIgnoreCase("Increase")){
            for (int i=0; i<=limit; i+=loop){
                System.out.println(i);
            }
        } else if (order.equalsIgnoreCase("Decrease")){
            for (int i=limit; i>=0; i-=loop){
                System.out.println(i);
            }
        } else {
            System.out.println("Invalid input. Please enter either 'Increase' or 'Decrease'.");
        }
        String result = (order.equalsIgnoreCase("Increase")) ? "increasing" : "decreasing";
        scanner.close();
    }
}
