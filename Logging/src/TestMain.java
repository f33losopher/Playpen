import org.apache.log4j.*;

public class TestMain {
	
	public static final Logger log = LogManager.getLogger(TestMain.class);

	public static void main(String[] args) {
		
		log.log(Level.ALL, "ALL Message");
		log.log(Level.TRACE, "TRACE Message");
		log.log(Level.INFO, "INFO Message");
		log.log(Level.DEBUG, "DEBUG Message");
		log.log(Level.WARN, "WARN Message");
		log.log(Level.ERROR, "ERROR Message");
		log.log(Level.FATAL, "FATAL Message");
		
		log.trace("Using log.trace()");
		log.info("Using log.info()");
		log.debug("Using log.debug()");
		log.warn("Using log.warn()");
		log.error("Using log.error()");
		log.fatal("Using log.fatal()");
	
	}
}
