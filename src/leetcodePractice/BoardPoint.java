package leetcodePractice;

public class BoardPoint {
	int x,y;
	boolean visited;
	char value;
	BoardPoint(int _x, int _y, char _value){
		x = _x;
		y = _y;
		visited = false;
		value = _value;
	}
}
