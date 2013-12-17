package test.ning.codelab.hello;

import ning.codelab.hello.HelloResource;
import ning.codelab.hello.HelloServerModule;

import org.testng.annotations.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.ning.modules.AfternoonModule;
import com.ning.modules.EveningModule;
import com.ning.modules.MorningModule;
import com.ning.modules.NightModule;

/**
 * HelloResource TestNG module.
 */
public class HelloResourceTest
{
    
    private HelloResource useGuiceToInstantiateMorning()
    {
        Injector injector = Guice.createInjector(new HelloServerModule(),new MorningModule());
        HelloResource theHello = injector.getInstance(HelloResource.class);
        return theHello;
    }
    
    private HelloResource useGuiceToInstantiateEvening()
    {
        Injector injector = Guice.createInjector(new HelloServerModule(),new EveningModule());
        HelloResource theHello = injector.getInstance(HelloResource.class);
        return theHello;
    }

    
    private HelloResource useGuiceToInstantiateAfternoon()
    {
        Injector injector = Guice.createInjector(new HelloServerModule(),new AfternoonModule());
        HelloResource theHello = injector.getInstance(HelloResource.class);
        return theHello;
    }

    private HelloResource useGuiceToInstantiateNight()
    {
        Injector injector = Guice.createInjector(new HelloServerModule(),new NightModule());
        HelloResource theHello= injector.getInstance(HelloResource.class);
        return theHello;
    }
    
    
    
    @Test
    public void testMorning()
    {
    	HelloResource theHello = useGuiceToInstantiateMorning();
    	assert "Good Morning".equals(theHello.displayMessage());
    }
    
    @Test
    public void testAfternoon()
    {
    	HelloResource theHello = useGuiceToInstantiateAfternoon();
    	assert "Good Afternoon".equals(theHello.displayMessage());
    }
    
    @Test
    public void testEvening()
    {
    	HelloResource theHello = useGuiceToInstantiateEvening();
    	assert "Good Evening".equals(theHello.displayMessage());
    }
    
    @Test
    public void testNight()
    {
    	HelloResource theHello = useGuiceToInstantiateNight();
    	assert "Good Night".equals(theHello.displayMessage());
    }
   
	
/*   private HelloResource useGuiceToInstantiateTheHelloResource()
     {
         Injector injector = Guice.createInjector(new HelloServerModule());
         HelloResource theHello = injector.getInstance(HelloResource.class);
         return theHello;
     }
     
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
    }*/
}
