import java.util.ArrayList;

public class Driver {

	public static void main( String[] args ) {

    System.out.println("\nWorst Case Scenarios:");

    System.out.println("\nSize: 100\n");
    ArrayList<Comparable> a = new ArrayList<Comparable>(100);
    a = worstCasePop(a, 100);
    //System.out.println(a + "\n");
    a = Sorts.bubbleSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(100);
    a = worstCasePop(a, 100);
    //System.out.println(a + "\n");
    a = Sorts.selectionSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(100);
    a = worstCasePop(a, 100);
    //System.out.println(a + "\n");
    a = Sorts.insertionSort(a);
    //System.out.println(a + "\n");

    System.out.println("\nSize: 200\n");
    a = new ArrayList<Comparable>(200);
    a = worstCasePop(a, 200);
    //System.out.println(a + "\n");
    a = Sorts.bubbleSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(200);
    a = worstCasePop(a, 200);
    //System.out.println(a + "\n");
    a = Sorts.selectionSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(200);
    a = worstCasePop(a, 200);
    //System.out.println(a + "\n");
    a = Sorts.insertionSort(a);
    //System.out.println(a + "\n");

    System.out.println("\nNormal case scenarios");

    System.out.println("\nSize: 100\n");
    a = populate(100, 0, 100000);
    //System.out.println(a + "\n");
    a = Sorts.bubbleSort(a);
    //System.out.println(a + "\n");

    a = populate(100, 0, 100000);
    //System.out.println(a + "\n");
    a = Sorts.selectionSort(a);
    //System.out.println(a + "\n");

    a = populate(100, 0, 100000);
    //System.out.println(a + "\n");
    a = Sorts.insertionSort(a);
    //System.out.println(a + "\n");
    System.out.println("\nSize: 200\n");
    a = populate(200, 0, 100000);
    //System.out.println(a + "\n");
    a = Sorts.bubbleSort(a);
    //System.out.println(a + "\n");

    a = populate(200, 0, 100000);
    //System.out.println(a + "\n");
    a = Sorts.selectionSort(a);
    //System.out.println(a + "\n");

    a = populate(200, 0, 100000);
    //System.out.println(a + "\n");
    a = Sorts.insertionSort(a);
    //System.out.println(a + "\n");

    System.out.println("\nBest Case Scenario");

    System.out.println("\nSize: 100\n");
    a = new ArrayList<Comparable>(100);
    a = bestCasePop(a, 100);
    //System.out.println(a + "\n");
    a = Sorts.bubbleSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(100);
    a = bestCasePop(a, 100);
    //System.out.println(a + "\n");
    a = Sorts.selectionSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(100);
    a = bestCasePop(a, 100);
    //System.out.println(a + "\n");
    a = Sorts.insertionSort(a);
    //System.out.println(a + "\n");

    System.out.println("\nSize: 200\n");
    a = new ArrayList<Comparable>(200);
    a = bestCasePop(a, 200);
    //System.out.println(a + "\n");
    a = Sorts.bubbleSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(200);
    a = bestCasePop(a, 200);
    //System.out.println(a + "\n");
    a = Sorts.selectionSort(a);
    //System.out.println(a + "\n");

    a = new ArrayList<Comparable>(200);
    a = bestCasePop(a, 200);
    //System.out.println(a + "\n");
    a = Sorts.insertionSort(a);
    //System.out.println(a + "\n");
}

  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  public static ArrayList worstCasePop( ArrayList al, int len ) {
    for( int i = len-1; i > 0; i-- ) {
      al.add(i);
    }
    return al;
  }

  public static ArrayList bestCasePop( ArrayList al, int len ) {
    for( int i = 0; i < len-1; i++ ) {
      al.add(i);
    }
    return al;
  }
}
