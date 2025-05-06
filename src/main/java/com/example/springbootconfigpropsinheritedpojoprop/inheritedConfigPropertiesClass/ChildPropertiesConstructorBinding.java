package com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "my.props3")
public class ChildPropertiesConstructorBinding extends ParentPropertiesConstructorBinding {
    /**
     * String-type property defined in the ChildPropertiesConstructorBinding class
     */
    private final String childProp;

    /**
     * POJO-type property defined in the ChildPropertiesConstructorBinding class
     */
    @NestedConfigurationProperty
    private final SomePojo childPojoProp;

    public ChildPropertiesConstructorBinding(String parentProp, SomePojo parentPojoProp, String childProp, SomePojo childPojoProp) {
        super(parentProp, parentPojoProp);
        this.childProp = childProp;
        this.childPojoProp = childPojoProp;
    }

    public String getChildProp() {
        return childProp;
    }


    public SomePojo getChildPojoProp() {
        return childPojoProp;
    }

}