package jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Marshallunmarshall {

	public static void main(String[] args) throws JAXBException {
		/***********************Marshall************************/
		// TODO Auto-generated method stub
		
		//crée instance de classe
		
		Message message = new Message();
		message.setFrom("Raed");
		message.setText("Bonjour");
		message.setTo("Jaidi");
		message.setNew(true);
		
		//create context JAXB
		JAXBContext context = JAXBContext.newInstance(Message.class);
		//call marcshall of JAXB
		Marshaller marshall = context.createMarshaller();
		
		marshall.setProperty("jaxb.encoding", "UTF-8");
		marshall.setProperty("jaxb.formatted.output",true);
		marshall.marshal(message, System.out);
		marshall.marshal(message, new File("message.xml"));
		/***********************UnMarshall************************/
		
		Unmarshaller unmarshaller = context.createUnmarshaller() ;
		Message message2= (Message)unmarshaller.unmarshal(new File("message.xml"));
		System.out.println(message2);
		System.out.println("From = " + message2.getFrom());
		System.out.println("To = " + message2.getTo()) ;
		System.out.println("Text = " + message2.getText()) ;

	}

}
