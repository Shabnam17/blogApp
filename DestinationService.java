package destination.infrastructure;

import java.util.List;

import destination.model.Destination;
import destination.model.SpecificPlace;

public class DestinationService {

	public List<Destination> getCountryList(String path) {
		DestinationManager destinationManager = new DestinationManager();
		return destinationManager.getCountryListWithin(path);
	}

	public List<SpecificPlace> getSpecificPlaces(String countryId, String path) {
		DestinationManager destinationManager = new DestinationManager();
		return destinationManager.getSpecificPlaces(countryId, path);
	}
}
