package Shape;


class Point2DTest {
    public static void main(String[] args) {
        Point2D point2D = new Point2D();
        System.out.println(point2D);

        point2D = new Point2D(5.0f, 6.0f);
        System.out.println(point2D);


        Point3D point3D = new Point3D(1.0f);
        System.out.println(point3D);

//        point3D = new Point3D(5.0f, 6.0f, 6.0f);
//        System.out.println(point3D);
        Point3D point3D1 = new Point3D(5.0f, 8.0f, 9.0f);
        System.out.println(point3D1);
    }

}