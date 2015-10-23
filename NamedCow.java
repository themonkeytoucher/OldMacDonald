class NamedCow extends Cow
{
	private String myName;
	public NamedCow(String type, String name, String sound) {
		myName = name;
	}
	
	public NamedCow() {
		myName = "unknown";
	}

	public String getName() {
		return myName;
	}
}