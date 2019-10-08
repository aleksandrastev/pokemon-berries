package final_project.pokemon_berries;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BerryUtilTest {

	@Test
	public void testGetAllBerries() throws IOException {
		assertEquals(64, BerryUtil.getAllBerries().size());
		assertEquals("cheri", BerryUtil.getAllBerries().get(0).name);
		assertEquals("rowap", BerryUtil.getAllBerries().get(63).name);
	}

	@Test
	public void testGetBerriesWithShortestGrowthTime() throws IOException {
		assertEquals(5, BerryUtil.getBerriesWithShortestGrowthTime(BerryUtil.getAllBerries()).size());
		assertEquals(2, BerryUtil.getBerriesWithShortestGrowthTime(BerryUtil.getAllBerries()).get(0).growthTime);
		assertEquals(2, BerryUtil.getBerriesWithShortestGrowthTime(BerryUtil.getAllBerries()).get(1).growthTime);
		assertEquals(2, BerryUtil.getBerriesWithShortestGrowthTime(BerryUtil.getAllBerries()).get(2).growthTime);
	}

	@Test
	public void testGetLargestBerry() throws IOException {
		List<Berry> berries = Arrays.asList(new Berry("cheri", "https://pokeapi.co/api/v2/berry/1/", 3, 20),
				new Berry("bluk", "https://pokeapi.co/api/v2/berry/17/", 2, 108));
		assertEquals(108, BerryUtil.getLargestBerry(berries).size);
		assertEquals(300, BerryUtil.getLargestBerry(BerryUtil.getAllBerries()).size);
	}


}
