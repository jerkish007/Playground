import java.util.Scanner;
class Main
{
  public static int sq(int num)
  {
    return(num*num);
  }
	public static void main (String[] args)
    {
	 Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      	int val = sq(n);
      	n=val;
        System.out.println(n);
	} 
}