package miw.upm.es.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ProfessionalBuilderTest {
	
	@Test
    public void testLongLongString() {
        Professional professional = new ProfessionalBuilder().phone(55555555).city(28905).type("Ciudad").build();

        assertEquals(55555555, professional.getPhone());
        assertEquals(28905, professional.getCity());
        assertEquals("Ciudad", professional.getType());
    }


}
