package au.com.cyberavenue.restdemo.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ToUpperCaseRS {

	String originalString;
	String upperCaseString;
	
	public ToUpperCaseRS() {
		super();
	}

	public String getOriginalString() {
		return originalString;
	}
	
	public void setOriginalString(String originalString) {
		this.originalString = originalString;
	}
	
	public String getUpperCaseString() {
		return upperCaseString;
	}
	
	public void setUpperCaseString(String upperCaseString) {
		this.upperCaseString = upperCaseString;
	}
}
