class ExampleProgram {

    public static void main(String args[]) {

        int a = 1;

        for (int i = 5; i >= a; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
}