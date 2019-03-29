import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      	Scanner in = new Scanner(System.in);
      	int val = in.nextInt();
      	if(val==1)
          	System.out.println("One");
      	else if(val==2)
          	System.out.println("Two");
        else if(val==3)
          	System.out.println("Three");
        else if(val==4)
          	System.out.println("Four");
		else if(val==5)
          	System.out.println("Five");
           else
        	System.out.println("Invalid");
    }
}