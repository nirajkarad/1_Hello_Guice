package test.ning.codelab.hello;

import ning.codelab.hello.DateConfig;
import ning.codelab.hello.HelloResource;
import ning.codelab.hello.HelloServerModule;

import org.testng.annotations.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ning.modules.AfternoonModule;
import com.ning.modules.MorningModule;
import com.ning.practise.AfternoonImpl;
import com.ning.practise.MorningImpl;

/**
 * HelloResource TestNG module.
 */
public class HelloResourceTest
{

    private HelloResource useGuiceToInstantiateTheHelloResource()
    {
    	
        Injector injector = Guice.createInjector(new HelloServerModule());
        HelloResource theHello = injector.getInstance(HelloResource.class);
        return theHello;
    }
    
    private DateConfig useGuiceToInstantiateMorning()
    {
        Injector injector = Guice.createInjector(new MorningModule());
        DateConfig m = injector.getInstance(DateConfig.class);
        return m;
    }

    
/*    private AfternoonImpl useGuiceToInstantiateAfternoon()
    {
        Injector injector = Guice.createInjector(new AfternoonModule());
        AfternoonImpl a = injector.getInstance(AfternoonImpl.class);
        return a;
    }
*/
    
    
    
    @Test
    public void testMorning()
    {
    	//HelloResource theHello = useGuiceToInstantiateTheHelloResource();
    	//assert dt.getHourOfDay()>=00 && dt.getHourOfDay()<12;
    	DateConfig m = useGuiceToInstantiateMorning();
    	assert m.displayMessageOnTime()>=00 && m.displayMessageOnTime()<12;
    	//assert "Good Morning".equals(theHello.displayMessage());
    }
    
/*    @Test
    public void testAfternoon()
    {
    	HelloResource theHello = useGuiceToInstantiateTheHelloResource();
    	AfternoonImpl a = useGuiceToInstantiateAfternoon();
    	//assert dt.getHourOfDay()>=12 && dt.getHourOfDay()<16;
    	assert a.displayMessageOnTime()>=12 && a.displayMessageOnTime()<16;
    	assert "Good Afternoon".equals(theHello.displayMessage());
    }*/
    
    
    /*@Test
    public void testEvening()
    {
    	HelloResource theHello = useGuiceToInstantiateTheHelloResource();
    	//assert dt.getHourOfDay()>=16 && dt.getHourOfDay()<21;
    	assert "Good Evening".equals(theHello.displayMessage());
    }
    
    @Test
    public void testNight()
    {
    	HelloResource theHello = useGuiceToInstantiateTheHelloResource();
    	//assert dt.getHourOfDay()>=21 && dt.getHourOfDay()<24;
    	assert "Good Night".equals(theHello.displayMessage());
    }*/
    
    
    @Test
    public void testHelloDefault()
    {
        HelloResource theHello = useGuiceToInstantiateTheHelloResource();
        assert "hello, world".equals(theHello.getMessage());
    }

    @Test
    public void testHelloSystemProperty()
    {
        String helloPropertyName = "xn.hello.message"; // see MyConfig class
        String emergencyBroadcastSystem = "this is only a test";
        System.setProperty(helloPropertyName, emergencyBroadcastSystem);

        HelloResource theHello = useGuiceToInstantiateTheHelloResource();
        assert emergencyBroadcastSystem.equals(theHello.getMessage());
    }
}
