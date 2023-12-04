package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.comp.Student;

@SpringBootApplication
public class SpringBoot2DiApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringBoot2DiApplication.class, args);
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		
		System.out.println();
		student.preparation("oracle java");
		
		
		((ConfigurableApplicationContext) context).close();
	}

}
