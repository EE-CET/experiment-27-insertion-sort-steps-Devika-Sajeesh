[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/47zWCFPi)
# Experiment 27: Insertion Sort Steps

## Problem Statement

Given a sorted list with an unsorted number $e$ in the rightmost cell, write code to insert $e$ into the array so that it remains sorted.

Print the array as a row of space-separated integers **each time** there is a shift or insertion.

## Input Format

* The first line contains the integer $n$.
* The next line contains $n$ space-separated integers.

## Output Format

Print the array at each shift or insertion.

### Example 1

**Input:**

```text
5
2 4 6 8 3
```

**Output:**

```text
2 4 6 8 8
2 4 6 6 8
2 4 4 6 8
2 3 4 6 8
```

### Explanation

1.  **Initial:** `2 4 6 8 3`. The unsorted element is `3`.
2.  Compare `3` with `8`. `8 > 3`, so shift `8` to the right.
    * Array becomes: `2 4 6 8 8` (**Print**)
3.  Compare `3` with `6`. `6 > 3`, so shift `6` to the right.
    * Array becomes: `2 4 6 6 8` (**Print**)
4.  Compare `3` with `4`. `4 > 3`, so shift `4` to the right.
    * Array becomes: `2 4 4 6 8` (**Print**)
5.  Compare `3` with `2`. `2 < 3`, so insert `3` into the gap.
    * Array becomes: `2 3 4 6 8` (**Print**)
