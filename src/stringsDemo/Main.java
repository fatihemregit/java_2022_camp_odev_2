package stringsDemo;

public class Main {

	public static void main(String[] args) {

		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		/*
		System.out.println("Eleman sayısı: " + mesaj.length());
		System.out.println("5.eleman : " + mesaj.charAt(4));//4.indisdeki harfı verir
		System.out.println(mesaj.concat(" Yasasin"));//String ifadenin sonuna verilen paremetreyi ekler.eğer değişken ile kullanılmazsa geçiçi olarak ekler.
		System.out.println(mesaj.startsWith("B"));//String ifade verilen paremetredeki karekter ile başlayıp(true döndürür) başlamadığını(false döndürür.) söyler.(case sensetive)
		System.out.println(mesaj.endsWith("."));//String ifade verilen paremetredeki karekter ile bitip(true döndürür) bitmediğini(false döndürür.) söyler.(case sensetive)
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler,0);//paremetrelere göre istenilen karekterleri getirir
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));// "av" stringin indexini verir(0 dan başlayarak bulur)
		System.out.println(mesaj.lastIndexOf("a"));// "a" stringin indexini verir(sondan dan başlayarak bulur)
		*/
		
		String yeniMesaj = mesaj.replace(" ","-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
		
	}

}
