package nkmg1c;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Company implements ApplicationContextAware {
    private Address address;
    private String appId;

    public Company(Address address) {
        this.address = address;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
            this.appId = applicationContext.getId();
    }


    public Address getAddress(){return this.address;}


}

