package algorithmanalysis;


public class StringConcatenation {

    public static void main(String[] args) {

        int[] sizes = {1000, 10000, 100000}; 
        // 1,000,000 with String is intentionally skipped (too slow)

        for (int size : sizes) {

            System.out.println("\nOperations Count: " + size);

            // String (Immutable - O(N^2))
            long start = System.nanoTime();

            String str = "";
            for (int i = 0; i < size; i++) {
                str = str + "a";   // creates new object each time
            }

            long end = System.nanoTime();
            System.out.println("String Time: " + (end - start) + " ns");


            // String Builder (Mutable - O(N))
            start = System.nanoTime();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append("a");
            }

            end = System.nanoTime();
            System.out.println("StringBuilder Time: " + (end - start) + " ns");


            //String Buffer (Thread-safe - O(N)) 
            start = System.nanoTime();

            StringBuffer sbf = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sbf.append("a");
            }

            end = System.nanoTime();
            System.out.println("StringBuffer Time: " + (end - start) + " ns");

            System.out.println("------------------------------------");
        }
    }
}