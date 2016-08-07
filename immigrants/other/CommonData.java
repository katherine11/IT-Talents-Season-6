package immigrants.other;

public abstract class CommonData {

	private String name;

	public CommonData(String name) {
//		this.setName(name);
		
		if (name != null && name != "") {
			this.name = name;
		}

	}

	public String getName() {
		return name;
	}

	//need setter ? 
//	public void setName(String name) {
//		if (name != null && name != "") {
//			this.name = name;
//		}
//	}

}
