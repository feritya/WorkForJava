
public class Main {

	public static void main(String[] args) {
	 CustomerManager customer = new CustomerManager();
	 customer.databaseManager = new MySqlDataBaseManager();
	 customer.getCustomer();
	 
	}

}
