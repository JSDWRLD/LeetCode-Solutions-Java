# [LeetCode Solutions in Java](https://leetcode.com/problemset/all/)

* [My LeetCode Profile](https://leetcode.com/JSDWRLD/)
* This is a repository filed with my LeetCode solutions along with my algorithm analysis.

## Data Structures
* [Array](https://github.com/JSDWRLD/LeetCode-Solutions-Java#array)
* [Matrix/Grid](https://github.com/JSDWRLD/LeetCode-Solutions-Java#matrix-and-grid)
* [HashMap](https://github.com/JSDWRLD/LeetCode-Solutions-Java#hashmap)
* [String](https://github.com/JSDWRLD/LeetCode-Solutions-Java#string)
* [Linked List](https://github.com/JSDWRLD/LeetCode-Solutions-Java#linked-list)
* [Stack](https://github.com/JSDWRLD/LeetCode-Solutions-Java#stack)
* [Tree](https://github.com/JSDWRLD/LeetCode-Solutions-Java#tree)

## Dynamic Programming
* [Memoization](https://github.com/JSDWRLD/LeetCode-Solutions-Java#memoization)


## Array
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/) | [Java](./Arrays/container_with_most_water.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointer, Greedy
15 | [3Sum](https://leetcode.com/problems/3sum/description/) | [Java](./Arrays/3sum.java) | _O(n^2)_ | _O(1)_ | Medium || Arrays, Two Pointer, Sorting
26 | [Remove Element](https://leetcode.com/problems/remove-element/description/) | [Java](./Arrays/remove_element.java) | _O(n)_ | _O(1)_ | Easy || Arrays
27 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/) | [Java](./Arrays/remove_duplicates_from_sorted_array.java) | _O(n)_ | _O(1)_ | Easy || Arrays
33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/) | [Java](./Arrays/search_in_rotated_sorted_array.java) | _O(log n)_ | _O(1)_ | Medium || Arrays, Binary Search
35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/description/) | [Java](./Arrays/search_insert_position.java) | _O(log n)_ | _O(1)_ | Easy || Arrays, Binary Search
42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/) | [Java](./Arrays/trapping_rain_water.java) | _O(n)_ | _O(1)_ | Hard || Two Pointers
56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/) | [Java](./Arrays/merge_intervals.java) | _O(n log n)_ | _O(n)_ | Medium || Intervals, Sorting, Arrays
57 | [Insert Interval](https://leetcode.com/problems/insert-interval/description/) | [Java](./Arrays/insert_interval.java) | _O(n)_ | _O(n)_ | Medium || Intervals, Sorting, Arrays
66 | [Plus One](https://leetcode.com/problems/plus-one/description/) | [Java](./Arrays/plus_one.java) | _O(n)_ | _O(1)_ | Easy || Arrays
88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/) | [Java](./Arrays/Merge_Sorted_Array.java) | _O(n)_ | _O(1)_ | Easy || Arrays
121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/) | [Java](./Arrays/best_time_to_buy_and_sell_stock.java) | _O(n)_ | _O(1)_ | Easy || Arrays, Sliding Window
128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/) | [Java](./Arrays/longest_consecutive_sequence.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Set
153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/) | [Java](./Arrays/find_minimum_in_rotated_sorted_array.java) | _O(log n)_ | _O(1)_ | Medium || Arrays, Binary Search
167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/) | [Java](./Arrays/two_sum_ii_input_array_is_sorted.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointer, Binary Search
238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/) | [Java](./Arrays/product_of_array_except_self.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Prefix Sum
268 | [Missing Number](https://leetcode.com/problems/missing-number/description/) | [Java](./Arrays/missing_number.java) | _O(n)_ | _O(1)_ | Easy || Cyclic Sort
287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/description/) | [Java](./Arrays/find_the_duplicate_number.java) | _O(n)_ | _O(1)_ | Medium || Slow & Faster Pointer, Two Pointers, Cyclic
347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/) | [Java](./Arrays/top_k_frequent_elements.java) | _O(n + k)_ | _O(n + k)_ | Medium || Bucket Sort, Arrays, HashMap/Table
435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/description/) | [Java](./Arrays/non-overlapping_intervals.java) | _O(n log n)_ | _O(1)_ | Medium || Merge Intervals
448 | [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/) | [Java](./Arrays/find_all_numbers_disappeared_in_an_array.java) | _O(n)_ | _O(1)_ | Easy || Cyclic Sort
643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/description/) | [Java](./Arrays/maximum_average_subarray_i.java) | _O(n)_ | _O(1)_ | Easy || Sliding Window, Arrays
645 | [Set Mismatch](https://leetcode.com/problems/set-mismatch/description/) | [Java](./Arrays/set_mismatch.java) | _O(n)_ | _O(1)_ | Easy || Cyclic Sort
704 | [Binary Search](https://leetcode.com/problems/binary-search/description/) | [Java](./Arrays/binary_search.java) | _O(log n)_ | _O(1)_ | Easy || Arrays, Binary Search
832 | [Flipping an Image](https://leetcode.com/problems/flipping-an-image/description/) | [Java](./Arrays/flipping_an_image.java) | _O(n * m)_ | _O(1)_ | Easy || Two Pointers, Matrix
853 | [Car Fleet](https://leetcode.com/problems/car-fleet/description/) | [Java](./Arrays/car_fleet.java) | _O(n log n)_ | _O(n)_ | Medium || 2D Array, Quicksort
875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/description/) | [Java](./Arrays/koko_eating_bananas.java) | _O(n log m)_ | _O(1)_ | Medium || Arrays, Binary Search
904 | [Fruits Into Baskets](https://leetcode.com/problems/fruit-into-baskets/description/) | [Java](./Arrays/fruits_into_baskets.java) | _O(n)_ | _O(1)_ | Medium || Sliding Window, Hash Table
908 | [Smallest Range I](https://leetcode.com/problems/smallest-range-i/description/) | [Java](./Arrays/smallest_range_i.java) | _O(n)_ | _O(1)_ | Easy || Arrays, Math
912 | [Sort an Array](https://leetcode.com/problems/sort-an-array/description/) | [Java](./Arrays/sort_an_array.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Sorting
974 | [Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/description/) | [Java](./Arrays/subarray_sums_divisible_by_k.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Prefix Sum, HashMap
986 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/description/) | [Java](./Arrays/interval_list_intersections.java) | _O(n)_ | _O(n)_ | Medium || Intervals

## Matrix and Grid
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/description/) | [Java](./MatrixGrids/search_a_2d_matrix.java) | _O(log m + n)_ | _O(1)_ | Medium || Arrays, Matrix, Binary Search

## HashMap
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
1 | [Two Sum](https://leetcode.com/problems/two-sum/description/) | [Java](./Maps/two_sum.java) | _O(n)_ | _O(n)_ | Easy || HashMap
3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/) | [Java](./Maps/longest_substring_without_repeating_characters.java) | _O(n)_ | _O(m)_ | Medium || HashSet, Sliding Window
49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/description/) | [Java](./Maps/group_anagrams.java) | _O(n * k log k)_ | _O(n)_ | Medium || HashMap, ArrayList
242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/) | [Java](./Maps/valid_anagram.java) | _O(log n)_ | _O(n + m)_ | Easy || HashMap

## String
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/) | [Java](./Strings/longest_common_prefix.java) | _O(n * log(n))_ | _O(1)_ | Easy || Strings
22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/description/) | [Java](./Strings/generate_parentheses.java) | _O(4^n / sqrt(n))_ | _O(n)_ | Medium || Backtracking, Dynamic Programming
28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/) | [Java](./Strings/find_index_first_occurrence_string.java) | _O(n)_ | _O(1)_ | Easy || Strings
58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/description/) | [Java](./Strings/length_of_last_word.java) | _O(n)_ | _O(1)_ | Easy || Strings
125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/) | [Java](./Strings/valid_palindrome.java) | _O(n)_ | _O(1)_ | Easy || Strings, Two Pointer
424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/description/) | [Java](./Strings/longest_repeating_character_replacement.java) | _O(n)_ | _O(1)_ | Medium || Hash Table, Sliding Window
567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/description/) | [Java](./Strings/permutation_in_string.java) | _O(n)_ | _O(1)_ | Medium || Sliding Window

