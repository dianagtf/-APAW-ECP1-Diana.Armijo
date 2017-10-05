package miw.upm.es.builder;

public class ProfessionalBuilder {
	
	private Professional professional;
	
	public ProfessionalBuilder(long phone) {
        this.professional = new Professional(phone);
    }
	public ProfessionalBuilder() {
        this(0);
    }
	
	public ProfessionalBuilder phone(long phone) {
		professional.setPhone(phone);
		return this;
	}
	
	public ProfessionalBuilder city(long city) {
		professional.setCity(city);
		return this;
	}
	
	public ProfessionalBuilder type(String type) {
		professional.setType(type);
		return this;
	}
	
	public Professional build() {
        return professional;
    }
	
}
