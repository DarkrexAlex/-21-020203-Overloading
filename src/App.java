public class App {
    /**
     * This method takes in two int parameters to add.
     * 
     */
    private static int sum2(int num1, int num2){
        return num1 + num2;
    }

    /**
     * This method takes in 3 int parameters to add.
     * 
     */
    private static int sum3(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    /**
     * This method takes in 2 int parameters to compare
     */
    private static int value1(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    /**
     * This method take 2 double parameters to compare
     */
    private static double value2(double num1, double num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
    /**
     * Overloading
     */

    /**
     * Computing the sum of two numbers.  
     */     
    private static int computeSum(int num1, int num2){
        return num1 + num2;
    }
    /**
     * Computing the sum of three number
     */
    private static int computeSum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    /**
     * 
     * Create method that returns the greater integer value
     */
    private static int greaterValue(int num1, int num2){
        if (num1>num2){
            return num1;
        }else{
            return num2;
        }
    }
     
    /**
     * 
     * Create method that returns the greater double value
     */
    private static double greaterValue(double num1, double num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("");

        /**
         * Invoke Computation Methods
         */
        System.out.println("The sum of 97 and 75 is " + App.sum2(97, 95));
        System.out.println("The sum of 100, 25, and 30 is " + App.sum3(100, 25, 30));
        /**
         * Invoke greater value method
         */
        System.out.println("The greater value between 45 and 100 is " + App.value1(45, 100));
        System.out.println("The greater value between 3.14 and 9.8 is " + App.value2(3.14, 9.8));
        /**
         * Calling/Invoking Overload Methods
         */
        System.out.println("----------------------------");
        System.out.println("Overloading Methods");
        System.out.println("The sum of 97 and 75 is " + App.computeSum(97, 95));
        System.out.println("The sum of 100, 25, and 30 is " + App.computeSum(100, 25, 30));
        /**
         * Call the greaterValue method with integer parameters
         */
        System.out.println("The greater value between 45 and 100 is " + App.greaterValue(45,100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + App.greaterValue(3.14,9.8));

    }
}
