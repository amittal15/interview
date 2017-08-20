package com.ubs.opsit.interviews;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Ankur Mittal
 *
 */
public class Seconds implements TimeUnit {
	private static final Logger LOG = LoggerFactory.getLogger(Seconds.class);	
	  /**
	   * @param seconds s
	   * @return Status of Top Yellow Lamp for Seconds which blinks every 2 seconds 
	   */
	  public String getLamps(int s) {
	        if (0 == s % 2) {
	        	LOG.debug("Status of Top Yellow Lamp:: Y");
	            return "Y";
	        }
	        LOG.debug("Status of Top Yellow Lamp:: O");
	        return "O";
	    }
}
