package com.fico.ps.blazeGenerics.model.util;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

public class BlazeJavaBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7047252826548135878L;

	public static <T> T getObjectFromFile(Class<T> type, String filePath)
			throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(type);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<?> jaxbElement = unmarshaller.unmarshal(new StreamSource(
				new FileReader(new File(filePath))), type);
		return type.cast(jaxbElement.getValue());

	}

	public static <T> T getObjectFromXmlString(Class<T> type, String xmlString)
			throws JAXBException, FileNotFoundException {
		JAXBContext context = JAXBContext.newInstance(type);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		JAXBElement<?> root = unmarshaller.unmarshal(new StreamSource(
				new StringReader(xmlString)), type);
		return type.cast(root.getValue());
	}

	public static String getXmlString(Object object) {

		String string = "";
		try {
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			Marshaller marshaller = context.createMarshaller();
			ByteArrayOutputStream stream = new ByteArrayOutputStream();

			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
					Boolean.TRUE);
			marshaller.marshal(object, stream);
			string = new String(stream.toByteArray());
			stream.close();

		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return string;
	}

}