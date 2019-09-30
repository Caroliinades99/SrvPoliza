package coop.equidad.config;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.FileBasedConfiguration;
import org.apache.commons.configuration2.PropertiesConfiguration;
import org.apache.commons.configuration2.builder.FileBasedConfigurationBuilder;
import org.apache.commons.configuration2.builder.fluent.Parameters;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class ConfigProperties {
	public static String getProp ( String propName ) {
		String prop = null;
			
		try {
			Configuration config = getConfig();
			prop = config.getString(propName);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	private static Configuration getConfig () throws ConfigurationException {
		Parameters params = new Parameters();
		FileBasedConfigurationBuilder<FileBasedConfiguration> builder =
		    new FileBasedConfigurationBuilder<FileBasedConfiguration>(PropertiesConfiguration.class)
		    .configure(params.properties().setFileName("config.properties"));
		
		return builder.getConfiguration();
		
	}
}
