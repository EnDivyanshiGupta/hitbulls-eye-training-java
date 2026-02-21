public class Demo {
    static class Demo1 {
        void multiply(int a, int b) {
            System.out.println("Result is " + (a * b));
        }
        void multiply(int a, int b, int c) {
            System.out.println("Result is " + (a * b * c));
        }
        public static void main(String[] args) {
            Demo1 obj = new Demo1();
            obj.multiply(8, 5);
            obj.multiply(4, 6, 2);
        }
    }
}
