package tudelft.numfinder;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this works incorrect
        //nf.find(new int[0]);
        nf.find(new int[]{0, 0});

        // this crashes
        //nf.find(null);


        System.out.println(nf.getLargest());
        System.out.println(nf.getSmallest());
    }
}
