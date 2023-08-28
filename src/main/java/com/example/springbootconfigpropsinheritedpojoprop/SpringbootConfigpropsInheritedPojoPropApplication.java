package com.example.springbootconfigpropsinheritedpojoprop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootConfigpropsInheritedPojoPropApplication implements CommandLineRunner {

    private final ConfigPropsWithInheritedPojoProps configPropsWithInheritedPojoProps;
    private final ChildProperties childProperties;

    public SpringbootConfigpropsInheritedPojoPropApplication(ConfigPropsWithInheritedPojoProps configPropsWithInheritedPojoProps, ChildProperties childProperties) {
        this.configPropsWithInheritedPojoProps = configPropsWithInheritedPojoProps;
        this.childProperties = childProperties;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigpropsInheritedPojoPropApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println("inherited properties:");
        System.out.println(configPropsWithInheritedPojoProps.getProperty2().getInheritedProp());
        System.out.println(childProperties.getParentProp());
        System.out.println("**********************************");
    }
}
