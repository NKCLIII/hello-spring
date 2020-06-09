package nkmg1c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

//		AutowireCapableBeanFactory beanFactory = applicationContext.getAutowireCapableBeanFactory();
		System.out.println("applicationContext variable dump: ");
		System.out.println("display name: " + applicationContext.getDisplayName());
		System.out.println("id: " + applicationContext.getId());

//		System.out.println("  == Bean Factory Info == ");
//		System.out.println(beanFactory.resolveNamedBean(Address.class));

		Company myBean = applicationContext.getBean(Company.class);
		System.out.println(myBean.getAddress());
	}

}
