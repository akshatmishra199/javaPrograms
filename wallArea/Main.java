package wallArea;

public class Main {

	public static void main(String[] args) {
		Wall wall = new Wall(5.0,4.0);
		System.out.println("Get Area " + wall.getArea());
		
		wall.setHeight(-1.5);
		System.out.println("width = " + wall.getWidth());
		System.out.println("Height = "+ wall.getHeight());
		System.out.println("Area = " + wall.getArea());

	}

}
