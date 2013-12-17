package ning.codelab.hello;

import com.google.inject.Inject;

/**
 * A small class that implements a "message service." For simplification, the
 * service delegates to the message configured by the configuration object.
 * In the future, more complex logic may be enabled.
 */
public class HelloResource
{
    private final MyConfig config;
    private final DateConfig dc;

    
    @Inject
    public HelloResource(MyConfig config,DateConfig d)
    {
        this.config = config;
        this.dc = d;
    }

    /**
     * The "message service" implementation.
     */
    public String getMessage()
    {
    	
        return config.getMessage();
    }
    
    
    public String displayMessage() {
    	int hour = dc.displayMessageOnTime();
    	if(hour>= 00 && hour< 12)
			return "Good Morning";
		else if (hour>=12 && hour <16)
			return "Good Afternoon";
		else if (hour>=16 && hour <21)
			return "Good Evening";
		else if (hour>=21 && hour <24)
			return "Good Night";
		else
			return "Invalid";
    	
	}

}
