# Natcho Patcho

## DA TEAM (in order of lsat nombre)
 - [Faiza Huda](https://www.github.com/FeiFiFoFaiza)
     - duckies: TruthfulTom, Hubert
 - [Jacob Ng](https://www.github.com/jng20)
     - duckies: PreGuac
 - [Gabriel Thompson](https://www.github.com/gthompson30)
     - duckies: Iggy

### SotW
"Enemy" by Imagine Dragons *(but then again not really)*

_____________________
## Bubblesort

### Description
Start with the first two items. If the first item is larger than the second item, swap them. Repeat this process for every two adjacent items in the array. This is considered one pass. Do n-1 passes.

### Best Case
 * Arrangement: Sorted, ascending
 * Time Complexity: O(1) swaps, O(n^2) comparisons
 * Swaps for size 100: 0 swaps
 * Comparisons for size 100: 9,604 comparisons
 * Passes for size 100: 98 passes

**Explanation:** A swap is only made if two elements are out of order. If the array is already in ascending order, no swaps will be made. The algorithm does not end when the array is sorted, but rather when n-1 passes have been completed. So, there are on the order of n passes each of which have on the order of n comparisons, making the total number of comparisons on the order of n^2. This would make the time complexity, at best case, O(n^2).

### Worst Case
* Arrangement: Sorted, descending
* Time Complexity: O(n^2) swaps, O(n^2) comparisons
* Swaps for size 100: 4,851 swaps
* Comparisons for size 100: 9,604 comparisons
* Passes for size 100: 98 passes

**Explanation:** In bubble sort, items are put into their proper place by swapping with adjacent items, in order to "bubble" towards their appropriate position. Thus, the number of swaps to move any item into its proper position depends on how far it starts from where it should be. The input being in descending order maximizes the number of these swaps, because it positions the lowest numbers at the end of the array, which means that they must take the most swaps to "bubble" towards the start.

_____________________
## Insertion Sort

### Description
Set the partition size to 2. In one pass, go backwards through each adjacent pair of two items within the first "partition" items. If the first item is larger than the second, swap them. If they are not, finish the pass, and increase the partition size by 1. Keep doing passes until the partition size reaches the array size.

### Best Case
 * Arrangement: Sorted, ascending
 * Time Complexity: O(1) swaps, O(n) comparisons
 * Swaps for size 100: 0 swaps
 * Comparisons for size 100: 98 comparisons
 * Passes for size 100: 98 passes

**Explanation:** In each pass, the algorithm looks backwards until it finds an adjacent pair that is already sorted, and then finishes the pass. If the entire array is already sorted, each pass will terminate in its first comparison. This means that each of O(n) passes will finish in O(1) time, making the overall time complexity O(n).

### Worst Case
 * Arrangement: Sorted, descending
 * Time Complexity: O(n^2) swaps, O(n^2) comparisons
 * Swaps for size 100: 4,851 swaps
 * Comparisons for size 100: 4,851 comparisons
 * Passes for size 100: 98 passes

**Explanation:** Each pass of insertion sort terminates when the pass'th item that is being moved has been moved into its correct spot. If the items are in descending order, the algorithm will have to "walk" each number as far away as possible, which would maximize the number of required swaps. There will be on the order of O(n) passes, each of which will take O(n) time, so the overall time complexity for comparisons will be O(n^2). The algorithm will always be swapping items backwards, so every comparisons will result in a swap. This will make the time complexity for swaps also be O(n^2).
_____________________
## Selection Sort

### Description
Start from the last item. Keep track of the current pass (0-indexed). Go backwards until the pass'th item, keeping track of the index of the highest found item. Once you have finished going backwards, swap the highest found index with the pass'th index. Increment the pass counter.

### Best Case
 * Arrangement: Sorted, ascending
 * Time Complexity: O(n) swaps, O(n^2) comparisons
 * Swaps for size 100: 98 swaps
 * Comparisons for size 100: 4,949 comparisons
 * Passes for size 100: 98 passes

**Explanation:** In one pass, the algorithm looks backwards to find the lowest value on or after the pass'th index. This means it needs to compare the index it "pass" with all the indexes after it, so one pass is on time complexity O(n). The entire algorithm requires doing O(n) passes, so the time complexity for comparisons is O(n^2). In one pass, once it finds the lowest value, it swaps its index with the index of pass. This means that exactly 1 swap is done per pass regardless of order, or O(1). Because there are O(n) passes and O(1) swaps per pass, the time complexity for swaps is O(n).

### Worst Case
 * Arrangement: Sorted, descending
 * Time Complexity: O(n) swaps, O(n^2) comparisons
 * Swaps for size 100: 98 swaps
 * Comparisons for size 100: 4,949 comparisons
 * Passes for size 100: 98 passes

**Explanation:** The worst case time complexity for both swaps and comparisons will be the same as the best case time complexity, because selection sort does not decide on whether to do a swap depending on if a pair is sorted or not. Selection sort will make O(n) comparisons for a pass regardless, and will make O(n) passes. This makes the comparisons time complexity O(n^2). It will also make one swap for each pass, even if that means swapping an item with itself.
