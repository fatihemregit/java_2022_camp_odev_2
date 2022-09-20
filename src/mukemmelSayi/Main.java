package mukemmelSayi;

public class Main {

	public static void main(String[] args) {
		int sayi = 28;
		int total = 0;
		if(sayi == 0){
			System.out.println(sayi +" sayısı mükemmel sayı değildir.");
			return;
		}
		for(int i = 1; i <sayi; i++) {
			if(sayi % i == 0) {
				total = total + i;
			}
		}
		if(total == sayi) {
			System.out.println(sayi +" sayısı mükemmel sayı dır.");
			//return;
		}else {
			System.out.println(sayi +" sayısı mükemmel sayı değildir.");
			//return;
		}
	}

}
