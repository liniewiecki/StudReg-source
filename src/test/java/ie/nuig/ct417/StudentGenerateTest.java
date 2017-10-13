package ie.nuig.ct417;
import static org.junit.Assert.*;

import org.junit.Test;

import com.nuig.ct417.Student;

public class StudentGenerateTest {

	@Test
	public void testGenerateUsername() {
		
		// setup
		Student student = new Student("Mark", "16-08-1985", 12);
		String expected = "Mark32";
		
		// execute
		
		String result = student.generateUsername();
		
		// assert
		assertEquals(expected, result);
		
	}

}
