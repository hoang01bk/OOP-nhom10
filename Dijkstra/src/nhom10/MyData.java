package nhom10;

import java.io.Serializable;
import java.util.ArrayList;

public class MyData implements Serializable {

	private static final long serialVersionUID = 1L;
	private ArrayList<MyPoint> arrMyPoint;
	private ArrayList<MyLine> arrMyLine;

	final int r = 15, r2 = 2 * r;

	public ArrayList<MyPoint> getArrMyPoint() {
		return arrMyPoint;
	}

	public void setArrMyPoint(ArrayList<MyPoint> arrMyPoint) {
		this.arrMyPoint = arrMyPoint;
	}

	public ArrayList<MyLine> getArrMyLine() {
		return arrMyLine;
	}

	public void setArrMyLine(ArrayList<MyLine> arrMyLine) {
		this.arrMyLine = arrMyLine;
	}

	public MyData() {
		arrMyPoint = new ArrayList<MyPoint>();
		arrMyLine = new ArrayList<MyLine>();
	}
}
