package variables;

//HelloWorld
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World!");

	}

}
//Variables
public class Main {

	//case sensitive
	public static void main(String[] args) {
		//camel casing
		int ogrenciSayisi = 11;
		String mesaj = "Öğrenci sayısı : ";
		System.out.println(mesaj + ogrenciSayisi);
		System.out.println("Öğrenci sayım : 9");
	}

}

//Data Types
public class Main {

	public static void main(String[] args) {
		int sayi = 12;
		double sayi2 = 15.9837;
		//ascii
		char karakter = 'A';
		boolean dogruMu = true;
		String sehir = "Ankara";
		System.out.println(sayi2);
		System.out.println(sayi);
		System.out.println(karakter);
		System.out.println(sehir);
		
		if (dogruMu == true) {
			System.out.println(sayi);
		}
	}

}

//Conditionals
public class Main {

	public static void main(String[] args) {
		int sayi = 26;
		//defensive programming
		if(sayi<20) {
			System.out.println("Sayi 20'den kucuktur.");
		}else if(sayi == 20){
			System.out.println("Sayi 20'ye esittir.");
		}else {
			System.out.println("Sayi 20'den buyuktur.");
		}

	}

}

//ReCap Demo
public class Main {

	public static void main(String[] args) {
		int sayi1 =266;
		int sayi2 = 25;
		int sayi3 = 2;
		int enBuyuk = sayi1;
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		if(enBuyuk<sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En buyuk = "+enBuyuk);
	}

}

//Switch Demo
public class Main {

	public static void main(String[] args) {
		char grade = 'D';
		
		switch(grade) {
			case 'A':
				System.out.println("Mukemmel : Gectiniz!");
				break;
			case 'B':
				System.out.println("Cok guzel : Gectiniz!");
				break;
			case 'C':
				System.out.println("Iyi : Gectiniz!");
				break;
			case 'F':
				System.out.println("Maalesef Kaldiniz!");
				break;
			default:
				System.out.println("Gecersiz not girdiniz.");
				
			
		}

	}
	
//Loop Demo
public class Main {

	public static void main(String[] args) {
		//For
		for(int i=2;i<=10;i+=2) {
			System.out.println(i);
		}
		System.out.println("Dongu bitti.");
	}

}

//While Loop
	int i = 1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While dongusu bitti.");
//Do-While
	int j=1;
		do{
			System.out.println(j);
			j+=2;
		}while(j<10);

//arraysDemo
	public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Engin";
		String ogrenci2 = "Derin";
		String ogrenci3 = "Salih";
		String ogrenci4 = "Ahmet";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-----------------------");
		
		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Salih";
		
		for(int i=0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-----------------------");
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
			
		}
		}
		
	}
//ReCap Demo 2
public class Main {

	public static void main(String[] args) {
		double[] myList = {1.2, 6.3, 4.3, 5.6};
		double total = 0;
		double max = myList[0];
		for (double number:myList) {
			if(max<number) {
				max = number; 
			}
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Toplam = " + total);
		System.out.println("En buyuk sayi = " + max);
	}

}
	
//multiDimensionalArrayDemo

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String [3][3];
		
		sehirler[0][0] = "Istanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakir";
		sehirler[2][1] = "Sanliurfa";
		sehirler[2][2] = "Gaziantep";
		
		for(int i=0;i<=2;i++) {
			System.out.println("-----------------");
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}

	}

}
