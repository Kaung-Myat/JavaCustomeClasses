package customClasses;

import java.io.IOException;

public class mainClass extends getPublicLocation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			setPulicSource("loc");
            String publicAddress = getPublicAddress();
            System.out.println("Public Address: " + publicAddress);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
