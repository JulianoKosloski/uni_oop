public class Method {

    //void, int, double... are the return types of the method, and have to specified (void has no return value)
    //static means the method doesn't need an instance of the class (object) to run

    static double myFirstMethod (double x, double y) { // x, y are parameters
        double result = x + y;
        return result;
    }

    static int myFirstMethod (int x, int y) { // here I overload the first method
        int result = x + y;
        return result;
    }

    static float myFirstMethod (float x, float y) { // now the method can be called for int, double or floats
        float result = x + y;
        return result;
    }

    static int sumDown(int k) {
        //sums all numbers below k until 0
        if (k > 0) {
            int result = k + sumDown(k-1);
            return result;
        } else { //halting condition, every function with recursion should have one to stop infinite recursion
            return 0;
        }
    }
    public static void main(String[] args) {
        //learning methods
        double x = myFirstMethod(3.3,5); //these numbers are arguments 
        double y = myFirstMethod(4,5.7);
        double w = myFirstMethod(3.13321351345624,7);
        int test = myFirstMethod(4, 57);

        System.out.println("My results: " + '\n'+ x  + '\n'+ y + '\n'+ w+ '\n');
        System.out.println("And this is an int: " + test);

        System.out.println(sumDown(3));
        System.out.println(sumDown(5));
        System.out.println(sumDown(0));









    }
}
