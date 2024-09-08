import java.util.Scanner;
public class RandomNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Min number: ");
        int min = scanner.nextInt();
        System.out.println("Enter the max number: ");
        int max = scanner.nextInt();
        double RandomNumber1 = Math.random()*(max-min+1)+min;
        System.out.println("Random Number between "+min+ " and " +max+ " in double datatype is " +RandomNumber1);
        int RandomNumber2 = (int)(Math.random()*(max-min+1)+min);
        System.out.println("Random Number between "+min+ " and " +max+ " in int datatype is " +RandomNumber2);
        scanner.close();
    }
    
}
