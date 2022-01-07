# Natcho Patcho

## Team Members:
- Faiza Huda
   - Truthful Tom
   - Huebert
- Gabriel Thompson
   - Iggy
- Jacob Ng
  - PreGuac

_____________________
### Best Case / Worst Case Explanation
Because swaps are much more computationally intensive than comparisons, the number of swaps is the best metric of how computationally intensive each
algorithm is. The best case, therefore, would be the case which requires the fewest swaps, and the worst case would be the case which requires the most swaps.

#### But what is the best case?
In all three sorting algorithms, the case where the array is already ordered will require zero swaps. This would make it the best case. All of the sorting
algorithms we use involve comparing elements, and swapping them if they are out of order. If all of the elements are already in order, no out-of-order pairs
will ever be found, and so no swaps will ever be made.

#### But what is a worst case?
In all three algorithms, a worst case is the case where the array is in reverse order. In both bubble sort and insertion sort, swaps are made by comparing
adjacent elements. In order to move a small element on the "left" of the array to the "right", it would need to "bubble" or "walk" all the way there. Selection
sort does not have this same issue, but a reversed array is still a worst case, because every number still needs to be moved.

_____________________
### Results

Size for all arrays: 100

| Algorithm | Best Case (# of swaps) | Random / "Normal" Case (# of swaps) | Worst Case (# of swaps) |
| --------- | --------- | ---------- | ---------- |
| Bubble Sort | 4,851 | 2,546 | 0 |
| Selection Sort | 4,851 | 2,395 | 0 |
| Insertion Sort | 4,851 | 2,463 | 0 |

