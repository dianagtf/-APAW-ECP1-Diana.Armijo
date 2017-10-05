package miw.upm.es.singleton;

public class Professional {
	
	private static Professional professional = new Professional();
	
	private long phone;
	
	private long city;
	
	private String type;
	
	private Professional() {
	}
	
	public static Professional getProfessional() {
		return professional;
	}
	
	public static void setProfessionalFactory(Professional professional) {
        Professional.professional = professional;
    }
	
	public long getProfessionals() {
		return phone;
	}
	public long getCity() {
		return city;
	}
	public String getType() {
		return type;
	}

	public void addProfessional(long phoneProfessional) {
		this.phone = phoneProfessional;
	}
}
