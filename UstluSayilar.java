import java.util.Scanner;

public class UstluSayilar {

	public static void main(String[] args) {
		int gsayi,gsayi1,usttoplam=1;
		Scanner inp = new Scanner(System.in);
		System.out.println("Üssü Alýnacak Sayýyý Giriniz: ");
		gsayi = inp.nextInt();
		System.out.println("Üs Olacak Sayýyý Giriniz: ");
		gsayi1 = inp.nextInt();
		for (int i = 1; i <= gsayi1; i++) {
			usttoplam*=gsayi;
		}
		System.out.println("Sonuc: "+usttoplam);
		
	}

}
