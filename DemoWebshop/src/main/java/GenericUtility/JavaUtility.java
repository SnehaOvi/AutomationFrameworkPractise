package GenericUtility;

import java.time.LocalDateTime;

public class JavaUtility {
	/**
	 * This method will capture current date and time and return by replacing : with -
	 * @return current system date and time
	 */

	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	

}
