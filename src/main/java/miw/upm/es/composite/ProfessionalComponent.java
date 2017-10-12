package miw.upm.es.composite;

public abstract class ProfessionalComponent {
	
    public abstract String view();
    
    public abstract void add(ProfessionalComponent professionalComponent);
    
    public abstract void remove(ProfessionalComponent professionalComponent);
    
}
