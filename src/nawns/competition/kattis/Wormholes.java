package nawns.competition.kattis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by nonis_000 on 12/9/2014.
 */
public class Wormholes {
    public static void main(String[] args) {
        Point departurePoint = new Point(0, 0, 0);
        Point destinationPoint = new Point(100, 0, 0);
        List<Wormhole> wormholes = new ArrayList<Wormhole>();
        wormholes.add(new Wormhole(new Point(1, 1, 0), new Point(1, 2, 0), -100, -2));
        wormholes.add(new Wormhole(new Point(0, 1, 0), new Point(100, 1, 0), -150, 10));
        System.out.println(earliestArrival(departurePoint, destinationPoint, wormholes));

        Point departurePoint2 = new Point(0, 0, 0);
        Point destinationPoint2 = new Point(10, 0, 0);
        List<Wormhole> wormholes2 = new ArrayList<Wormhole>();
        wormholes2.add(new Wormhole(new Point(5, 0, 0), new Point(-5, 0, 0), 0, 0));
        System.out.println(earliestArrival(departurePoint2, destinationPoint2, wormholes2));
    }

    private static int earliestArrival(Point departure, Point destination, List<Wormhole> wormholes) {
        System.out.println("departure: " + departure.toString());
        System.out.println("destination: " + destination.toString());
        for (Wormhole worm : wormholes) {
            System.out.println(worm);
        }
        return -1;
    }

}

class Point {
    public int x;
    public int y;
    public int z;

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public String toString() {
        return "{" + this.x + ", " + this.y + ", " + this.z + "}";
    }
    public static double dist(Point a, Point b) {
        return Math.sqrt((b.x - a.x)^2 + (b.y - a.y)^2 + (b.z - a.z)^2);
    }

}

class Wormhole {
    public Point entry;
    public Point exit;
    int creationTime; //t
    int timeShift; //d

    public Wormhole(Point entry, Point exit, int t, int d) {
        this.entry = entry;
        this.exit = exit;
        this.creationTime = t;
        this.timeShift = d;
    }
    public String toString() {
        return  this.entry.toString() + "->" +
                this.exit.toString() + " - t:" +
                this.creationTime + " d:" +
                this.timeShift;
    }
}