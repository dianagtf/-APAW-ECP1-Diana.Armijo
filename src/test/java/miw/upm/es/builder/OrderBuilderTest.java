package miw.upm.es.builder;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Calendar;

import org.junit.Test;

import miw.upm.es.Order;

public class OrderBuilderTest {
	
	@Test
    public void testIntCalendarBigDecimal() {
		
		Order order = new OrderBuilder().id(1).date(Calendar.getInstance()).amount(new BigDecimal(1000)).build();
	
        assertEquals(1, order.getId());
        assertEquals(Calendar.getInstance(), order.getDate());
        assertEquals(new BigDecimal(1000), order.getAmount());
    }

}
