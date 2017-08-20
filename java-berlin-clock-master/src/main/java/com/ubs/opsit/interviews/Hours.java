package com.ubs.opsit.interviews;

/**
 * @author Ankur Mittal
 *
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hours implements TimeUnit {
	private static final Logger LOG = LoggerFactory.getLogger(Hours.class);
	// Switch Off all Red Lights
	 private static final String ALL_RED_LIGHTS_OFF = "OOOO";
	   
	 	/** This is method for top row of Berlin Clock 
	 	 * which has four red lamps and each represents 5 hours
	 	 * 
	 	 * @param hours
	 	 * @return Switched ON Red Lamps
	 	 */
	    public String getLampForHoursMultipleOfFive(int hours) {
	        StringBuffer lamps = new StringBuffer(ALL_RED_LIGHTS_OFF);
	        for (int i = 0; i < (hours / 5); i++) {
	            lamps.replace(i, i + 1, "R");
	        }
	        LOG.debug("Status of First Row Lamps::"+lamps.toString());
	        return lamps.toString();
	    }
	    /**
	     * This is method for second row of Berlin Clock 
	 	 * which has four red lamps and each represents 1 hour
	     * @param hours
	     * @return switched ON Red Lamps 
	     */
	    public String getLampForSingleHours(int hours) {
	        StringBuffer lmp = new StringBuffer(ALL_RED_LIGHTS_OFF);
	        for (int i = 0; i < (hours % 5); i++) {
	            lmp.replace(i, i + 1, "R");
	        }
	        LOG.debug("Status of Second Row Lamps::"+lmp.toString());
	        return lmp.toString();
	    }

	   
	    @Override
	    /** This method get the hours as input to figured out 
	     * how many Red lamps need to be Switch ON
	     @param hrs
	     * @return switched ON  all Red Lamps 
	     */
	    public String getLamps(int hrs) {

	        return getLampForHoursMultipleOfFive(hrs) + "\n" + getLampForSingleHours(hrs);
	    }
}
