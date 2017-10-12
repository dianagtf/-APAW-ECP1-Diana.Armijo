package miw.upm.es.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FactoryTest {

    Factory factory;
    Long phone;

    @Before
    public void before() {
        factory = new Factory();
        phone = (long) 55555555;
        
    }

    @Test
    public void testGet() {
        assertEquals((long)55555555 , factory.get(phone).getPhone());
    }

}


