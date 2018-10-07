import java.util.concurrent.ThreadLocalRandom;

public class House {
	int apNumber;
	int square;
	int floor;
	int numOfRooms;
	String street;
	String buildType;
	String lifetime;

	House(int apNumber, int rooms) {
		this.apNumber = apNumber;
		this.square = rooms * ThreadLocalRandom.current().nextInt(15, 25);
		this.floor = (int) apNumber / 10 + 1;
		this.numOfRooms = rooms;
		this.street = "Полипчука";
		this.buildType = "Кирпичный";
		this.lifetime = "20.10.2025";
	}

}
