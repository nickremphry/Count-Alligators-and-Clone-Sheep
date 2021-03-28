package alligatorsAndSheep;

public class Alligator implements Countable{
	
	private int count = 0;

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
}
