

 class OddEvenSum {

static int sumNumber(int ...x)
 {
		
        for(int x: args)
		{
	   
	   for(i = 0; i <size; i++)
		{
			if(i % 2 == 0)
			{
				EvenSum = EvenSum + x; 
			}
			else
			{
				OddSum = OddSum + x; 
			}
		}
		}
	
               public static void main(String ...args) 
		{
				sumNumber x = new sumNumber(1,8,6,5,2,5,6,5);
			System.out.println(" The Sum of Even Numbers = " + EvenSum);
			System.out.println(" The Sum of Odd Numbers  = " + OddSum);
		}
	}

}

