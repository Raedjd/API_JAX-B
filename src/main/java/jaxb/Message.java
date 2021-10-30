package jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(propOrder= {"to","from","text"})
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Message {
	private String from;
	private String to;
	private String text;
	private boolean isNew;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(String from, String to, String text, boolean isNew) {
		super();
		this.from = from;
		this.to = to;
		this.text = text;
		this.isNew = isNew;
	}
	@XmlElement(name="emetteur", required=true)
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@XmlElement(name="destinateur")
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	@XmlAttribute
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@XmlTransient
	public boolean isNew() {
		return isNew;
	}
	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}
	@Override
	public String toString() {
		return "Message [from=" + from + ", to=" + to + ", text=" + text + ", isNew=" + isNew + "]";
	}
	
	

}
