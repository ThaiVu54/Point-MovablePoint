public class Run {
    public static void main(String[] args) {
        Point p = new Point();
        p.setXY(1,2);
        System.out.println(p);

        MovablePoint m = new MovablePoint(1,2,1,1);
        m.move();
        System.out.println(m);
    }
}
