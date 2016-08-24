
public class Task12 {
	public static void main(String[] args) {
		
		short firstD, secondD, thirdD;
		
		for (short i = 100; i <= 999; i++) {
		
			firstD = (byte)(i % 10);
			secondD = (byte)((i / 10) % 10);
			thirdD = (byte)(i / 100);
			
			if(firstD != secondD && firstD != thirdD && secondD != thirdD)
				System.out.println(i);
			
		}
	}

}
