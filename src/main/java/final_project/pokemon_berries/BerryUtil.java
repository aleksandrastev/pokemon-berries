package final_project.pokemon_berries;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import org.json.JSONObject;

public class BerryUtil {

	public static List<Berry> getAllBerries() throws IOException {
		List<Berry> berries = new ArrayList<Berry>();
		String rootURL = "https://pokeapi.co/api/v2/berry";
		JSONObject root = ApiHelper.getRootDirectory(rootURL);
		int count = 1;

		while (count <= root.getInt("count")) {
			String url = rootURL + "/" + count + "/";
			JSONObject root1 = ApiHelper.getRootDirectory(url);
			String name = root1.getString("name");
			int growthTime = root1.getInt("growth_time");
			int size = root1.getInt("size");
			berries.add(new Berry(name, url, growthTime, size));
			count++;
		}
		return berries;
	}

	public static List<Berry> getBerriesWithShortestGrowthTime(List<Berry> berries) {
		int shortestGrowthTime = berries.stream().min(Comparator.comparing(Berry::getGrowthTime))
				.orElseThrow(NoSuchElementException::new).getGrowthTime();
		return berries.stream().filter(b -> b.getGrowthTime() == shortestGrowthTime)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	public static Berry getLargestBerry(List<Berry> berries) {
		return berries.stream().max(Comparator.comparing(Berry::getSize)).orElseThrow(NoSuchElementException::new);
	}

}
