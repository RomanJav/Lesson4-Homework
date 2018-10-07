import java.util.concurrent.ThreadLocalRandom;

public class MainApplication {

	public static void main(String[] args) {
		House house[] = new House[100];
		for (int i = 0; i < house.length; i++) {
			house[i] = new House(i + 1, ThreadLocalRandom.current().nextInt(1, 5));
		}
		System.out.println("Все квартиры у которых 2 комнаты: ");
		for (int i = 0; i < house.length; i++) {
			if (house[i].numOfRooms == 2) {
				System.out.println(house[i].apNumber);
			}
		}
		System.out.println("Все квартиры у которых 2 комнаты и они между 3 и 6 этажом: ");
		for (int i = 0; i < house.length; i++) {
			if (house[i].numOfRooms == 2 && house[i].floor > 3 && house[i].floor < 6) {
				System.out.println(house[i].apNumber);
			}
		}
		System.out.println("Все квартиры у которых площадь больше 20кв.м: ");
		for (int i = 0; i < house.length; i++) {
			if (house[i].square >20) {
				System.out.println(house[i].apNumber);
			}
		}
	}

}