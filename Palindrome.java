import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0,r;
        System.out.println("Enter the number: ");
        int p=scanner.nextInt();
        
        int temp=p;
        while(p>0){
            r=p%10;
            sum=(sum*10)+r;
            p=p/10;
        }
        
        if(sum==temp){
             System.out.println("Number is a palindrome");

            }
        else{
             System.out.println("Not a palindrome");
            }
        scanner.close();
        
    }
    
}
