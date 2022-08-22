import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import com.svend.planes.CRUDqueries;
import com.svend.planes.Planes;


public class CRUDqueriesTest {
CRUDqueries cq = new CRUDqueries();


@BeforeClass
public static void setup() {
    System.out.println("Before class");
}

@Test
public void testCreate() {
	Planes testPlane = new Planes("testCompany", 1, "testColour");
	cq.create(testPlane);
	assertEquals("testCompany", testPlane.getCompany());
	assertEquals(1, testPlane.getStand());
	assertEquals("testColour", testPlane.getColour());
}
@Test
public void testCreateWithID() {
	Planes testPlane = new Planes(1000,"testCompany", 1, "testColour");
	cq.create(testPlane);
	assertEquals(1000, testPlane.getId());
	assertEquals("testCompany", testPlane.getCompany());
	assertEquals(1, testPlane.getStand());
	assertEquals("testColour", testPlane.getColour());
}

public void testCreateThrowsException() {
	Planes exceptionPlane = new Planes (0,"WHERE testCompany", 1, "testColour");
	
	cq.create(exceptionPlane);

}


@Test
public void testSetID( ) {
	
	
	
}


}




