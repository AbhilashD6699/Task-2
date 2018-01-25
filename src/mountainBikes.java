
public class mountainBikes extends Bicycle{

	public void description(){
		System.out.println("mountain bikes have an additional chain ring, giving them a lower gear ratio.");
		} 
	
	public static void main(String args[]) {
	      int a = 80;
	      mountainBikes demo = new mountainBikes();
	      System.out.println("Speed: " + demo.currentSpeed(a));
			System.out.println("PedalCadence: " + demo.currentPedalCadence(a));
			System.out.println("Gear: " + demo.currentGear(a+1));
	      demo.description();
	      
	   }


}
