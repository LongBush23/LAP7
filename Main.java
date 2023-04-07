public class Main {
    public static void main(String[] args) {
        MoveablePoint point = new MoveablePoint(0, 0, 1, 1);
        System.out.println("Đối tượng ban đầu: " + point);

        point.moveRight();
        point.moveDown();
        System.out.println("Đối tượng sau khi di chuyển: " + point);

        MoveableCircle circle = new MoveableCircle(point, 10);
        System.out.println("Đối tượng MoveableCircle: " + circle);

        circle.moveRight();
        circle.moveDown();
        System.out.println("Đối tượng MoveableCircle sau khi di chuyển: " + circle);
    }
}
