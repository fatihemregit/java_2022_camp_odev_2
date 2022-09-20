package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		char harf = 'I';
		// benim Çözümüm
		char[] kalinSes = { 'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U' };
		char[] inceSes = { 'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü' };
		for (char kalinHarf : kalinSes) {
			if (harf == kalinHarf) {
				System.out.println(harf + " Harfi Kalın Harfdir");
				return;
			}

		}
		for (char inceHarf : inceSes) {
			if (harf == inceHarf) {
				System.out.println(harf + " Harfi İnce Harfdir");
				return;
			}
		}
		System.out.println("Harf Ne kalın Ne de İncedir");
		// hocanın çözümü

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın Sesli Harf");
			break;
		default:
			System.out.println("İnce sesli harf");
		}

	}

}
