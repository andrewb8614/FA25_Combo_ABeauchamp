import java.util.Random;

public class Dice {
	static Random rand = new Random();
 private int sides;

 static public int roll (int sides) {
	 int result = rand.nextInt(sides);
	 
	 return result;
 }
 
}
