package miw.upm.es.singleton;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;
public class ProfessionalTest {

	@Test
    public void testIsSingleton() {
        assertSame(Professional.getProfessional(), Professional.getProfessional());
    }

    @Test
    public void testSingletonNotNull() {
        assertNotNull(Professional.getProfessional());
    }
}


