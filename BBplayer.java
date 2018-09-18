package player;
import java.util.Scanner; 
public class BBplayer {
		private static int AB;
		private static int H;
		private static int B2;
		private static int B3;
		private static int HR;
		private static int R;
		private static int W;
	
		public BBplayer() {
		
		Scanner reader = new Scanner(System.in); 
		
		System.out.println("Enter Player's At Bats: ");
		AB = reader.nextInt(); 
		
		System.out.println("Enter Player's Hits: ");
		H = reader.nextInt(); 
			
		System.out.println("Enter Player's Doubles ");
		B2 = reader.nextInt(); 
		
		System.out.println("Enter Player's Triples ");
		B3 = reader.nextInt(); 
		
		System.out.println("Enter Player's Homeruns: ");
		HR = reader.nextInt(); 
	
		
		System.out.println("Enter Player's Runs: ");
		R = reader.nextInt(); 
	
	
		System.out.println("Enter Player's Walks: ");
		W = reader.nextInt(); 
}
	public static double battingAverage() {
		return (H/AB);
	}
	public static double onBasePercentage() {
		return ((H + W)/( AB + W));
	}
	public static double sluggingPercentage() {
		return (((B2 * 2)+(3*B3)+(4*HR))/(AB));
	} 
	public static double OBS() {
		return (BBplayer.onBasePercentage() + BBplayer.sluggingPercentage());
	}
	public static double totalBases() {
		return (BBplayer.sluggingPercentage() * AB);
	}	
}
