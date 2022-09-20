package sayiBulma;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };

		int aranacak = 6;

		boolean state = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				state = true;
				break;
			}
		}
		if (state) {
			System.out.println(aranacak + " Sayısı dizide var");
		} else {
			System.out.println(aranacak + " Sayısı dizide yok");
		}
	}

}
