package miw.upm.es.builder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import miw.upm.es.Professional;

public class ProfessionalBuilderTest {
	
	@Test
    public void testLongLongString() {
		long phone = 555555555;
		
		Professional professional = new ProfessionalBuilder(phone).city(28905).type("Madrid").build();
	
        assertEquals(phone, professional.getPhone());
        assertEquals(28905, professional.getCity());
        assertEquals("Madrid", professional.getType());
    }


}
