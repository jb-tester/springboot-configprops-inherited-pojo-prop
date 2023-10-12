package com.example.springbootconfigpropsinheritedpojoprop.inheritedConfigPropertiesClass;

import org.springframework.boot.context.properties.NestedConfigurationProperty;

public class ParentProperties {
    private String parentProp;

    @NestedConfigurationProperty
    private SomePojo parentPojoProp;

    public String getParentProp() {
        return parentProp;
    }

    public void setParentProp(String parentProp) {
        this.parentProp = parentProp;
    }

    public SomePojo getParentPojoProp() {
        return parentPojoProp;
    }

    public void setParentPojoProp(SomePojo parentPojoProp) {
        this.parentPojoProp = parentPojoProp;
    }
}