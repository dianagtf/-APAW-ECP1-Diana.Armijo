package miw.upm.es.builder;

public class Professional {
	
	private long phone;
	
	private long city;
	
	private String type;
	
	public Professional(long phone) {
        this.phone = phone;
    }
	
	public long getPhone() {
		return phone;
	}
	public long getCity() {
		return city;
	}
	public String getType() {
		return type;
	}
	
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public void setCity(long city) {
		this.city = city;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
