package com.accenture.utilities;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="registerationData")
public class RegData {

	private List<Data> regdata;
@XmlElement(name="data")
	public List<Data> getRegdata() {
		return regdata;
	}

	public void setRegdata(List<Data> regdata) {
		this.regdata = regdata;
	}



}
