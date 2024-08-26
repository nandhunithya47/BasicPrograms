import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=scanner.nextInt();
        int sum=0,digits=0,temp=n;
        while(temp!=0){
            temp=temp/10;
            digits++;
        }
        temp=n;
        while(temp!=0){
            int r=temp%10;
            sum+=Math.pow(r,digits);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("The number is Armstrong number");
        }
        else{
            System.out.println("The number is not Armstrong");
        }
        scanner.close();

    }
    
}
