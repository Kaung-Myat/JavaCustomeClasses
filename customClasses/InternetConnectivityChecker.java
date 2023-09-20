package customClasses;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;



public class InternetConnectivityChecker {
	
	public static void main(String[] args) {
        if (isInternetConnected()) {
            System.out.println("Internet is connected.");
        } else {
            System.out.println("Internet is not connected.");
        }
    }
	
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
