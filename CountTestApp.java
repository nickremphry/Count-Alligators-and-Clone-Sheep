package alligatorsAndSheep;

public class CountTestApp extends CountUtil {
	
	public static void main(String[] args) {
		
		int numOfAnimals;
		Alligator alligator = new Alligator();
		
		System.out.println("Counting alligators. . .\n" );
		
		count(alligator, 3);
		numOfAnimals = alligator.getCount();
		
		for(int i = 0; i < numOfAnimals; i++) {
			System.out.println((i + 1) + " " + "alligator");
		}
		
		System.out.println("\nCounting sheep. . .\n");
		
		try {
			Sheep sheep1 = new Sheep();
			sheep1.setName("Blackie");
			count(sheep1, 2);
			numOfAnimals = sheep1.getCount();
			
			for(int i = 0; i < numOfAnimals; i++) {
				System.out.println((i + 1) + " " + sheep1.getName());
			}
			System.out.println();
			
			Sheep sheep2 = (Sheep) sheep1.clone();
			sheep2.setName("Dolly");
			sheep2.resetCount();
			count(sheep2, 3);
			numOfAnimals = sheep2.getCount();
			
			for(int i = 0; i < numOfAnimals; i++) {
				System.out.println((i + 1) + " " + sheep2.getName());
			}
			System.out.println();
			
			sheep1.resetCount();
			count(sheep1, 1);
			numOfAnimals = sheep1.getCount();
			
			for(int i = 0; i < numOfAnimals; i++) {
				System.out.println((i + 1) + " " + sheep1.getName());
			}
			
		}
		catch(CloneNotSupportedException ex) {
			System.out.println(ex);
		}
		
	}

}
