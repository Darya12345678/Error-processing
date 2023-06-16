public class work3 {
    public static void main(String[] args) {
        
        try {
            int[] intArray = new int[10];
            int d = 2;
            int index = 11;
            double catchedRes1 = intArray[index] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
     
    }  
}
