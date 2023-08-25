package com.example.springbootconfigpropsinheritedpojoprop;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "my.props")
public class ConfigPropsWithInheritedPojoProps {
	private String property1;
	private NestedPojoPojo property2;

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public NestedPojoPojo getProperty2() {
		return property2;
	}

	public void setProperty2(NestedPojoPojo property2) {
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
}