package destination.infrastructure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import destination.model.Destination;
import destination.model.SpecificPlace;

public class DestinationManager {

	public List<Destination> getCountryListWithin(String path) {
		String csvFile = path + "/sourcefiles/destinaion.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String name;

		List<Destination> cList = new ArrayList();
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] country = line.split(cvsSplitBy);

				Destination dest = new Destination();
				dest.setDestination(country[0]);
				dest.setDestName(country[1]);
				cList.add(dest);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cList;
	}

	public List<SpecificPlace> getSpecificPlaces(String countryId, String path) {

	
		String csvFile =  path + "/sourcefiles/specific.csv";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String name;

		List<SpecificPlace> cList = new ArrayList();
		try {

			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {

				// use comma as separator
				String[] cities = line.split(cvsSplitBy);

				if (countryId.equals(cities[1])) {
					SpecificPlace sp = new SpecificPlace();
					sp.setCode(cities[0]);
					sp.setSpPlace(cities[2]);
					sp.setImgUrl(cities[3]);
					cList.add(sp);
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return cList;
	}
}