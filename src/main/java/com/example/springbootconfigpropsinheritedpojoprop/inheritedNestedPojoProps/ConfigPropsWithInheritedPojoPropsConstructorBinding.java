package com.example.springbootconfigpropsinheritedpojoprop.inheritedNestedPojoProps;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "my.props1")
public class ConfigPropsWithInheritedPojoPropsConstructorBinding {
	private final String property1;
	private final NestedPojoPojo property2;

	public ConfigPropsWithInheritedPojoPropsConstructorBinding(String property1, NestedPojoPojo property2) {
		this.property1 = property1;
		this.property2 = property2;
	}

	public static class NestedPojoPojo extends NestedPojoParent {
		private String nestedProp; // this property is recognized

		public String getNestedProp() {
			return nestedProp;
		}

		public void setNestedProp(String nestedProp) {
			this.nestedProp = nestedProp;
		}
	}
	
	public static abstract class NestedPojoParent {
		private String inheritedProp;  // this property is not recognized

		public String getInheritedProp() {
			return inheritedProp;
		}

		public void setInheritedProp(String inheritedProp) {
			this.inheritedProp = inheritedProp;
		}
	}

	public String getProperty1() {
		return property1;
	}



	public NestedPojoPojo getProperty2() {
		return property2;
	}



}