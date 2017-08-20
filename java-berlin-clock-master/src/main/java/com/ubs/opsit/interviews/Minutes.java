package com.ubs.opsit.interviews;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ankur Mittal
 *
 */

public class Minutes implements TimeUnit {
	private static final Logger LOG = LoggerFactory.getLogger(Minutes.class);
	  private static final String RED_LIGHT = "R";
	    private static final String YELLOW_LIGHT = "Y";
	    // Switch OFF all Lamps
	    private static final String ALL_FOUR_YELLOW_LIGHTS_OFF = "OOOO";
	    private static final String ALL_ELVN_YELLOW_LIGHTS_OFF = "OOOOOOOOOOO";

	    /**
	     * This method is for third row which has 11 lamps, each lamp denotes 5 minutes.
	     * 3rd, 6th and 9th lamps are Red which denotes first quarter,half and last quarter, 
	     * rest all are yellow lamps
	     * @param mins
	     * @return Status of third row lamps e.g. all lamps ON YYRYYRYYRYY
	     */
	    private String getLampsForMinuteFive(int mins) {
	        StringBuffer lamp = new StringBuffer(ALL_ELVN_YELLOW_LIGHTS_OFF);
	        for (int i = 0; i < mins; i++) {
	            if (0 == (i + 1) % 3) {
	                lamp.replace(i, i + 1, RED_LIGHT);
	                
	            } else {
	            	lamp.replace(i, i + 1, YELLOW_LIGHT);
	            	
	            }
	        }
	        LOG.debug("Status of Third Row Lamps:::"+lamp.toString());
	        return lamp.toString();
	    }
	    /**
	     * This method is for last row which has four yellow lamps, each lamp denotes 1 minute
	     * @param Minutes mins
	     * @return Status of last row lamps e.g. all lamps ON YYYY
	     */
	    private String getLampsForMinuteSingle(int mins) {
	        StringBuffer lamp = new StringBuffer(ALL_FOUR_YELLOW_LIGHTS_OFF);
	        for (int i = 0; i < mins; i++) {
	            lamp.replace(i, i + 1, YELLOW_LIGHT);
	        }
	        LOG.debug("Status of Fourth Row Lamps:::"+lamp.toString());
	        return lamp.toString();
	    }
	    /**
	     * @param Minutes mins
	     * @return Status of last two rows lamps
	     */
	    @Override
	    public String getLamps(int mins) {
	        int minuteDivided = mins / 5;
	        int minuteModule = mins % 5;
	        return getLampsForMinuteFive(minuteDivided) + "\n" + getLampsForMinuteSingle(minuteModule);
	    }
}
