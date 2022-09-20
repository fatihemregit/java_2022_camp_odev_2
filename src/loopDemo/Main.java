package loopDemo;

public class Main {

	public static void main(String[] args) {
		
		//for loop
		
		for (int i = 1;i<10;i+=2) {
			System.out.println(i);
		}
		System.out.println("For Dongusu Bitti");
		
		//while loop
		int i = 1;
		while(i < 10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Dongusu Bitti");
		// "Do While" loop
		int j = 100;
		//while  ile do while ın farkı şart sağlanmasa bile döngüye 1  defa girerken while da şart sağlanmadığı zaman döngüye girmez ve biter
		do{
			System.out.println(j);
			j += 2;
		} while(j<10);
		System.out.println("Do While Dongusu Bitti");
		
	}
	
}