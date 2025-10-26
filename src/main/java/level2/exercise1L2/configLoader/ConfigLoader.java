package level2.exercise1L2.configLoader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigLoader {

	private final Properties FILE_OUT = new Properties();


	public ConfigLoader(String filePath) {

		try (FileInputStream fileFound = new FileInputStream(filePath)) {

			FILE_OUT.load(fileFound);

		} catch (
				  IOException e) {
			throw new RuntimeException("Error loading propierties file." + e.getMessage());
		}
	}


	public String getDirectory(){
			return FILE_OUT.getProperty("directory");
		}

	public String getFile(){
		return  FILE_OUT.getProperty("outFile");
	}
}
