
public class CustomerManager {
	private BaseLogger baselogger;
	public CustomerManager(BaseLogger logger) {
		this.baselogger=logger;
	}
	public void add() {
		System.out.println("musterie klendi");
		this.baselogger.log("log mesajı");
	}
}
