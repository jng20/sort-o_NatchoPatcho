import java.util.ArrayList;

public class Driver {

	public static void main( String[] args ) {

		ArrayList<Comparable> a;
		a = populate(100, 0, 100000);
		System.out.println(a);
		a = Sorts.bubbleSort(a);
		System.out.println(a);

                a = populate(100, 0, 100000);
                System.out.println(a);
                a = Sorts.selectionSort(a);
                System.out.println(a);

                a = populate(100, 0, 100000);
                System.out.println(a);
                a = Sorts.insertionSort(a);
                System.out.println(a);

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

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }

}
