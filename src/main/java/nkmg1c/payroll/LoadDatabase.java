package nkmg1c.payroll;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@Entity
class Employee {
    private @Id @GeneratedValue Long id;
    private String name;
    private String role;


    public Employee(String name, String role){
        this.name = name;
        this.role = role;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String name(){return this.name;}
    public String role(){return this.role;}
    public void setName(String name){ this.name = name; }
    public void setRole(String role){ this.role = role; }
};


@Configuration
@EnableJpaRepositories(basePackages="nkmg1c.payroll", entityManagerFactoryRef="initDatabase")
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {

        return args -> {
            Employee tmp = new Employee("Bilbo Baggins", "burglar");
            repository.save(tmp);
            tmp = new Employee("Frodo Baggins", "thief");
            repository.save(tmp);
            System.out.println("Employee a: " + tmp.name() + " b: " + tmp.role());
        };
    }

}
