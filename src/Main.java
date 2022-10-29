//polymorfizm 
public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger (),new ConsolLogger() ,new EmailLogger(), new DataBaseLogger()};
	//	for (BaseLogger logger:loggers) {
		//	logger.Log(" log mesajı");
//}
		CustomerManager customermanager = new CustomerManager(new DataBaseLogger());
				customermanager.add();
	}

}
