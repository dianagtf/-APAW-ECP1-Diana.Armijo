package miw.upm.es.composite;

import java.util.ArrayList;
import java.util.List;


public class ProfessionalComposite extends ProfessionalComponent{

	 private String nombre;

	    private List<ProfessionalComponent> lista;

	    public ProfessionalComposite(String nombre) {
	        this.nombre = nombre;
	        this.lista = new ArrayList<>();
	    }

	    @Override
	    public void add(ProfessionalComponent professionalComponent) {
	        assert professionalComponent != null;
	        this.lista.add(professionalComponent);
	    }

	    @Override
	    public void remove(ProfessionalComponent ProfessionalComponent) {
	        assert ProfessionalComponent != null;
	        this.lista.remove(ProfessionalComponent);
	    }
	    
	    @Override
		public String view() {
			return this.nombre;
		}


	    @Override
	    public String toString() {
	        return "[" + this.nombre + "]";
	    }

		

}
