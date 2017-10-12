package miw.upm.es.composite;

import miw.upm.es.Professional;

public class ProfessionalLeaf extends ProfessionalComponent{
	
	private Professional professional;

    public ProfessionalLeaf(Professional professional) {
        this.professional = professional;
    }

	@Override
	public String view() {
		return Long.toString(professional.getPhone());
	}

	@Override
	public void add(ProfessionalComponent professionalComponent) {
		throw new UnsupportedOperationException("Operación no soportada");
	}

	@Override
	public void remove(ProfessionalComponent professionalComponent) {
		//Do nothing because is a leaf
	}

}
