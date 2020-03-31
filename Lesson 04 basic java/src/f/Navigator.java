package f;

public class Navigator {

	public void moveEast(Point point) {
		int oldValue = point.getX();
		point.setX(oldValue + 1);
	}

	public void moveWest(Point point) {
		point.setX(point.getX() - 1);
	}

	public void moveNorth(Point point) {
		point.setY(point.getY() + 1);
	}

	public void moveSouth(Point point) {
		point.setY(point.getY() - 1);
	}
	
	public static void main(String[] args) {
		Point point = new Point();
		point.print();
		Navigator nav = new Navigator();
		nav.moveNorth(point);
		point.print();
	}

}
