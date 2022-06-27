package learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLiteralInj {

	public static void main(String... args) {
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = context.getBean("myPerson",Person.class);
		
		System.out.println("Nombre: "+person.getName()+"\nApellido: "+person.getLastName());
		
		context.close();
	}
}
