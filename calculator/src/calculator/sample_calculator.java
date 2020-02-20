package calculator;

import java.util.Scanner;

public class sample_calculator {
	
	public static void main(String[] args) {
		
		sub_calculator obj = new sub_calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Basic Calculator");
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Divide");
		String k;
		char ch;
		do{
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		System.out.println("Enter first number :");
		int num1 = sc.nextInt();
		System.out.println("Enter second number :");
		int num2 = sc.nextInt();
		switch(choice){
		case 1:obj.Add(num1,num2);break;
		case 2:obj.Subtract(num1,num2);break;
		case 3:obj.Multiply(num1,num2);break;
		case 4:obj.Divide(num1,num2);break;
		default:break;
		}
		System.out.println("Do you wnat to continue(y/n) : ");
		k = sc.next();
		ch = k.charAt(0);
		}while(ch == 'y');
	}

}
