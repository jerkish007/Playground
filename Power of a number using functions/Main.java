import java.util.Scanner;
class Main{
  public static double power(double base, double expo)
  {
   double result = Math.pow(base, expo);
    return result;
  }
	public static void main (String[] args){
	 Scanner in = new Scanner(System.in);
      double num = in.nextDouble();
      double num2= in.nextDouble();
      double val=power(num,num2);
      System.out.println(val);
    }
}
