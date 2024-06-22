package logical.programs;

//3 33 333 3333 33333
public class NumberOperation {

	public static void main(String[] args) {
		int number =3, update = 0;
		System.out.println("original : "+number);
//		for (int i = 1; i <= 5; i++) {
//			if(i ==1)
//				System.out.print(number+" ");
//			else{
//				update = update * 10 +number;
//				System.out.print(update+" ");
//			}
//		}
		int count =1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=i; j++) {
				if(i<=count){
					System.out.print(number);
				}
			}
			System.out.print(" ");
			count++;
		}
		System.out.println("\nreverse  : "+update);
	}

}
