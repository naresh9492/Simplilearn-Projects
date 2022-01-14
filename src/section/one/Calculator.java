package section.one;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2, choice=0;
		//scanner class object to read values
        Scanner sc=new Scanner(System.in); 
         
        System.out.print("Enter first number: ");
        num1=sc.nextInt();
        System.out.print("Enter second number: ");
        num2=sc.nextInt();
        System.out.print("\n1: Addition.\n2: Subtraction.");
        System.out.print("\n3: Multiplication.\n4: Divide.");
        
          
        System.out.print("\nEnter your choice: ");
        choice=sc.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println(num1+num2); break;
            case 2:
                System.out.println(num1-num2); break;
            case 3:
                System.out.println(num1*num2); break;
            case 4:
                System.out.println(num1/num2); break;
           
            default:
                System.out.println("An Invalid Choice!!!!\n");
              

	}
         }
}
