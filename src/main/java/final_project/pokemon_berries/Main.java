package final_project.pokemon_berries;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.println("The largest berry you can grow in the shortest time is:\n"
				+ BerryUtil.getLargestBerry(BerryUtil.getBerriesWithShortestGrowthTime(BerryUtil.getAllBerries())));

	}

}
