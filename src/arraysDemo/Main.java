package arraysDemo;

public class Main {

	public static void main(String[] args) {
		
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		ogrenciler[3] = "Ahmet";
		//ogrenciler[4] = "Ali";
		
		System.out.println("1.for dongusu ile yaziyorum");
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("2.for dongusu ile yaziyorum");

		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
	}//main Function

}//MainClass
