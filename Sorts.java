import java.util.ArrayList;

public class Sorts {


    public static ArrayList <Comparable> bubbleSort(ArrayList <Comparable> data) {
        int swaps = 0;
	int comparisons = 0;
        for (int i = 0; i < data.size() - 1; i++) {
            for (int j = data.size() - 1; j > 0; j--) {
                if (data.get(j).compareTo(data.get(j - 1)) < 0) {
                    swaps++;
                    Comparable temp = data.get(j);
                    data.set(j, data.get(j - 1));
                    data.set(j - 1, temp);
                }
		comparisons++;
            }
        }
	System.out.println("Bubble sort # of comparisons: " + comparisons);
        System.out.println("Bubble sort # of swaps: " + swaps);
        return data;
    }

    public static ArrayList <Comparable> selectionSort(ArrayList <Comparable> data) {
        int swaps = 0;
	int comparisons = 0;
	int highestPos;
        for (int pass = 0; pass < data.size() - 1; pass++) {
	    highestPos = 0;
            for (int j = data.size() - 1; j >= pass ; j--) {
                if (data.get(j).compareTo(data.get(highestPos)) > 0) {
		    highestPos = j;
                }
		comparisons++;
            }
	    Comparable temp = data.get(pass);
	    data.set(pass, data.get(highestPos));
	    data.set(highestPos, temp);
	    swaps++;
        }
	System.out.println("Selection sort # of comparisons: " + comparisons);
        System.out.println("Selection sort # of swaps: " + swaps);
        return data;
    }

    public static ArrayList <Comparable> insertionSort(ArrayList <Comparable> data) {
        int swaps = 0;
	int comparisons = 0;
        for (int partition = 0; partition < data.size() - 1; partition++) {
            for (int i = partition + 1; i > 0; i--) {
		comparisons++;
                if ((data.get(i)).compareTo(data.get(i - 1)) < 0) {
                    swaps++;
                    Comparable temp = data.get(i - 1);
                    data.set(i - 1, data.get(i));
                    data.set(i, temp);
                } else
                    break;
            }
        }
	System.out.println("Insertion sort # of comparisons: " + comparisons);
        System.out.println("Insertion sort # of swaps: " + swaps);
        return data;
    }

}
