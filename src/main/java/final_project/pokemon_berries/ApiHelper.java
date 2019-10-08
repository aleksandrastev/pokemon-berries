package final_project.pokemon_berries;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class ApiHelper {
	
	public static JSONObject getRootDirectory(String rootURL) throws MalformedURLException, IOException {
		URL request = new URL(rootURL);
		InputStream openStream = request.openStream();
		String response = IOUtils.toString(openStream);
		JSONObject root = new JSONObject(response);
		return root;
	}

}
