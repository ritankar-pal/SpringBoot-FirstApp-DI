package in.ineuron.comp;
import org.springframework.stereotype.Component;


@Component(value = "dotNet")
public class DotNetCourseMaterial implements ICourse {
	
	static {
		System.out.println("DotNetCourseMaterial.class file generated...)");
	}
	
	public DotNetCourseMaterial () {
		System.out.println("DotNetCourseMaterial: 0 param constructor is created...");
	}


	@Override
	public String courseContent() {
		System.out.println("DotNetCourseMaterial.courseContent()");
		return "1. C# OOPS, 2. Eception Handling 3. C# Collection";
	}

	@Override
	public float price() {
		return 250.0f;
	}

	@Override
	public String toString() {
		return "DotNetCourseMaterial []";
	}
}
