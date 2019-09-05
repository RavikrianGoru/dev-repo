package nielsen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Point implements Comparable<Point>
{
    int x;
    int y;

    @Override
    public int compareTo(Point obj)
    {
        int r = (this.x - obj.x);
        if (r == 0)
        {
            r = this.y - obj.y;
        }
        return r;
    }

    public Point(int x, int y)
    {
        super();
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}

public class CordinatesFormsSquareOrNot
{
    public static double distSquare(Point p1, Point p2)
    {
        return (p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y);
    }

    public static double slope(Point p1, Point p2)
    {
        // (y2-y1) / (x2-x1)
        if ((p2.x - p1.x) == 0)
            return 0;
        return ((p2.y - p1.y) / (p2.x - p1.x));
    }

    public static void main(String[] args)
    {
        List<Point> points = new ArrayList<Point>(Arrays.asList(new Point(12, 9), new Point(24, 21), new Point(24, 9), new Point(12, 21)));
        System.out.println(points);
        Collections.sort(points);
        System.out.println("P1, P2, P4, P3");
        System.out.println(points);

        System.out.println("---Sides----");
        System.out.println("Dist square: P1,P2=" + distSquare(points.get(0), points.get(1)));
        System.out.println("Dist square: P2,P3=" + distSquare(points.get(1), points.get(3)));
        System.out.println("Dist square: P3,P4=" + distSquare(points.get(3), points.get(2)));
        System.out.println("Dist square: P4,P1=" + distSquare(points.get(2), points.get(0)));

        System.out.println("---Diagonals----");
        System.out.println("Dist square: P1,P3=" + distSquare(points.get(0), points.get(3)));
        System.out.println("Dist square: P2,P4=" + distSquare(points.get(1), points.get(2)));

        System.out.println("Slope: P1,P3=" + slope(points.get(0), points.get(3)));
        System.out.println("Slope: P2,P4=" + slope(points.get(1), points.get(2)));

    }

}
