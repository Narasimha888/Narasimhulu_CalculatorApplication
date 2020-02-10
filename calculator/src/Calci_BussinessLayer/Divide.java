package Calci_BussinessLayer;
import Dataconnection_Layer.Connect;
public class Divide {
	Connect co=new Connect();
	int result;
	public void div(int a,int b) {
		result=a/b;
		co.dbmsConnect(a,b,"division",result);
	}
}
