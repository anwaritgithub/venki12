package log24j;

import java.awt.JobAttributes.DialogType;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	
	private static final Logger log = LogManager.getLogger(Test.class);
	
	
	public static void main(String[] args) {

		processsData();
	}

	public static void processsData() {
		
		log.trace("FROM TRACE METHOD");
		log.info("FROM INFO METHOD");
		log.debug("FROM DEBUG METHOD");
		log.warn("FROM WARN METHOD");
		log.error("FROM ERROR METHOD");
		log.fatal("FROM FACTAL METHOD");
		log.fatal("FROM FACTAL METHOD");
		log.fatal("FROM FACTAL METHOD");
		System.out.println("completed");
		
	}

}
