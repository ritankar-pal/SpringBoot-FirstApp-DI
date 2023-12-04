package in.ineuron.comp;
import org.springframework.stereotype.Component;


@Component(value = "java")
public class JavaCourseMaterial implements ICourse {

	static {
		System.out.println("JavaCourseMaterial.class file generated...)");
	}
	
	public JavaCourseMaterial() {
		System.out.println("JavaCourseMaterial: 0 param constructor is created...");
	}
	
	@Override
	public String courseContent() {
		System.out.println("JavaCourseMaterial.courseContent()");
		return "1. OOPS 2. Exception Handling 3. Collection...";
	}

	@Override
	public float price() {
		return 450.500f;
	}

	@Override
	public String toString() {
		return "JavaCourseMaterial []";
	}
	
}
