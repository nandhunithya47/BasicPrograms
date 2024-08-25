import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1=0,n2=1,i,count,n3;
        System.out.println("Enter the last digit: ");
        count= scanner.nextInt();
        System.err.println(n1);
        
        for(i=2;i<=count;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            scanner.close();
        }
    }
}