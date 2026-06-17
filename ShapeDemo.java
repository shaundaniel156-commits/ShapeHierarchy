public class ShapeDemo {

public static void main(String[] args) {

    try {

        Shape[] shapes = {

            new Circle(
                5,
                "Red",
                true
            ),

            new Rectangle(
                4,
                6,
                "Blue",
                false
            ),

            new Triangle(
                3,
                4,
                5,
                "Green",
                true
            )
        };

        printAreas(shapes);

        System.out.println(
            "Largest Shape Area = "
            + largest(shapes)
        );

        Triangle invalid =
            new Triangle(
                2,
                3,
                10,
                "Black",
                true
            );

    } catch
      (InvalidShapeException e) {

        System.out.println(
            "Error: "
            + e.getMessage()
        );
    }
}

    private static void printAreas(Shape[] shapes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static Object largest(Shape[] shapes) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}