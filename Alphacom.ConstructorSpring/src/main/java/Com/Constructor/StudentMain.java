package Com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("Com/Constructor/ConstructorConfig.xml");
		StudentBio bean = (StudentBio) con.getBean("Bio");
		System.out.println(bean);
		
		GradeDetail add = (GradeDetail) con.getBean("grade");
		add.GradeDetails();
	}
}
