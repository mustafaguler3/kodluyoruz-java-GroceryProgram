import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.println("how many kilos of pear did you buy? Enter: ");
        int a = scan.nextInt();
        System.out.println("how many kilos of apples did you buy? Enter: ");
        int e = scan.nextInt();
        System.out.println("how many kilos of tomatoes did you buy? Enter: ");
        int d = scan.nextInt();
        System.out.println("how many kilos of banana did you buy? Enter: ");
        int m = scan.nextInt();
        System.out.println("how many kilos of eggplant did you buy? Enter: ");
        int p = scan.nextInt();

        double totalPrice = ((a*2.14) +(e*3.67)+(d*1.11)+(m*0.95)+(p*5));
        
        System.out.println("Wage you will pay for: "+totalPrice);
		
		
	}

}
