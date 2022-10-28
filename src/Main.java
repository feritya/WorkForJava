// class
public class Main {

	public static void main(String[] args) {
		CustomerManager customer = new CustomerManager();
		CustomerManager customer2 = new CustomerManager();
		customer = customer2;
		customer.Add();
		customer.Remove();
		customer.Update();
//steack  and heap
		int s1 = 10;
		int s2 = 20;
		s1 = s2;
		s2 = 30;
		System.out.println(s1);
		int[] sayılar1 = new int[] { 1, 2, 3 };
		int[] sayılar2 = new int[] { 4, 5, 6 };
		sayılar1 = sayılar2;
		sayılar1[0] = 10;
		System.out.println(sayılar2[0]);
	}

}
