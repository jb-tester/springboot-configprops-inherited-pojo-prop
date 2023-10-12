package com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class ParentPropertiesConstructorBinding {
    private String parentProp;

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