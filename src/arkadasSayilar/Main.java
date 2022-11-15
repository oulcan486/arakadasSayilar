package arkadasSayilar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sayi1=220, toplam1=0;
		int sayi2=284, toplam2=0;
		
		for (int i = 1; i < sayi1; i++) {
			if(sayi1%i==0) {
				toplam1+=i;
			}
			
		}
		
		for (int i = 1; i < sayi2; i++) {
			if(sayi2%i==0) {
				toplam2+=i;
			}
			
		}
		System.out.println(toplam1);
		System.out.println(toplam2);
		
		if(toplam1==sayi2 && toplam2==sayi1) {
			System.out.println("Arkadas Sayilar");
		}else {
			System.out.println("Arkadas sayi değil");
		}

	}

}
