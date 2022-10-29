
public class Main {

	public static void main(String[] args) {
		//OgretmenKredi ogretmen = new OgretmenKredi();
		//System.out.println(ogretmen.Hesapla(1000));
		BaseKredi[] krediler = new BaseKredi[] { new OgretmenKredi(), new TarımKredi(), new OgrenciKredi()};
		for (BaseKredi kredi : krediler) {
			System.out.println(kredi.hesapla(1000));
		}

	}

}
