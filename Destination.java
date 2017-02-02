package destination.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Destination implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Destination(){
		
	}
	@Override
	public String toString() {
		return "Destination [destinationId=" + destinationId + ", destName="
				+ destName + "]";
	}

	private String destinationId;
	private String destName;
	
	 @XmlElement(name="countryId")
	public String getDestination() {
		return destinationId;
	}

	public void setDestination(String destinationId) {
		this.destinationId = destinationId;
	}

	 @XmlElement(name="countryName")
	public String getDestName() {
		return destName;
	}

	public void setDestName(String destName) {
		this.destName = destName;
	}
}
