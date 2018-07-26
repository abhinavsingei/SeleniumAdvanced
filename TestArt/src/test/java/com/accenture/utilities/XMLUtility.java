package com.accenture.utilities;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XMLUtility {
	
	public void readXML() throws JAXBException
	{
		File f = new File("DataSheet.xml");
		JAXBContext j= JAXBContext.newInstance(RegData.class);
		Unmarshaller u = j.createUnmarshaller();
		
		RegData r= (RegData) u.unmarshal(f);
		List<Data> mydata = r.getRegdata();
		
		for(Data data:mydata)
		{
			System.out.println("FirstName = "+data.getFirstname());
			System.out.println("LastName = "+data.getLastname());
		}
	}

	public static void main(String[] args) throws JAXBException {
		
		XMLUtility x = new XMLUtility();
		x.readXML();
		
	}
}
