import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
	Scanner in = new Scanner(System.in);
       int num = in.nextInt();
      int sum=0;
      	for(int temp = num; temp>0 ;temp=temp/10){ 
          	int fact = 1;
        int rem=temp%10;
          for(int i=1;i<=rem;i++)
          {
            fact=fact*i;
          }
          
           sum = sum+fact;
        }
      
      if(num==sum)
      {
        	System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
        }
}