package intro;

public class Main {

	public static boolean friendsNumber(int number1, int number2) {

		int totalNumber1 = 0;
		int totalNumber2 = 0;

		for (int i = 1; i < number1; i++) {
			if (number1 % i == 0) {
				totalNumber1 += i;

			}
		}
		for (int j = 1; j < number2; j++) {
			if (number2 % j == 0) {
				totalNumber2 += j;

			}
		}

		if (number1 == totalNumber2 && number2 == totalNumber1) {
			return true;
		}
		return false;
	}

	public static boolean perfectNumber(int number) {
		int total = 0;

		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				total += i;

				if (total == number) {
					return true;
				}

			}

		}

		return false;

	}

	public static boolean asalMı(int a) {
		for (int i = 2; i < a; i++) {

			if (a % i == 0) {
				return false;
			}

		}

		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String[] games = {"Red Alert2","Worms"};
		 * 
		 * for(String s : games) { System.out.println(s);
		 * 
		 * 
		 * int sayi1 = 10; int sayi2 = 20;
		 * 
		 * sayi1 =sayi2; sayi2 =100; System.out.println("sayi1 "+ sayi1);
		 * System.out.println("sayi2 "+ sayi2);
		 * 
		 * 
		 * int [] sayilar1 = {0,1,2,3,4}; int [] sayilar2 = {0,10,20,30,40};
		 * 
		 * sayilar1 = sayilar2;
		 * 
		 * sayilar2[0] =100; System.out.println(sayilar1[0]);
		 * 
		 */

		// System.out.println(perfectNumber(28));
		// System.out.println(asalMı(13));

		System.out.println(friendsNumber(18, 19));
	}

}
