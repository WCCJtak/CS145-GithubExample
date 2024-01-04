class Example {
    public static void main(String[] args) {
        boolean run = true;
        double num1 = 0;
        int num2 = 0;
        while (run) {
            for (int i=0; i<20; i++) {
                num1 += 0.5;
                if (num2 < 10) {
                    System.out.println(sum(num1, num2));
                    num2++;
                } else {
                    run = false;
                }
            }
        }
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}