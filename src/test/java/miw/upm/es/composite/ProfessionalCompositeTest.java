package miw.upm.es.composite;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import miw.upm.es.Professional;

public class ProfessionalCompositeTest {

    private ProfessionalComponent root;

    private ProfessionalComponent sub1;

    private ProfessionalComponent sub11;

    private ProfessionalComponent sub12;

    private ProfessionalComponent leaf;
    
    public Professional professional1 = new Professional((long) 11111111);
    public Professional professional2 = new Professional((long) 22222222);
    public Professional professional3 = new Professional((long) 33333333);
   

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void ini() {
        this.root = new ProfessionalComposite("raiz");

        this.leaf = new ProfessionalLeaf(professional1);
        this.root.add(leaf);
        this.sub1 = new ProfessionalComposite("sub1");
        this.root.add(sub1);
        this.root.add(new ProfessionalLeaf(professional2));

        this.sub11 = new ProfessionalComposite("sub11");
        this.sub1.add(sub11);
        this.sub1.add(new ProfessionalLeaf(professional3));
        this.sub12 = new ProfessionalComposite("sub12");
        this.sub1.add(sub12);
    }


    @Test
    public void testAddLeaf() {
        exception.expect(UnsupportedOperationException.class);
        this.leaf.add(new ProfessionalLeaf(professional1));
    }
    
    @Test
    public void testViewLeaf() {
    	assertEquals(Long.toString(professional1.getPhone()), this.leaf.view());
    }

    @Test
    public void testViewComposite() {
    	assertEquals("sub1", this.sub1.view());
    }
    
    @Test
    public void testToString() {
    	assertEquals("sub1", this.sub1.view());
    }
    
}
