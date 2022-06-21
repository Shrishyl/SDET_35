package genaricsUtilities;

import java.util.Date;
import java.util.Random;

/**
 * 
 * @author DELL
 *
 */
public class JavaUtility {
  /**
   * its used to generate a Random number
   * @return
   */

	public int getRandomNUmber() {
		Random random= new Random();
		int randNum=random.nextInt(1000);
		return randNum;
	}
   /**
    * its use to get SystemDateAndTime IST format
    * @return
    */
	public String getSystemDateAndTimeINISTFormat() {
		Date date=new Date();
		return date.toString();
		
	}
	public String getSystemDateAndTime() {
		Date date=new Date();
		String dateTime=date.toString();
		String YYYY=dateTime.split("")[5];
		String DD=dateTime.split(" ")[2];
		String MON=dateTime.split(" ")[1];
		String  format=YYYY+" "+DD+" "+MON;
		return format;		
		
}
}


