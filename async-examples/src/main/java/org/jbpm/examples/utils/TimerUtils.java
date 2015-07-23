package org.jbpm.examples.utils;

public class TimerUtils {

	/**
	 * Lot's of really smart things could happen in here, like date checks
	 * @return
	 */
	public static String calculateTimerInterval(Integer attempt){
		 if ( attempt == 0){
			 return "3s";
		 } else {
			 return "7s";
		 }
		
	}
}
