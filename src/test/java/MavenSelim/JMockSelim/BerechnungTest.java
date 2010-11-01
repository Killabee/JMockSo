package MavenSelim.JMockSelim;

import org.jmock.Expectations;
import org.jmock.Mockery;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnit4Mockery;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JMock.class)
public class BerechnungTest {
	
	/** jmock context */
    Mockery context;
    
    @Before
    public void setUp() {
        context = new JUnit4Mockery();
    }
    
    @Test
    public void addiere() {
    	final IBerechnung berechnung = context.mock(IBerechnung.class);
    	
    	context.checking(new Expectations(){{
    		berechnung.addiere(1, 2);
    	}});
    	
    	berechnung.addiere(1, 2);
    }
}
