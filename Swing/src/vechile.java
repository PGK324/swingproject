import java.util.Scanner;

public class vechile {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Carr c=new Car();
		bikee b=new bike();
		System.out.println("1.car\n2.bike");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			System.out.println("Enter the color");
			b.setColour(s.next());
			System.out.println("Enter the speed");
			b.setSpeed(s.next());
			System.out.println("Enter the Seats");
			b.setSeats(s.next());
			
		
		
		case 2:
			System.out.println("Enter the color");
			c.setColour(s.next());
			System.out.println("Enter the speed");
			c.setSpeed(s.next());
			System.out.println("Enter the Seats");
			c.setSeats(s.next());
			
	}

}}