## Linked List
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
2 | [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/description/) | [Java](./LinkedLists/add_two_numbers.java) | _O(n)_ | _O(n)_ | Medium || ListNode, Singly Linked List
19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/) | [Java](./LinkedLists/remove_nth_node_from_end_of_list.java) | _O(n)_ | _O(1)_ | Medium || ListNode, Singly Linked List
21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/) | [Java](./LinkedLists/merge_two_sorted_lists.java) | _O(n)_ | _O(1)_ | Easy || ListNode
25 | [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/description/) | [Java](./LinkedLists/reverse_nodes_in_kgroup.java) | _O(n)_ | _O(1)_ | Hard || ListNode, Reversal
61 | [Rotate List](https://leetcode.com/problems/rotate-list/description/) | [Java](./LinkedLists/rotate_list.java) | _O(n)_ | _O(1)_ | Medium || ListNode, Reversal
83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/) | [Java](./LinkedLists/remove_duplicates_from_sorted_list.java) | _O(n)_ | _O(1)_ | Easy || ListNode, Singly Linked List
92 | [Reveresed Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/description/) | [Java](./LinkedLists/reversed_linked_list_ii.java) | _O(n)_ | _O(1)_ | Medium || ListNode, Reversal
141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/description/) | [Java](./LinkedLists/linked_list_cycle.java) | _O(n)_ | _O(1)_ | Easy || Two Pointers, Singly Linked List
142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/description/) | [Java](./LinkedLists/linked_list_cycle_II.java) | _O(n)_ | _O(1)_ | Medium || Slow/Fast Pointer, Two Pointers
143 | [Reorder List](https://leetcode.com/problems/reorder-list/description/) | [Java](./LinkedLists/reorder_list.java) | _O(n)_ | _O(1)_ | Medium || Two Pointers, Fast and Slow Pointer
206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/) | [Java](./LinkedLists/reverse_linked_list.java) | _O(n)_ | _O(1)_ | Easy || ListNode, Singly Linked List

