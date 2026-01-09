package linearandbinartsearch;


public class BufferVsBuilder {

    public static void main(String[] args) {

        // Number of times string will be appended
        int iterations = 1_000_000;

        /* ---------------- StringBuffer Test ---------------- */

        // Create StringBuffer object
        StringBuffer stringBuffer = new StringBuffer();

        // Record start time
        long startBufferTime = System.nanoTime();

        // Append strings in a loop
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("hello");
        }

        // Record end time
        long endBufferTime = System.nanoTime();

        // Calculate total time taken
        long bufferTimeTaken = endBufferTime - startBufferTime;


        /* ---------------- StringBuilder Test ---------------- */

        // Create StringBuilder object
        StringBuilder stringBuilder = new StringBuilder();

        // Record start time
        long startBuilderTime = System.nanoTime();

        // Append strings in a loop
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("hello");
        }

        // Record end time
        long endBuilderTime = System.nanoTime();

        // Calculate total time taken
        long builderTimeTaken = endBuilderTime - startBuilderTime;


        /* ---------------- Output Results ---------------- */

        System.out.println("Performance Comparison (1,000,000 appends)");
        System.out.println("-------------------------------------------");
        System.out.println("StringBuffer Time  : " + bufferTimeTaken + " ns");
        System.out.println("StringBuilder Time : " + builderTimeTaken + " ns");

        // Compare which is faster
        if (bufferTimeTaken > builderTimeTaken) {
            System.out.println("Result: StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("Result: StringBuffer is faster than StringBuilder.");
        }
    }
}