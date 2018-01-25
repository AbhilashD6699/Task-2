
public class Tandem extends Bicycle {
	public void seats() {
		System.out.println("Seats: 2");
	}

	public void Handles() {
		System.out.println("Handles: 2");
	}

	public static void main(String args[]) {
		int a = 40;
		Tandem demo = new Tandem();
		System.out.println("Speed: " + demo.currentSpeed(a));
		System.out.println("PedalCadence: " + demo.currentPedalCadence(a));
		System.out.println("Gear: " + demo.currentGear(a));
		demo.seats();
		demo.Handles();
	}

}
