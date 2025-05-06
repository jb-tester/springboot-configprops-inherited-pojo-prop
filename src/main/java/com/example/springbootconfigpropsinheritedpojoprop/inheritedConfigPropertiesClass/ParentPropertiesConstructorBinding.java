package com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class ParentPropertiesConstructorBinding {
    /**
     * String-type property defined in the ParentPropertiesConstructorBinding class
     */
    private String parentProp;

    /**
     * POJO-type property defined in the ParentPropertiesConstructorBinding class
     */
    @NestedConfigurationProperty
    private SomePojo parentPojoProp;

    public ParentPropertiesConstructorBinding(String parentProp, SomePojo parentPojoProp) {
        this.parentProp = parentProp;
        this.parentPojoProp = parentPojoProp;
    }

    public String getParentProp() {
        return parentProp;
    }


    public SomePojo getParentPojoProp() {
        return parentPojoProp;
    }

}