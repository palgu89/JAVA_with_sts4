package dbservice;

public class WebApplication {

	public static void main(String[] args) {
		Service svc = new WebService();
		svc.read();	// WebService의 read => DataBase의 select => Oracle의 connect, select
		
		Service svc2 = new WebService();
		svc2.read();
	}

}
