public class Day5MathMethods {

    public static void main(String[] args) {

        double a = 25.5;
        double b = 10.5;

        // abs()
        System.out.println("Absolute: " + Math.abs(-25));

        // max()
        System.out.println("Maximum: " + Math.max(a, b));

        // min()
        System.out.println("Minimum: " + Math.min(a, b));

        // sqrt()
        System.out.println("Square Root: " + Math.sqrt(25));

        // cbrt()
        System.out.println("Cube Root: " + Math.cbrt(27));

        // pow()
        System.out.println("Power: " + Math.pow(2, 3));

        // round()
        System.out.println("Round: " + Math.round(25.6));

        // ceil()
        System.out.println("Ceil: " + Math.ceil(25.3));

        // floor()
        System.out.println("Floor: " + Math.floor(25.9));

        // random()
        System.out.println("Random: " + Math.random());

        // signum()
        System.out.println("Signum: " + Math.signum(-25));

        // sin()
        System.out.println("Sin 90 Degrees: "
                + Math.sin(Math.toRadians(90)));

        // cos()
        System.out.println("Cos 90 Degrees: "
                + Math.cos(Math.toRadians(90)));

        // tan()
        System.out.println("Tan 45 Degrees: "
                + Math.tan(Math.toRadians(45)));

        // asin()
        System.out.println("ASin: " + Math.asin(1));

        // acos()
        System.out.println("ACos: " + Math.acos(1));

        // atan()
        System.out.println("ATan: " + Math.atan(1));

        // sinh()
        System.out.println("Sinh: " + Math.sinh(1));

        // cosh()
        System.out.println("Cosh: " + Math.cosh(1));

        // tanh()
        System.out.println("Tanh: " + Math.tanh(1));

        // exp()
        System.out.println("Exp: " + Math.exp(2));

        // log()
        System.out.println("Log: " + Math.log(10));

        // log10()
        System.out.println("Log10: " + Math.log10(100));

        // toRadians()
        System.out.println("Radians: " + Math.toRadians(90));

        // toDegrees()
        System.out.println("Degrees: " + Math.toDegrees(Math.PI));

        // Constants
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);


        // AREA OF CIRCLE
        double circleRadius = 5;

        double circleArea = Math.PI * circleRadius * circleRadius;

        System.out.println("\n--- Circle ---");
        System.out.println("Radius: " + circleRadius);
        System.out.println("Area of Circle: " + circleArea);


        // AREA OF EQUILATERAL TRIANGLE
        double triangleSide = 10;

        double triangleArea =
                (Math.sqrt(3) / 4)
                * triangleSide
                * triangleSide;

        System.out.println("\n--- Equilateral Triangle ---");
        System.out.println("Side: " + triangleSide);
        System.out.println("Area of Equilateral Triangle: "
                + triangleArea);


        // AREA OF PENTAGON
        double pentagonSide = 10;

        double pentagonArea =
                (1.0 / 4)
                * Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))
                * pentagonSide
                * pentagonSide;

        System.out.println("\n--- Pentagon ---");
        System.out.println("Side: " + pentagonSide);
        System.out.println("Area of Pentagon: "
                + pentagonArea);

       
        // AREA OF HEXAGON
        double hexagonSide = 10;

        double hexagonArea =
                (3 * Math.sqrt(3) / 2)
                * hexagonSide
                * hexagonSide;

        System.out.println("\n--- Hexagon ---");
        System.out.println("Side: " + hexagonSide);
        System.out.println("Area of Hexagon: "
                + hexagonArea);


        // AREA OF OCTAGON
        double octagonSide = 10;

        double octagonArea =
                2 * (1 + Math.sqrt(2))
                * octagonSide
                * octagonSide;

        System.out.println("\n--- Octagon ---");
        System.out.println("Side: " + octagonSide);
        System.out.println("Area of Octagon: "
                + octagonArea);
    }
}