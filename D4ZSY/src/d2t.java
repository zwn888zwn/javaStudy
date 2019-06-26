


public class d2t {
	public static void main(String[] args) {
	
	
		double income = 0,tax=0;

			if (income <= 20000)

				  tax = 1000 + (income - 10000) * 0.15;

				else if (income <= 10000)

				  tax = income * 0.1;

				else if (income <= 20000)

				  tax = 1000 + (income - 10000) * 0.15;
			System.out.println(tax);
	}

}
