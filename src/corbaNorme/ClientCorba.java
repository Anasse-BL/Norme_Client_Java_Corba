package corbaNorme;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.omg.CORBA_2_3;

public class ClientCorba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Context ctx = new InitialContext();
			Object ref = ctx.lookup("NORME");
			VecteurInterface stub = VecteurInterfaceHelper.narrow((org.omg.CORBA_2_3)ref);
			System.out.println(stub.norme(5,4,3));
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
