class Cow implements Animal 
{     
	private String mySound;
	private String myType;
	public Cow(String type, String sound) {
		myType = type; 
		mySound = sound;
	}

	public Cow() {
		myType = "cow";
		mySound = "moo";
	}	

	public String getSound() {
		return mySound;
	}

	public String getType() {
		return myType;
	}
}