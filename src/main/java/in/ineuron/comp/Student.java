package in.ineuron.comp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Student {
	
	@Autowired
	@Qualifier("java")
	private ICourse course;
	
	static {
		System.out.println("Student.class file generated...)");
	}
	
	public Student() {
		System.out.println("Student: 0 param constructor is created...");
	}
	
	public void preparation(String examName) {
		System.out.println("Student.preparation()");
		System.out.println("Course choosen is: " + course.getClass().getName());
		
		String courseContent = course.courseContent();
		float price = course.price();
		
		System.out.println("Preparation is going on for " + courseContent + " purchased for Rs. " + price);
	}

	@Override
	public String toString() {
		return "Student [course=" + course + "]";
	}
	
}
