package customClasses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class InternetConnectivityChecker {
	
	public static boolean isInternetConnected() {
		try {
               InetAddress address = InetAddress.getByName("8.8.8.8");
               return address.isReachable(3000);
        } catch (UnknownHostException e) {
            	return false;
        } catch (IOException e) {
            	return false;
        }
	}
	

}
