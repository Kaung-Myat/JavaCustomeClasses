package customClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class getPublicLocation {
	
	private static String path = "https://ipinfo.io/";
	
	
	public static void setPulicSource(String source) {
		path += source;
	}
	
	public static String getPublicIPAddress() throws IOException{
		URL url = new URL(path);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        StringBuilder response = new StringBuilder();
        
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        return response.toString().trim();
	}
}
