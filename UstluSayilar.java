import java.util.Scanner;

public class UstluSayilar {

	public static void main(String[] args) {
		int gsayi,gsayi1,usttoplam=1;
		Scanner inp = new Scanner(System.in);
		System.out.println("�ss� Al�nacak Say�y� Giriniz: ");
		gsayi = inp.nextInt();
		System.out.println("�s Olacak Say�y� Giriniz: ");
		gsayi1 = inp.nextInt();
		for (int i = 1; i <= gsayi1; i++) {
			usttoplam*=gsayi;
		}
		System.out.println("Sonuc: "+usttoplam);
		
	}

}
