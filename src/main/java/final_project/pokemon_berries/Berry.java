package final_project.pokemon_berries;

public class Berry {

	String name;
	String url;
	int growthTime;
	int size;

	public Berry(String name, String url, int growthTime, int size) {
		this.name = name;
		this.url = url;
		this.growthTime = growthTime;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return name;
	}

	public void setUrl(String name) {
		this.name = name;
	}

	public int getGrowthTime() {
		return growthTime;
	}

	public void setGrowthTime(int growthTime) {
		this.growthTime = growthTime;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String toString() {
		return name + ": " + "growth time " + growthTime + ", size " + size + ", URL " + url;
	}

}
