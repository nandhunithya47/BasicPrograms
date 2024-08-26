import java.util.Scanner;
public class AsciiValue {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter Character to find ascii value: ");
        char x = scanner.next().charAt(0);
        System.out.println("enter Character to find ascii value: ");
        char y = scanner.next().charAt(0);
        int AsciiValue1=x;
        int AsciiValue2=y;
        System.out.println("AsciiValue of "+ x+" is "+AsciiValue1);
        System.out.println("AsciiValue of "+y+" is "+AsciiValue2);
        scanner.close();
    }
    
}
