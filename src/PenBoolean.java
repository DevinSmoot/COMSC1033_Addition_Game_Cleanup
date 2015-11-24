import java.util.Scanner;
public class PenBoolean {

		public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.print("Color of the pen: ");
		String color = get.next();
		//isPenBlue(color);
		if(isPenBlue(color)) {
			System.out.println("Pen is blue");
		}else{
			System.out.println("Pen is not blue. It is "+color);
		}
	}
			public static boolean isPenBlue(String color){
				if(color.equalsIgnoreCase("blue")) {
					//System.out.println("Pen is "+color);
					return true;
				}
				//System.out.println("Pen is "+color);
				return false;
			}
}
