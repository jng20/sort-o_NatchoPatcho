# Natcho Patcho

## Team Members:
- Faiza Huda
   - Truthful Tom
   - Huebert
- Gabriel Thompson
   - Iggy
- Jacob Ng
  - PreGuac

### SotW
"Enemy" by Imagine Dragons but then again not really

_____________________
## Bubblesort

### Description
Start with the first two items. If the first item is larger than the second item, swap them. Repeat this process for every two adjacent items in the array. This is considered one pass. Do n-1 passes.

### Best Case
 * Arrangement: Sorted, ascending
 * Time Complexity: O(1) swaps, O(n^2) comparisons
 * Swaps: 0 swaps

**Explanation:** A swap is only made if two elements are out of order. If the array is already in ascending order, no swaps will be made. The algorithm does not end when the array is sorted, but rather when n-1 passes have been completed. So, there are on the order of n passes each of which have on the order of n comparisons, making the total number of comparisons on the order of n^2. This would make the time complexity, at best case, O(n^2).

### Worst Case
* Arrangement: Sorted, descending
* Time Complexity: O(n^2) swaps, O(n^2) comparisons
* Swaps for size 100: 4,851 swaps

**Explanation:** In bubble sort, items are put into their proper place by swapping with adjacent items, in order to "bubble" towards their appropriate position. Thus, the number of swaps to move any item into its proper position depends on how far it starts from where it should be. The input being in descending order maximizes the number of these swaps, because it positions the lowest numbers at the end of the array, which means that they must take the most swaps to "bubble" towards the start.

_____________________
## Insertion Sort

### Description
Set the partition size to 2. In one pass, go backwards through each adjacent pair of two items within the first "partition" items. If the first item is larger than the second, swap them. If they are not, finish the pass, and increase the partition size by 1. Keep doing passes until the partition size reaches the array size.

### Best Case
 * Arrangement: Sorted, ascending
 * Time Complexity: O(1) swaps, O(n) comparisons
 * Swaps for size 100: 0 swaps

**Explanation:** In each pass, the algorithm looks backwards until it finds an adjacent pair that is already sorted, and then finishes the pass. If the entire array is already sorted, each pass will terminate in its first comparison. This means that each of O(n) passes will finish in O(1) time, making the overall time complexity O(n).

### Worst Case
 * Arrangement: Sorted, descending
 * Time Complexity: O(n^2) swaps, O(n^2) comparisons
 * Swaps for size 100: 4,851 swaps

**Explanation:** Each pass of insertion sort terminates when the item that is being moved TBC

_____________________
## Selection Sort
Best Case Scenario: 0 swaps\
Worst Case Scenario: 4,851 swaps\
"Average" Case Scenario: 2,395 swaps

_____________________
## Comparison

Size for all arrays: 100

| Algorithm | Best Case (# of swaps) | Random / "Normal" Case (# of swaps) | Worst Case (# of swaps) |
| --------- | --------- | ---------- | ---------- |
| Bubble Sort | 4,851 | 2,546 | 0 |
| Selection Sort | 4,851 | 2,395 | 0 |
| Insertion Sort | 4,851 | 2,463 | 0 |

