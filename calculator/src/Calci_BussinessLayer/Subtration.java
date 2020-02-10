package Calci_BussinessLayer;
import Dataconnection_Layer.Connect;
public class Subtration {
	Connect co=new Connect();
	int result;
	public void sub(int a,int b) {
		result=a-b;
		co.dbmsConnect(a,b,"subtraction",result);
	}
}
