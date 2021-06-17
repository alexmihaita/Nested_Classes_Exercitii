import javax.xml.crypto.Data;

public class DataStructure {

    // Create an array
    private final static int SIZE = 15;
    private int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values  //contructor clasa baza
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;  //ii da valori pana la 15
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> { }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    private class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = Integer.valueOf(arrayOfInts[nextIndex]);

            // Get the next even element
            nextIndex ++;
            return retValue;
        } //CERINTA 1
        /*public void print(DataStructureIterator iterator ) {
            while (iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        }*/
        //CERINTA 2
         public void print(DataStructureIterator iterator ) {

            for(Integer i : arrayOfInts) {
                if(i%2 == 1) {
                    System.out.println(i );
                }
            }
            System.out.println();
        }
//        public void print(new DataStructure.DataStructureIterator(), DataStructure ds) {
//
//            private int nextIndex = 1;
//            public boolean hasNext() {
//                return (nextIndex <= ds.size() - 1);
//            }
//            public Integer next() {
//                int retValue = ds.get(nextIndex);
//                nextIndex += 2;
//                return retValue;
//            }

        };
    }

    public static void main(String s[]) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        DataStructure.EvenIterator even = ds.new EvenIterator();
        DataStructureIterator iterator = ds.new EvenIterator();
        even.print(iterator);

       // ds.printEven();
    }
}