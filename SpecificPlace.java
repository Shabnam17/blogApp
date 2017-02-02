package destination.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SpecificPlace implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String spPlace;
	private String code;
	private String imgUrl;
	
	@XmlElement(name = "imgUrl")
	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	@XmlElement(name = "code")
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement(name = "place")
	public String getSpPlace() {
		return spPlace;
	}

	@Override
	public String toString() {
		return "SpecificPlace [spPlace=" + spPlace + "]";
	}

	public void setSpPlace(String spPlace) {
		this.spPlace = spPlace;
	}

	public SpecificPlace() {

	}
}
