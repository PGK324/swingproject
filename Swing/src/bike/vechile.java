package bike;

import java.util.Scanner;

public class vechile {
	
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Car c=new Car();
		bike b=new bike();
		System.out.println("1.car\n2.bike");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter the color");
			b.setCll(s.next());
			System.out.println("Enter the speed");
			b.setSp(s.next());
			System.out.println("Enter the Seats");
			b.setSe(s.next());
			b.display();
		break;
		
		case 2:
			System.out.println("Enter the color");
			c.setCl(s.next());
			System.out.println("Enter the speed");
			c.setSp(s.next());
			System.out.println("Enter the Seats");
			c.setSe(s.next());
			c.display();
			break;
	}

}}



