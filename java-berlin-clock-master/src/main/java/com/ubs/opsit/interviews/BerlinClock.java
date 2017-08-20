package com.ubs.opsit.interviews;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @author Ankur Mittal
 * Berlin Clock Representation
 * Red Lamp ON 'R'
 * Yellow Lamp ON 'Y'
 * Lamp OFF 'O'
 */
public class BerlinClock implements TimeConverter {
	private static final Logger LOG = LoggerFactory.getLogger(BerlinClock.class);	
	 private static List<TimeUnit> timeUnits = new ArrayList<TimeUnit>();
	

	    public static void main(String args[]) {
	       
	    	BerlinClock berlinClock = new BerlinClock();
	    	//Adding each unit into Time Unit Array
	        timeUnits.add(new Seconds());
	        timeUnits.add(new Hours());
	        timeUnits.add(new Minutes());
	        
	       //Pass the time in HH:mm:ss format to convert into Berlin Clock Representation
	  
	       LOG.debug("Berlin Clock Representation::\n"+berlinClock.convertTime("14:36:14"));
	        
	    }
	    /**
		 * @param inputTime 
		 * @return time in Berlin Clock Format
		 */
	    public String convertTime(String time) {
	    	LOG.debug("Input Time::"+time); 
	        StringBuilder berlinTime = new StringBuilder();
	        String[] timeElements = time.split(":");
	        // Swap Hours and Minutes position in timeElements array for Berlin Clock
	        String temp = timeElements[0];
	        timeElements[0] = timeElements[1];
	        timeElements[1] = temp;
	        int i = 0;
	        int j = 2;
	        // Iterating for each time element
	        for (TimeUnit timeUnit : timeUnits) {
	            for(String timeElement : timeElements) {
	            	berlinTime.append(timeUnits.get(i).getLamps(Integer.parseInt(timeElements[j]))).append("\n");
	                i++;
	                j--;
	                break;
	            }
	        }
	        return berlinTime.toString();
	    }
	    	    
}
