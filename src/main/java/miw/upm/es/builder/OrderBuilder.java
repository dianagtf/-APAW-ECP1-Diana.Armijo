package miw.upm.es.builder;

import java.math.BigDecimal;
import java.util.Calendar;

import miw.upm.es.Order;

public class OrderBuilder {
	
	private Order order;
	BigDecimal amount;
	
	public OrderBuilder() {
		this(new BigDecimal(0));
	}
	
	public OrderBuilder(BigDecimal amount) {
		this.amount = amount;
		this.order = new Order(amount);
	}
	
	public OrderBuilder id(int id) {
		order.setId(id);
		return this;
	}
	
	public OrderBuilder date(Calendar date) {
		order.setDate(date);
		return this;
	}
	
	public OrderBuilder amount(BigDecimal amount) {
		order.setAmount(amount);
		return this;
	}
	
	public Order build() {
        return order;
    }
	
}
