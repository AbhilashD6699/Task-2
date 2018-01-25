
public class RoadBikes extends Bicycle{

	public void dropHandlebars(){
		System.out.println("These are race bikes");
		} 
	
	public static void main(String args[]) {
	      int a = 60;
	      RoadBikes demo = new RoadBikes();
	      System.out.println("Speed: " + demo.currentSpeed(a));
			System.out.println("PedalCadence: " + demo.currentPedalCadence(a));
			System.out.println("Gear: " + demo.currentGear(a));
	      demo.dropHandlebars();
	      
	   }

}
