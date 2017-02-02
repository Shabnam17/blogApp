package destination.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SpecificPlaceResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<SpecificPlace> getSpecificCities() {
		return cities;
	}

	public void setSpecificCities(List<SpecificPlace> cities) {
		this.cities = cities;
	}

	private List<SpecificPlace> cities;
}
