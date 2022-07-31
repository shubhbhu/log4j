package alpha;

import org.apache.logging.log4j.*;

public class Log4jDemo 
{
	// following code is same for all log classes
	private static Logger log = LogManager.getLogger(Log4jDemo.class.getName());
	public static void main(String[] args) 
	{
		log.debug("i have clicked on button");
		log.info("button is displayed");
		log.error("button is not displayed");
		log.fatal("button is missing");
		
	}
}
