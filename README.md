# [LeetCode Solutions in Java](https://leetcode.com/problemset/all/)

* [My Profile](https://leetcode.com/JSDWRLD/)
* This is a repository filed with my Leetcode solutions along with Time and Space Analysis.

## Data Structures
* [Array](https://github.com/JSDWRLD/LeetCode-Solutions-Java#array)
* [Matrix and Graph](https://github.com/JSDWRLD/LeetCode-Solutions-Java#matrix-and-graph)
* [HashMap](https://github.com/JSDWRLD/LeetCode-Solutions-Java#hashmap)
* [String](https://github.com/JSDWRLD/LeetCode-Solutions-Java#string)
* [Linked List](https://github.com/JSDWRLD/LeetCode-Solutions-Java#linked-list)
* [Stack](https://github.com/JSDWRLD/LeetCode-Solutions-Java#stack)
* [Tree](https://github.com/JSDWRLD/LeetCode-Solutions-Java#tree)
* [Heaps and Priority Queue](https://github.com/JSDWRLD/LeetCode-Solutions-Java#heaps-and-priority-queue)
* [Math and Bit Manipulation](https://github.com/JSDWRLD/LeetCode-Solutions-Java#math-and-bit-manipulation)
* [Dynamic Programming](https://github.com/JSDWRLD/LeetCode-Solutions-Java#dynamic-programming)


## Array
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/description/) | [Java](./Arrays/median_of_two_sorted_arrays.java) | _O(log(m + n))_ | _O(1)_ | Hard || Two Pointer, Binary Search, Sorting
11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/) | [Java](./Arrays/container_with_most_water.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointer, Greedy
15 | [3Sum](https://leetcode.com/problems/3sum/description/) | [Java](./Arrays/3sum.java) | _O(n^2)_ | _O(1)_ | Medium || Arrays, Two Pointer, Sorting
26 | [Remove Element](https://leetcode.com/problems/remove-element/description/) | [Java](./Arrays/remove_element.java) | _O(n)_ | _O(1)_ | Easy || Arrays
27 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/) | [Java](./Arrays/remove_duplicates_from_sorted_array.java) | _O(n)_ | _O(1)_ | Easy || Arrays
31 | [Next Permutation](https://leetcode.com/problems/next-permutation/description/) | [Java](./Arrays/next_permutation.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointers
33 | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/) | [Java](./Arrays/search_in_rotated_sorted_array.java) | _O(log n)_ | _O(1)_ | Medium || Arrays, Binary Search
34 | [Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/) | [Java](./Arrays/find_first_and_last_position_of_element_in_sorted_array.java) | _O(log n)_ | _O(1)_ | Medium || Arrays, Binary Search
35 | [Search Insert Position](https://leetcode.com/problems/search-insert-position/description/) | [Java](./Arrays/search_insert_position.java) | _O(log n)_ | _O(1)_ | Easy || Arrays, Binary Search
42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/) | [Java](./Arrays/trapping_rain_water.java) | _O(n)_ | _O(1)_ | Hard || Two Pointers
45 | [Jump Game II](https://leetcode.com/problems/jump-game-ii/description/) | [Java](./Arrays/jump_game_ii.java) | _O(n)_ | _O(1)_ | Medium || Two Pointers
46 | [Permutations](https://leetcode.com/problems/permutations/description/) | [Java](./Arrays/permutations.java) | _O(n * p!)_ | _O(n * p!)_ | Medium || Breadth-First
53 | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/) | [Java](./Arrays/maximum_subarray.java) | _O(n )_ | _O(1)_ | Medium || Math
56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/description/) | [Java](./Arrays/merge_intervals.java) | _O(n log n)_ | _O(n)_ | Medium || Intervals, Sorting, Arrays
57 | [Insert Interval](https://leetcode.com/problems/insert-interval/description/) | [Java](./Arrays/insert_interval.java) | _O(n)_ | _O(n)_ | Medium || Intervals, Sorting, Arrays
66 | [Plus One](https://leetcode.com/problems/plus-one/description/) | [Java](./Arrays/plus_one.java) | _O(n)_ | _O(1)_ | Easy || Arrays
75 | [Sort Colors](https://leetcode.com/problems/sort-colors/description/) | [Java](./Arrays/sort_colors.java) | _O(n)_ | _O(1)_ | Medium || Two Pointers
78 | [Subsets](https://leetcode.com/problems/subsets/description/) | [Java](./Arrays/subsets.java) | _O(2^n)_ | _O(2^n)_ | Medium || Backtracking
88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/) | [Java](./Arrays/Merge_Sorted_Array.java) | _O(n)_ | _O(1)_ | Easy || Arrays
121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/) | [Java](./Arrays/best_time_to_buy_and_sell_stock.java) | _O(n)_ | _O(1)_ | Easy || Arrays, Sliding Window
128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/) | [Java](./Arrays/longest_consecutive_sequence.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Set
136 | [Single Number](https://leetcode.com/problems/single-number/description/) | [Java](./Arrays/single_number.java) | _O(n)_ | _O(1)_ | Easy || Bit Manipulation
152 | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/description/) | [Java](./Arrays/maximum_product_subarray.java) | _O(n)_ | _O(1)_ | Medium || Max/Min 
153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/) | [Java](./Arrays/find_minimum_in_rotated_sorted_array.java) | _O(log n)_ | _O(1)_ | Medium || Arrays, Binary Search
163 | [Missing Ranges](https://leetcode.com/problems/missing-ranges/description/) | [Java](./Arrays/missing_ranges.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two-Pointers
167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/) | [Java](./Arrays/two_sum_ii_input_array_is_sorted.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointer, Binary Search
169 | [Majority Element](https://leetcode.com/problems/majority-element/description/) | [Java](./Arrays/majority_element.java) | _O(n log n)_ | _O(1)_ | Easy || Sort
217 | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate/description/) | [Java](./Arrays/contains_duplicate.java) | _O(n)_ | _O(n)_ | Easy || HashSet
238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/) | [Java](./Arrays/product_of_array_except_self.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Prefix Sum
260 | [Single Number III](https://leetcode.com/problems/single-number-iii/description/) | [Java](./Arrays/single_number_iii.java) | _O(n)_ | _O(1)_ | Medium || Bit Manipulation
268 | [Missing Number](https://leetcode.com/problems/missing-number/description/) | [Java](./Arrays/missing_number.java) | _O(n)_ | _O(1)_ | Easy || Cyclic Sort
283 | [Move Zeros](https://leetcode.com/problems/move-zeroes/description/) | [Java](./Arrays/move_zeros.java) | _O(n)_ | _O(1)_ | Easy || Two Pointers
287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/description/) | [Java](./Arrays/find_the_duplicate_number.java) | _O(n)_ | _O(1)_ | Medium || Slow & Faster Pointer, Two Pointers, Cyclic
347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/) | [Java](./Arrays/top_k_frequent_elements.java) | _O(n + k)_ | _O(n + k)_ | Medium || Bucket Sort, Arrays, HashMap/Table
435 | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/description/) | [Java](./Arrays/non-overlapping_intervals.java) | _O(n log n)_ | _O(1)_ | Medium || Merge Intervals
448 | [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/) | [Java](./Arrays/find_all_numbers_disappeared_in_an_array.java) | _O(n)_ | _O(1)_ | Easy || Cyclic Sort
528 | [Random Pick with Weight](https://leetcode.com/problems/random-pick-with-weight/description/) | [Java](./Arrays/random_pick_with_weight.java) | _O(log n)_ | _O(1)_ | Medium || Prefix Sum, Binary Search
575 | [Distribute Candies](https://leetcode.com/problems/distribute-candies/description/) | [Java](./Arrays/distribute_candies.java) | _O(n)_ | _O(n)_ | Easy || HashSet
643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/description/) | [Java](./Arrays/maximum_average_subarray_i.java) | _O(n)_ | _O(1)_ | Easy || Sliding Window, Arrays
645 | [Set Mismatch](https://leetcode.com/problems/set-mismatch/description/) | [Java](./Arrays/set_mismatch.java) | _O(n)_ | _O(1)_ | Easy || Cyclic Sort
658 | [Find K Closest Elements](https://leetcode.com/problems/find-k-closest-elements/description/) | [Java](./Arrays/find_k_closest_elements.java) | _O(log n + k)_ | _O(1)_ | Medium || Binary Search
704 | [Binary Search](https://leetcode.com/problems/binary-search/description/) | [Java](./Arrays/binary_search.java) | _O(log n)_ | _O(1)_ | Easy || Arrays, Binary Search
744 | [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/) | [Java](./Arrays/find_smallest_letter_greater_than_target.java) | _O(log n)_ | _O(1)_ | Easy || Arrays, Binary Search
832 | [Flipping an Image](https://leetcode.com/problems/flipping-an-image/description/) | [Java](./Arrays/flipping_an_image.java) | _O(r * c)_ | _O(r * c)_ | Easy || Two Pointers, Matrix, Bit Manipulation
853 | [Car Fleet](https://leetcode.com/problems/car-fleet/description/) | [Java](./Arrays/car_fleet.java) | _O(n log n)_ | _O(n)_ | Medium || 2D Array, Quicksort
875 | [Koko Eating Bananas](https://leetcode.com/problems/koko-eating-bananas/description/) | [Java](./Arrays/koko_eating_bananas.java) | _O(n log m)_ | _O(1)_ | Medium || Arrays, Binary Search
904 | [Fruits Into Baskets](https://leetcode.com/problems/fruit-into-baskets/description/) | [Java](./Arrays/fruits_into_baskets.java) | _O(n)_ | _O(1)_ | Medium || Sliding Window, Hash Table
908 | [Smallest Range I](https://leetcode.com/problems/smallest-range-i/description/) | [Java](./Arrays/smallest_range_i.java) | _O(n)_ | _O(1)_ | Easy || Arrays, Math
912 | [Sort an Array](https://leetcode.com/problems/sort-an-array/description/) | [Java](./Arrays/sort_an_array.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Sorting
974 | [Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/description/) | [Java](./Arrays/subarray_sums_divisible_by_k.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Prefix Sum, HashMap
986 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/description/) | [Java](./Arrays/interval_list_intersections.java) | _O(n)_ | _O(n)_ | Medium || Intervals
1248 | [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/) | [Java](./Arrays/count_number_of_nice_subarrays.java) | _O(n)_ | _O(k)_ | Medium || Sliding Window
1282 | [Group the People Given the Group Size They Belong To](https://leetcode.com/problems/group-the-people-given-the-group-size-they-belong-to/description/) | [Java](./Arrays/group_the_people_given_the_group_size_they_belong_to.java) | _O(n log n)_ | _O(n)_ | Medium || Min-Heap, Merge Intervals
2892 | [Minimizing Array After Replacing Pairs With Their Product](https://leetcode.com/problems/minimizing-array-after-replacing-pairs-with-their-product/description/) | [Java](./Arrays/minimizing_array_after_replacing_pairs_with_their_product.java) | _O(n)_ | _O(1)_ | Medium || Greedy
3208 | [Alternating Groups II](https://leetcode.com/problems/alternating-groups-ii/description/) | [Java](./Arrays/alternating_groups_ii.java) | _O(n)_ | _O(n)_ | Medium || Sliding Window

## Matrix and Graph
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
36 | [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/description/) | [Java](./MatrixGrids/valid_sudoku.java) | _O(1)_ | _O(1)_ | Medium || Arrays, Matrix, HashMap
48 | [Rotate Image](https://leetcode.com/problems/rotate-image/description/) | [Java](./MatrixGrids/rotate_image.java) | _O(r * c)_ | _O(1)_ | Medium || Matrix, Swap RC, Two Lines
54 | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/description/) | [Java](./MatrixGrids/spiral_matrix.java) | _O(r * c)_ | _O(1)_ | Medium || Matrix, Outside Pointers
59 | [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii/description/) | [Java](./MatrixGrids/spiral_matrix_ii.java) | _O(r * c)_ | _O(1)_ | Medium || Matrix, Outside Pointers
74 | [Search a 2D Matrix](https://leetcode.com/problems/search-a-2d-matrix/description/) | [Java](./MatrixGrids/search_a_2d_matrix.java) | _O(log m + n)_ | _O(1)_ | Medium || Arrays, Matrix, Binary Search
79 | [Word Search](https://leetcode.com/problems/word-search/description/) | [Java](./MatrixGrids/word_search.java) | _O(r * c * 4^w)_ | _O(1)_ | Medium || Matrix, Backtracking, Graph Depth-First Search
130 | [Surrounded Regions](https://leetcode.com/problems/surrounded-regions/description/) | [Java](./MatrixGrids/surrounded_regions.java) | _O(r * c)_ | _O(r * c)_ | Medium || Matrix, Graph Depth-First Search, Reverse Logic
133 | [Clone Graph](https://leetcode.com/problems/clone-graph/description/) | [Java](./MatrixGrids/clone_graph.java) | _O(v * e)_ | _O(v * e)_ | Medium || Depth-First Search
200 | [Number of Islands](https://leetcode.com/problems/number-of-islands/description/) | [Java](./MatrixGrids/number_of_islands.java) | _O(r * c)_ | _O(r * c)_ | Medium || Matrix, Graph Depth-First Search
207 | [Course Schedule](https://leetcode.com/problems/course-schedule/description/) | [Java](./MatrixGrids/course_schedule.java) | _O(v * p)_ | _O(v * p)_ | Medium || Graph Depth-First Search
210 | [Course Schedule II](https://leetcode.com/problems/course-schedule-ii/description/) | [Java](./MatrixGrids/course_schedule_ii.java) | _O(v * e)_ | _O(v * e)_ | Medium || Graph Breadth-First Search, Topological Sort
261 | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree/description/) | [Java](./MatrixGrids/graph_valid_tree.java) | _O(v * e)_ | _O(v * e)_ | Medium || Graph Depth-First Search,
286 | [Walls and Gates](https://leetcode.com/problems/walls-and-gates/description/) | [Java](./MatrixGrids/walls_and_gates.java) | _O(r * c)_ | _O(r * c)_ | Medium || Matrix, Graph Breadth-First Search
417 | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/description/) | [Java](./MatrixGrids/pacific_atlantic_water_flow.java) | _O(r * c)_ | _O(r * c)_ | Medium || Matrix, Graph Depth-First Search, Reverse Logic
498 | [Diagonal Traverse](https://leetcode.com/problems/diagonal-traverse/description/) | [Java](./MatrixGrids/diagonal_traverse.java) | _O(r * c)_ | _O(1)_ | Medium || Outside Pointers
695 | [Max Area of Island](https://leetcode.com/problems/max-area-of-island/description/) | [Java](./MatrixGrids/max_area_of_island.java) | _O(r * c)_ | _O(r * c)_ | Medium || Matrix, Graph Depth-First Search
733 | [Flood Fill](https://leetcode.com/problems/flood-fill/description/) | [Java](./MatrixGrids/flood_fill.java) | _O(r * c)_ | _O(r * c)_ | Easy || Depth-First Search
766 | [Toeplitz Matrix](https://leetcode.com/problems/toeplitz-matrix/description/) | [Java](./MatrixGrids/toeplitz_matrix.java) | _O(r * c)_ | _O(d)_ | Medium || HashMap
840 | [Magic Squares In Grid](https://leetcode.com/problems/magic-squares-in-grid/description/) | [Java](./MatrixGrids/magic_squares_in_grid.java) | _O(r * c)_ | _O(r * c)_ | Medium || Matrix
994 | [Rotting Oranges](https://leetcode.com/problems/rotting-oranges/description/) | [Java](./MatrixGrids/rotting_oranges.java) | _O(r * c)_ | _O(r * c)_ | Medium || Breadth-first Search
1091 | [Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/description/) | [Java](./MatrixGrids/shortest_path_in_binary_matrix.java) | _O(r * c)_ | _O(r * c)_ | Medium || Breadth-first Search


## HashMap
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
1 | [Two Sum](https://leetcode.com/problems/two-sum/description/) | [Java](./Maps/two_sum.java) | _O(n)_ | _O(n)_ | Easy || HashMap
3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/) | [Java](./Maps/longest_substring_without_repeating_characters.java) | _O(n)_ | _O(m)_ | Medium || HashSet, Sliding Window
49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/description/) | [Java](./Maps/group_anagrams.java) | _O(n * k log k)_ | _O(n)_ | Medium || HashMap, ArrayList
242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/) | [Java](./Maps/valid_anagram.java) | _O(log n)_ | _O(n + m)_ | Easy || HashMap
409 | [Longest Palindrome](https://leetcode.com/problems/longest-palindrome/description/) | [Java](./Maps/longest_palindrome.java) | _O(n)_ | _O(1)_ | Easy || HashSet
957 | [Prison Cells After N Days](https://leetcode.com/problems/prison-cells-after-n-days/description/) | [Java](./Maps/prison_cells_after_n_days.java) | _O(n)_ | _O(1)_ | Medium || HashSet

## String
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/) | [Java](./Strings/longest_common_prefix.java) | _O(n * log(n))_ | _O(1)_ | Easy || Strings
17 | [Number of Combinations of a Phone Number](https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/) | [Java](./Strings/number_of_combinations_of_a_phone_number.java) | _O(n * 4^n)_ | _O(n)_ | Medium || Backtracking
22 | [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/description/) | [Java](./Strings/generate_parentheses.java) | _O(4^n / sqrt(n))_ | _O(n)_ | Medium || Backtracking, Dynamic Programming
28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/) | [Java](./Strings/find_index_first_occurrence_string.java) | _O(n)_ | _O(1)_ | Easy || Strings
58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/description/) | [Java](./Strings/length_of_last_word.java) | _O(n)_ | _O(1)_ | Easy || Strings
125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/) | [Java](./Strings/valid_palindrome.java) | _O(n)_ | _O(1)_ | Easy || Strings, Two Pointer
131 | [Palindrome Partitioning](https://leetcode.com/problems/palindrome-partitioning/description/) | [Java](./Strings/palindrome_partitioning.java) | _O(n * 2^n)_ | _O(n)_ | Medium || Strings, Backtracking
151 | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/description/) | [Java](./Strings/reverse_words_in_a_string.java) | _O(n)_ | _O(n)_ | Medium || Stack, Two Pointers
290 | [Word Pattern](https://leetcode.com/problems/word-pattern/description/) | [Java](./Strings/word_pattern.java) | _O(n)_ | _O(n)_ | Easy || Strings, HashMap
383 | [Ransom Note](https://leetcode.com/problems/ransom-note/description/) | [Java](./Strings/ransom_note.java) | _O(n)_ | _O(n)_ | Easy || Strings, HashMap
387 | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/description/) | [Java](./Strings/first_unique_character_in_a_string.java) | _O(n)_ | _O(1)_ | Easy || Strings, HashMap
424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/description/) | [Java](./Strings/longest_repeating_character_replacement.java) | _O(n)_ | _O(1)_ | Medium || Hash Table, Sliding Window
567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/description/) | [Java](./Strings/permutation_in_string.java) | _O(n)_ | _O(1)_ | Medium || Sliding Window
647 | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/description/) | [Java](./Strings/palindromic_substrings.java) | _O(n)_ | _O(1)_ | Medium || Two Pointers
680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/description/) | [Java](./Strings/valid_palindrome_ii.java) | _O(n)_ | _O(1)_ | Easy || Two Pointers
784 | [Letter Case Permutation](https://leetcode.com/problems/letter-case-permutation/description/) | [Java](./Strings/letter_case_permutation.java) | _O(2^n)_ | _O(2^n)_ | Medium || Subsets
791 | [Custom Sort String](https://leetcode.com/problems/custom-sort-string/description/) | [Java](./Strings/custom_sort_string.java) | _O(n + m)_ | _O(n)_ | Medium || HashMap
929 | [Unique Email Addresses](https://leetcode.com/problems/unique-email-addresses/description/) | [Java](./Strings/unique_email_addresses.java) | _O(n * m)_ | _O(m)_ | Easy || HashSet
1002 | [Find Common Characters](https://leetcode.com/problems/find-common-characters/description/) | [Java](./Strings/find_common_characters.java) | _O(n * m)_ | _O(26)_ | Easy || Character Frequency
1221 | [Split a String in Balanced Strings](https://leetcode.com/problems/split-a-string-in-balanced-strings/description/) | [Java](./Strings/split_a_string_in_balanced_strings.java) | _O(n)_ | _O(1)_ | Easy || Strings

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
146 | [LRU Cache](https://leetcode.com/problems/lru-cache/description/) | [Java](./LinkedLists/lru_cache.java) | _O(1)_ | _O(n)_ | Medium || Hash Table, Doubly LinkedList
206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/) | [Java](./LinkedLists/reverse_linked_list.java) | _O(n)_ | _O(1)_ | Easy || ListNode, Singly Linked List
445 | [Add Two Numbers II](https://leetcode.com/problems/add-two-numbers-ii/description/) | [Java](./LinkedLists/add_two_numbers_ii.java) | _O(n)_ | _O(n)_ | Medium || In Place Reversal, Singly-Linked List
876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/description/) | [Java](./LinkedLists/middle_of_the_linked_list.java) | _O(n)_ | _O(1)_ | Easy || 

## Stack
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
20 | [Valid Parenthesis](https://leetcode.com/problems/valid-parentheses/description/) | [Java](./Stacks/valid_parentheses.java) | _O(n)_ | _O(1)_ | Easy || Stacks
150 | [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/description/) | [Java](./Stacks/evaluate_reverse_polish_notation.java) | _O(n)_ | _O(n)_ | Medium || Math, Arrays
155 | [Min Stack](https://leetcode.com/problems/min-stack/description/) | [Java](./Stacks/min_stack.java) | _O(1)_ | _O(n)_ | Medium | Design | Stacks
227 | [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/) | [Java](./Stacks/basic_calculator_ii.java) | _O(n)_ | _O(n)_ | Medium || Stacks
232 | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/description/) | [Java](./Stacks/implement_queue_using_stacks.java) | _O(n)_ | _O(n)_ | Easy | Design | Stacks
739 | [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/description/) | [Java](./Stacks/daily_temperatures.java) | _O(n)_ | _O(n)_ | Medium || Array, Monotonic Stack
1249 | [Minimum Remove to Make Valid Parentheses](https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/) | [Java](./Stacks/minimum_remove_to_make_valid_parentheses.java) | _O(n)_ | _O(n)_ | Medium || Stack, Set

## Tree
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
98 | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/description/) | [Java](./Trees/validate_binary_search_tree.java) | _O(n)_ | _O(n)_ | Medium || Depth-First Search
100 | [Same Tree](https://leetcode.com/problems/same-tree/description/) | [Java](./Trees/same_tree.java) | _O(n)_ | _O(h)_ | Easy || Tree
102 | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/description/) | [Java](./Trees/binary_tree_level_order_traversal.java) | _O(n)_ | _O(n)_ | Medium || Tree, Breadth-First Search
103 | [Binary Tree Zigzag Level Order Traversal](https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/) | [Java](./Trees/binary_tree_zigzag_level_order_traversal.java) | _O(n)_ | _O(n)_ | Medium || Tree, Breadth-First Search
104 | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/description/) | [Java](./Trees/maximum_depth_of_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Tree
105 | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/) | [Java](./Trees/construct_binary_tree_from_preorder_and_inorder.java) | _O(n)_ | _O(n)_ | Medium || DFS, HashMap
107 | [Binary Tree Level Order Traversal II](https://leetcode.com/problems/binary-tree-level-order-traversal-ii/description/) | [Java](./Trees/binary_tree_level_order_traversal_ii.java) | _O(n)_ | _O(n)_ | Medium || Tree, Breadth-First Search
110 | [Balanced Binary Tree](https://leetcode.com/problems/balanced-binary-tree/description/) | [Java](./Trees/balanced_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Depth-First Search
111 | [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/description/) | [Java](./Trees/minimum_depth_of_binary_tree.java) | _O(n)_ | _O(n)_ | Easy || Breadth-First Search
112 | [Path Sum](https://leetcode.com/problems/path-sum/description/) | [Java](./Trees/path_sum.java) | _O(n)_ | _O(n)_ | Easy || Depth-First Search
113 | [Path Sum II](https://leetcode.com/problems/path-sum-ii/description/) | [Java](./Trees/path_sum_ii.java) | _O(n^2)_ | _O(n * log n)_ | Medium || Depth-First Search
116 | [Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/description/) | [Java](./Trees/populating_next_right_pointers_in_each_node.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
117 | [Populating Next Right Pointers in Each Node II](https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/description/) | [Java](./Trees/populating_next_right_pointers_in_each_node_ii.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
124 | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum/description/) | [Java](./Trees/binary_tree_max_path_sum.java) | _O(n)_ | _O(n)_ | Hard || Depth-First Search
129 | [Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/description/) | [Java](./Trees/sum_root_to_leaf_numbers.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
199 | [Binary Tree Right Side View](https://leetcode.com/problems/binary-tree-right-side-view/description/) | [Java](./Trees/binary_tree_right_side_view.java) | _O(n)_ | _O(n)_ | Medium || Breadth-First Search
226 | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/description/) | [Java](./Trees/invert_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Tree
230 | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/) | [Java](./Trees/kth_smallest_element_in_a_bst.java) | _O(n * log k)_ | _O(n * k)_ | Medium || Breadth-First Search, Kth
235 | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/) | [Java](./Trees/lowest_common_ancestor_of_a_bst.java) | _O(log n)_ | _O(n)_ | Medium || Tree
426 | [Convert Binary Search Tree to Sorted Doubly Linked List](https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/description/) | [Java](./Trees/convert_bst_to_sorted_ddl.java) | _O(n)_ | _O(n)_ | Medium || Inorder Depth-First Search 
437 | [Path Sum III](https://leetcode.com/problems/path-sum-iii/description/) | [Java](./Trees/path_sum_iii.java) | _O(n)_ | _O(n)_ | Medium || Depth-First Search
543 | [Diameter of Binary Tree](https://leetcode.com/problems/diameter-of-binary-tree/description/) | [Java](./Trees/diameter_of_binary_tree.java) | _O(n)_ | _O(h)_ | Easy || Binary Tree. Depth-First Search
572 | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree/description/) | [Java](./Trees/subtree_of_another_tree.java) | _O(n * m)_ | _O(h)_ | Easy || Tree, Depth-First Search
637 | [Average of Levels in Binary Tree](https://leetcode.com/problems/average-of-levels-in-binary-tree/description/) | [Java](./Trees/average_of_levels_in_binary_tree.java) | _O(n)_ | _O(n)_ | Easy || Tree, Breadth-First Search
938 | [Range Sum of BST](https://leetcode.com/problems/range-sum-of-bst/description/) | [Java](./Trees/range_sum_of_bst.java) | _O(n)_ | _O(n)_ | Easy || Tree, Breadth-First Search
1448 | [Count Good Nodes In Binary Tree](https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/) | [Java](./Trees/count_good_nodes_in_binary_tree.java) | _O(n)_ | _O(h)_ | Medium || Tree, Preorder Depth-First Search
1650 | [Lowest Common Ancestor of a Binary Tree III](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iii/description/) | [Java](./Trees/lowest_common_ancestor_of_a_binary_tree_iii.java) | _O(n)_ | _O(1)_ | Medium || Tree, Two Pointers

## Heaps and Priority Queue
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
23 | [Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/description/) | [Java](./Heaps_PQ/merge_k_sorted_lists.java) | _O(n log k)_ | _O(k)_ | Hard || Min-Heap
215 | [Kth Largest Element In An Array](https://leetcode.com/problems/kth-largest-element-in-an-array/description/) | [Java](./Heaps_PQ/kth_largest_element_in_an_array.java) | _O(n log k)_ | _O(k)_ | Medium || Arrays, Min-Heap
295 | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/description/) | [Java](./Heaps_PQ/find_median_from_data_stream.java) | _O(log n)_ | _O(n)_ | Hard || Two-Heaps
355 | [Design Twitter](https://leetcode.com/problems/design-twitter/description/) | [Java](./Heaps_PQ/design_twitter.java) | _O(n + m log m)_ | _O(n)_ | Medium || OO-Design, Max-Heap
373 | [Find K Pairs with Smallest Sums](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/description/) | [Java](./Heaps_PQ/find_k_pairs_with_smallest_sums.java) | _O(k log k)_ | _O(k)_ | Medium || Min-Heap
451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/description/) | [Java](./Heaps_PQ/sort_characters_by_frequency.java) | _O(n log n)_ | _O(n)_ | Medium || Max-Heaps
502 | [IPO](https://leetcode.com/problems/ipo/description/) | [Java](./Heaps_PQ/IPO.java) | _O(n log n)_ | _O(n)_ | Hard || Two-Heaps
621 | [Task Scheduler](https://leetcode.com/problems/task-scheduler/description/) | [Java](./Heaps_PQ/task_scheduler.java) | _O(n log n)_ | _O(n)_ | Medium || Max-Heap
632 | [Smallest Range Covering Elements of K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/description/) | [Java](./Heaps_PQ/smallest_range_covering_elements_of_k_lists.java) | _O(n log k)_ | _O(k)_ | Hard || Min-Heap
703 | [Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/description/) | [Java](./Heaps_PQ/kth_largest_element_in_a_stream.java) | _O(n log n)_ | _O(k)_ | Easy || Min-Heap
767 | [Reorganize String](https://leetcode.com/problems/reorganize-string/description/) | [Java](./Heaps_PQ/reorganize_string.java) | _O(n log n)_ | _O(n)_ | Medium || Max-Heap
973 | [K Closest Points to Origin](https://leetcode.com/problems/k-closest-points-to-origin/description/) | [Java](./Heaps_PQ/k_closest_points_to_origin.java) | _O(n log k)_ | _O(k)_ | Medium || Max-Heap
1046 | [Last Stone Weight](https://leetcode.com/problems/last-stone-weight/description/) | [Java](./Heaps_PQ/last_stone_weight.java) | _O(n log n)_ | _O(n)_ | Easy || Max-Heap
1481 | [Least Number of Unique Integers after K Removals](https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/description/) | [Java](./Heaps_PQ/least_number_of_unique_integers_after_k_removals.java) | _O(n + k log n)_ | _O(n)_ | Medium || Min-Heap

## Math and Bit Manipulation
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
7 | [Reverse Integer](https://leetcode.com/problems/find-median-from-data-stream/description/) | [Java](./Math/reverse_integer.java) | _O(n)_ | _O(1)_ | Medium || Math
9 | [Palindrome Number](https://leetcode.com/problems/palindrome-number/description/) | [Java](./Math/palindrome_number.java) | _O(log n)_ | _O(1)_ | Medium || Math
29 | [Divide Two Integers](https://leetcode.com/problems/divide-two-integers/description/) | [Java](./Math/divide_two_integers.java) | _O(log D/d)_ | _O(1)_ | Medium || Math
67 | [Add Binary](https://leetcode.com/problems/add-binary/description/) | [Java](./Math/add_binary.java) | _O(n)_ | _O(n)_ | Easy || Char Manipulation
69 | [Sqrt](https://leetcode.com/problems/sqrtx/description/) | [Java](./Math/sqrt.java) | _O(log n)_ | _O(1)_ | Easy || Binary Search
278 | [First Bad Version](https://leetcode.com/problems/first-bad-version/description/) | [Java](./Math/first_bad_version.java) | _O(log n)_ | _O(1)_ | Easy || Binary Search
371 | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers/description/) | [Java](./Math/sum_of_two_integers.java) | _O(n)_ | _O(1)_ | Medium || Math, Bit Manipulation
696 | [Count Binary Substrings](https://leetcode.com/problems/count-binary-substrings/description/) | [Java](./Math/count_binary_substrings.java) | _O(n)_ | _O(1)_ | Medium || Math
1304 | [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/description/) | [Java](./Math/find_n_unique_integers_sum_up_to_zero.java) | _O(n)_ | _O(1)_ | Medium || Math
2235 | [Add Two Integers](https://leetcode.com/problems/add-two-integers/description/) | [Java](./Math/add_two_integers.java) | _O(1)_ | _O(1)_ | Easy || Math, Bit Manipulation
3007 | [Maximum Number That Sum of the Prices Is Less Than or Equal to K](https://leetcode.com/problems/maximum-number-that-sum-of-the-prices-is-less-than-or-equal-to-k/description/) | [Java](./Math/maximum_number_that_sum_of_the_prices.java.java) | _O(log k)_ | _O(log k)_ | Medium || Math, Bit Manipulation, Binary Search

## Dynamic Programming
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
39 | [Combination Sum](https://leetcode.com/problems/combination-sum/description/) | [Java](./DynamicProgramming/combination_sum.java) | _O(2^n)_ | _O(n)_ | Medium || Backtracking, Recursion
70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/description/) | [Java](./DynamicProgramming/climbing_stairs.java) | _O(n)_ | _O(n)_ | Easy || Memoization, Recursion
91 | [Decode Ways](https://leetcode.com/problems/decode-ways/description/) | [Java](./DynamicProgramming/decode_ways.java) | _O(n)_ | _O(n)_ | Medium || Memoization, Recursion
139 | [Word Break](https://leetcode.com/problems/word-break/) | [Java](./DynamicProgramming/word_break.java) | _O(n * m)_ | _O(n)_ | Medium || DP, Iterative
198 | [House Robber](https://leetcode.com/problems/house-robber/description/) | [Java](./DynamicProgramming/house_robber.java) | _O(n)_ | _O(1)_ | Medium || Memoization, Recursion
416 | [Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/description/) | [Java](./DynamicProgramming/partition_equal_subset_sum.java) | _O(n * s)_ | _O(n * s)_ | Medium || Memoization, Bottom-Up
509 | [Fibonacci Number](https://leetcode.com/problems/fibonacci-number/description/) | [Java](./DynamicProgramming/fibonacci_number.java) | _O(n)_ | _O(n)_ | Easy || Memoization, Recursion
746 | [Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/description/) | [Java](./DynamicProgramming/min_cost_climbing_stairs.java) | _O(n)_ | _O(n)_ | Easy || Memoization, Recursion
2998 | [Minimum Number of Operations to Make X and Y Equal](https://leetcode.com/problems/minimum-number-of-operations-to-make-x-and-y-equal/description/) | [Java](./DynamicProgramming/minimum_number_of_operations_to_make_x_and_y_equal.java) | _O(n)_ | _O(n)_ | Medium || Memoization, BFS, Graphs

