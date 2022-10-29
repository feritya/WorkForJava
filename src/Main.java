//değişime direnmeyen programlar yapmak programcının sorumluluğundadır
public class Main {

	public static void main(String[] args) {
		OgretmenKredi ogretmenkredi = new OgretmenKredi();
		 
		KrdiUI kreduı = new KrdiUI();
		kreduı.KrediHesapla(ogretmenkredi);
		kreduı.KrediHesapla(new TarımKredi());

	}

}
