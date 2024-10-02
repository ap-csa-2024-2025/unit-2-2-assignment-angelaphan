import java.util.Scanner;
public class Classwork
{
  public static void main(String[] args)
  {
    Scanner thomas= new Scanner(System.in);
    System.out.println("What type of item are you buying?");
    String item=thomas.nextLine();
    System.out.println("How many are you buying?");
    int num=thomas.nextInt();
    System.out.println("How much does each one weigh?");
    double weight=thomas.nextDouble(); 
    System.out.println(num+ item+" at "+weight+" pounds each will weigh "+(weight*num)+" pounds total");
    System.out.println(" ");


    System.out.println("\"That brain of mine is something more than merely mortal; as time will show.\"\nAda Lovelace\nThe first computer programmer");
    // write your code
  }
}
