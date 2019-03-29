import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
    int n1=in.nextInt();
    int last=n1/100;
    int second=((n1/10)%10)*10;
    int first=(n1%10)*100;
    int rev=first+second+last;
    System.out.println(rev);
  }
}