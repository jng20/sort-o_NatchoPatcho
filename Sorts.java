import java.util.ArrayList;

public class Sorts {

	public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> data ) {
		for ( int i = 0; i < data.size() - 1; i++ ) {
			for ( int j = data.size() - 1; j > 0; j-- ) {
				if ( data.get(j).compareTo( data.get(j - 1) ) < 0 ) {
					Comparable temp = data.get(j);
					data.set( j, data.get(j - 1) );
					data.set( j - 1, temp );
				}
			}
		}
		return data;
	}

	public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> data ) {
		for ( int i = 0; i < data.size() - 1; i++ ) {
			for ( int j = data.size() - 1; j > 0; j-- ) {
				if ( data.get(j).compareTo( data.get(j - 1) ) < 0 ) {
					Comparable temp = data.get(j);
					data.set( j, data.get(j - 1) );
					data.set( j - 1, temp );
				}
			}
		}
		return data;
	}

  public static ArrayList<Comparable> insertionSort( ArrayList<Comparable> data )
  {
    for( int partition = 0; partition < data.size() - 1; partition++ ) {
      //partition marks first item in unsorted region

      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );

      //traverse sorted region from right to left
      for( int i = partition + 1; i > 0; i-- ) {

        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( (data.get(i)).compareTo(data.get(i - 1)) < 0 ) {
          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable temp = data.get(i - 1);
	  data.set(i - 1, data.get(i));
	  data.set(i, temp);
        }
        else
          break;
      }
    }
    return data;
  }

}