## Stack
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
20 | [Valid Parenthesis](https://leetcode.com/problems/valid-parentheses/description/) | [Java](./Stacks/valid_parentheses.java) | _O(n)_ | _O(1)_ | Easy || Stacks
150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/description/) | [Java](./Stacks/evaluate_reverse_polish_notation.java) | _O(n)_ | _O(n)_ | Medium || Math, Arrays
155 | [Min Stack](https://leetcode.com/problems/min-stack/description/) | [Java](./Stacks/min_stack.java) | _O(1)_ | _O(n)_ | Medium | Design | Stacks
739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/description/) | [Java](./Stacks/daily_temperatures.java) | _O(n)_ | _O(n)_ | Medium || Array, Monotonic Stack

## Tree
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
100 | [Same Tree](https://leetcode.com/problems/same-tree/description/) | [Java](./Trees/same_tree.java) | _O(n)_ | _O(h)_ | Easy || Tree
102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/description/) | [Java](./Trees/binary_tree_level_order_traversal.java) | _O(n)_ | _O(n)_ | Medium || Tree, Breadth-First Search
103 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/) | [Java](./Trees/binary_tree_zigzag_level_order_traversal.java) | _O(n)_ | _O(n)_ | Medium || Tree, Breadth-First Search
104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/) | [Java](./Trees/maximum_depth_of_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Tree
107 | [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/) | [Java](./Trees/binary_tree_level_order_traversal_ii.java) | _O(n)_ | _O(n)_ | Medium || Tree, Breadth-First Search
110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/description/) | [Java](./Trees/balanced_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Depth-First Search
111 | [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/description/) | [Java](./Trees/minimum_depth_of_binary_tree.java) | _O(n)_ | _O(n)_ | Easy || Breadth-First Search
112 | [Path Sum](https://leetcode.com/problems/path-sum/description/) | [Java](./Trees/path_sum.java) | _O(n)_ | _O(n)_ | Easy || Depth-First Search
113 | [Path Sum II](https://leetcode.com/problems/path-sum-ii/description/) | [Java](./Trees/path_sum_ii.java) | _O(n^2)_ | _O(n * log n)_ | Medium || Depth-First Search
116 | [Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/) | [Java](./Trees/populating_next_right_pointers_in_each_node.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
117 | [Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/) | [Java](./Trees/populating_next_right_pointers_in_each_node_ii.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/description/) | [Java](./Trees/binary_tree_right_side_view.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/) | [Java](./Trees/invert_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Tree
543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/description/) | [Java](./Trees/diameter_of_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Binary Tree. Depth-First Search
572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/description/) | [Java](./Trees/subtree_of_another_tree.java) | _O(n * m)_ | _O(h)_ | Easy || Tree, Depth-First Search
637 | [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/description/) | [Java](./Trees/average_of_levels_in_binary_tree.java) | _O(n)_ | _O(n)_ | Easy || Tree, Breadth-First Search

## Memoization
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/description/) | [Java](./DynamicProgramming/climbing_stairs.java) | _O(n)_ | _O(n)_ | Easy || Memoization, Recursion
198 | [House Robber](https://leetcode.com/problems/house-robber/description/) | [Java](./DynamicProgramming/house_robber.java) | _O(n)_ | _O(n)_ | Medium || Memoization, Recursion
509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/description/) | [Java](./DynamicProgramming/fibonacci_number.java) | _O(n)_ | _O(n)_ | Easy || Memoization, Recursion
