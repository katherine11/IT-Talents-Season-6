package immigrants.other;

public abstract class CommonData {

	private String name;

	public CommonData(String name) {
		this.setName(name);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null && name != "") {
			this.name = name;
		}
	}

}
