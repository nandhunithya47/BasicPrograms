import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.err.println("Enter number of rows: ");
        int r= scanner.nextInt();
        for(int i=0;i<r;i++){
            for(int j=2*(r-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
        scanner.close();
    }
}