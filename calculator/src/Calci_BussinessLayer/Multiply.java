package Calci_BussinessLayer;
import Dataconnection_Layer.Connect;
public class Multiply {
	Connect co=new Connect();
	int result;
	public void mul(int a,int b) {
		result=a*b;co.dbmsConnect(a,b,"multiplication",result);
	}
}
