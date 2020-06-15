package nkmg1c;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
class Address implements ApplicationContextAware {
    final private String street;
    final private int number;
    private String appId;

    public Address() {
        this.street = "DEFAULT_STREET";
        this.number = -1;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext){
        this.appId = applicationContext.getId();
    }

    @Override
    public String toString(){ return "Address -- Street: " + this.street + "\nNumber: " + this.number ;}
    // getters and setters
    public String getStreet(){return this.street;}
    public int getNumber(){return this.number;}
}