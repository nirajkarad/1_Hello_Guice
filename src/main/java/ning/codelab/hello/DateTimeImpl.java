package ning.codelab.hello;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

public class DateTimeImpl implements DateConfig{
	//Using Joda date and time
	private DateTime dt = new DateTime(DateTimeZone.forID("Asia/Calcutta"));
		
	@Override
	public int displayMessageOnTime() {
		int hour=dt.getHourOfDay();
		return hour;
	}
}
