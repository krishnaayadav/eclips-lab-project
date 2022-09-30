package varargs;

import java.util.*;

public class Amount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
        int choice;
        double balance;
        PigiBank child1= new PigiBank(1,"krishna",50.00d);;
        do
        {
        	System.out.println("enter your choice");
        	System.out.println("enter sr no.");
        	System.out.println("enter name.");
        	System.out.println("Add amount");
        	switch(choice)
        	{
        	case 1 :child1.printPigiBank();
        	  break;
        	case 2 :  System.out.println("Enter the amount to add:");
	        balance = sc.nextDouble();
			child1.add(balance);
			break;  
        	default : System.out.println("Wrong input");
        	
        	}
        	
        	 while(choice!=0);
        }
	}
}
