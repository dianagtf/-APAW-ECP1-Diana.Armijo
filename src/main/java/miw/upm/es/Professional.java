package miw.upm.es;

public class Professional {
	
	private long phone;
	
	private long city;
	
	private String type;
	
	public Professional(long phone) {
        this.phone = phone;
    }

    public long getPhone() {
        return this.phone;
    }

    public void setPhone(long phone) {
    	this.phone = phone;
    }
    
    public long getCity() {
        return this.city;
    }

    public void setCity(long city) {
    	this.city = city;
    }
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
    	this.type = type;
    }
}
