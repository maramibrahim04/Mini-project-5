import java.util.Scanner;

// this program will find the GCF(greatest common factor) of 2 numbers
// GCF is an important when computing math or science equations

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Find the GCF");
        
        int num1, num2;
        System.out.println("Enter the first number (the larger number out of the two): ");
        num1 = scan.nextInt();
        System.out.println("Enter the second number: ");
        num2 = scan.nextInt();
        
        int gcf = GCF(num1, num2);
        System.out.println("The GCF for " + num1 + " and " + num2 + " is: " + gcf);
        
        

    } 
    
    public static int GCF(int num1, int num2)
    {
        int remainder = num1 % num2;
        if(remainder == 0)
            return num2;
        else
            return GCF(num2, remainder);
        
    }


}//end class
