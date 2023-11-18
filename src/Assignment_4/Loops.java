package Assignment_4;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
	
		Scanner ui1 = new Scanner(System.in);
		Scanner ui2 = new Scanner(System.in);
		Scanner ui3 = new Scanner(System.in);
        System.out.println("Enter a limit: ");
	
	   int N = ui1.nextInt();
	   for(int i=0; i<=N; i=i+4){//to print 1 4 8 12 16 20...upto N 
		   if(i==0) {
			   System.out.print(i+1+" ");
			   continue;
		   }
		System.out.print(" ,"+i);  
	   }
	   System.out.println();
	   
	   System.out.println("====================");
	   
	   System.out.println("Enter a number to print backwards patter upto 0: ");
		
	   int N2 = ui2.nextInt();
	   for(int j=N2; j>=0; j--) {//printing backwards- 5 4 3 2 1 0
		   if(j==0) {//condition to print (,) between the number series
			   System.out.print(j+" ");
		   }else {
			   System.out.print(j+" ,");
		   }
	   }
	   System.out.println();
	   System.out.println("====================");
	  
	   System.out.println("Enter a string: ");
	
	   String a= ui3.nextLine();
	   char[] b = a.toCharArray();
	   for(int c=0; c<b.length; c++) {
		   System.out.print(b[c]+" ");
	   }
	   System.out.println();
	
	
	}

}
