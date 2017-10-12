package miw.upm.es;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Order {
	
	public int id;
	public Calendar date;
	public BigDecimal amount;
	
	private Professional professional;

    public Order() {
    }

    public Order(BigDecimal amount) {
        this.date = Calendar.getInstance();
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDate() {
        return date;
    }
    
    public void setDate(Calendar date) {
    	this.date = Calendar.getInstance();
    }
    
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    
    public Professional getProfessional() {
        return professional;
    }


    @Override
    public String toString() {
        String formattedDate = new SimpleDateFormat("HH:00 dd-MMM-yyyy ").format(date.getTime());
        return "Order [id=" + id + ", date=" + formattedDate  + ",amount=" + amount + "]" ;
    }
}
