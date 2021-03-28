package alligatorsAndSheep;

public class Sheep implements Countable, Cloneable{

	private int count = 0;
	private String name;
	
	public void incrementCount() {
		count += 1;
	}

	public void resetCount() {
		count = 0;
	}

	public int getCount() {
		return count;
	}

	public String getCountString() {
		return String.valueOf(count);
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	

}
