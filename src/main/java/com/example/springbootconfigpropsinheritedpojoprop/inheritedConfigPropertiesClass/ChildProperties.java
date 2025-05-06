package com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(prefix = "my.props2")
public class ChildProperties extends ParentProperties {
    /**
     * String-type property defined in the ChildProperties class
     */
    private String childProp;
    /**
     * POJO-type property defined in the ChildProperties class
     */
    @NestedConfigurationProperty
    private SomePojo childPojoProp;

    public String getChildProp() {
        return childProp;
    }

    public void setChildProp(String childProp) {
        this.childProp = childProp;
    }

    public SomePojo getChildPojoProp() {
        return childPojoProp;
    }

    public void setChildPojoProp(SomePojo childPojoProp) {
        this.childPojoProp = childPojoProp;
    }
}