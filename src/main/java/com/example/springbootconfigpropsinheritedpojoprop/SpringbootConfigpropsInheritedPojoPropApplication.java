package com.example.springbootconfigpropsinheritedpojoprop;

import com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass.ChildProperties;
import com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass.ChildPropertiesConstructorBinding;
import com.example.springbootconfigpropsinheritedpojoprop.inheritedNestedPojoProps.ConfigPropsWithInheritedPojoProps;
import com.example.springbootconfigpropsinheritedpojoprop.inheritedNestedPojoProps.ConfigPropsWithInheritedPojoPropsConstructorBinding;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootConfigpropsInheritedPojoPropApplication implements CommandLineRunner {

    private final ConfigPropsWithInheritedPojoProps configPropsWithInheritedPojoProps;
    private final ChildProperties childProperties;
    private final ConfigPropsWithInheritedPojoPropsConstructorBinding configPropsWithInheritedPojoPropsConstructorBinding;
    private final ChildPropertiesConstructorBinding childPropertiesConstructorBinding;

    public SpringbootConfigpropsInheritedPojoPropApplication(ConfigPropsWithInheritedPojoProps configPropsWithInheritedPojoProps, ChildProperties childProperties, ConfigPropsWithInheritedPojoPropsConstructorBinding configPropsWithInheritedPojoPropsConstructorBinding, ChildPropertiesConstructorBinding childPropertiesConstructorBinding) {
        this.configPropsWithInheritedPojoProps = configPropsWithInheritedPojoProps;
        this.childProperties = childProperties;
        this.configPropsWithInheritedPojoPropsConstructorBinding = configPropsWithInheritedPojoPropsConstructorBinding;
        this.childPropertiesConstructorBinding = childPropertiesConstructorBinding;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootConfigpropsInheritedPojoPropApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("**********************************");
        System.out.println("=== inherited pojo properties:");
        System.out.println(configPropsWithInheritedPojoProps.getProperty2().getInheritedProp());
        System.out.println(configPropsWithInheritedPojoPropsConstructorBinding.getProperty2().getInheritedProp());;
        System.out.println("=== inherited configuration properties:");
        System.out.println(childProperties.getParentProp());
        System.out.println(childProperties.getChildPojoProp().getPojoProp());
        System.out.println(childProperties.getParentPojoProp().getPojoProp());
        System.out.println(childPropertiesConstructorBinding.getParentProp());
        System.out.println(childPropertiesConstructorBinding.getChildPojoProp().getPojoProp());
        System.out.println(childPropertiesConstructorBinding.getParentPojoProp().getPojoProp());
        System.out.println("**********************************");
    }
}
