package Calci_BussinessLayer;
import Dataconnection_Layer.Connect;
public class Addition {
	Connect co=new Connect();
	int result;
	public void add(int a,int b) {
		result=a+b;
		co.dbmsConnect(a,b,"Addition",result);
	}
}
