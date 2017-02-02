package destination.model;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DestinationResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public List<Destination> getdoList() {
		return dList;
	}

	public void setdList(List<Destination> dList) {
		this.dList = dList;
	}

	    public List<Destination> dList;
}
