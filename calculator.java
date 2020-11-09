import java.util.*;  
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner myObj = new Scanner(System.in);
    System.out.println("Enter a number");
    int number = myObj.nextInt();
    System.out.println("Enter another number");
    int number1 = myObj.nextInt();
    System.out.println("Enter one of the following +, -, x, /");
    char symbol = myObj.next().charAt(0);
    switch(symbol)
      {
	 case '+':
	   System.out.println(number +number1);
	   break;
	 case '-':
	   System.out.println(number-number1);
	   break;
	 case 'x':
	   System.out.println(number*number1);
	   break;
	 case '/':
           System.out.println(number/number1);
           break;
	 default:
	   System.out.println("Please enter numbers");
      }
    
  }
}
