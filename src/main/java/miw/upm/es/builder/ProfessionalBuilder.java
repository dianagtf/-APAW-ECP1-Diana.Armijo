package miw.upm.es.builder;

import miw.upm.es.Professional;

public class ProfessionalBuilder {
	
	private Professional professional;
	long phone;
	
	public ProfessionalBuilder(long phone) {
		this.phone = phone;
        this.professional = new Professional(phone);
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
