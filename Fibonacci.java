import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) 
	{
		 int maxNumber = 0, previousNumber = 0, nextNumber = 1;
		    //output
		    System.out.println("How many numbers you want in Fibonacci:");
		    //input
	        Scanner scanner = new Scanner(System.in);
	        maxNumber = scanner.nextInt();
	        //output
	        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");
	        
            //например maxNumber=10
	        int i=1;
	        //цикл
	        while(i <= maxNumber)
	        {
	            System.out.print(previousNumber+" ");
	            int sum = previousNumber + nextNumber;
	            previousNumber = nextNumber;
	            nextNumber = sum;
	            i++;
	    }
	}
}