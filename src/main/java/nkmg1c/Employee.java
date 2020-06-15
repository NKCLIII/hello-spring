package nkmg1c;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;



@Entity
@Table(name = "employees")
public class Employee {
    private long id;
    private String first;
    private String last;
    private String email;

    public Employee(){}
    public Employee(String first, String last, String email){
        this.first = first;
        this.last = last;
        this.email = email;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId(){return this.id;}
    public void setId(long id){this.id = id;}

    @Column(name="first", nullable=false)
    public String getFirst(){return this.first;}
    public void setFirst(String first){this.first = first;}

    @Column(name="last", nullable=false)
    public String getLast(){return this.last;}
    public void setLast(String last){this.last = last;}

    @Column(name="email", nullable=false)
    public String getEmail(){return this.email;}
    public void setEmail(String email){this.email = email;}
}
