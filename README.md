# [LeetCode Solutions in Java](https://leetcode.com/problemset/all/)

* [My LeetCode Profile](https://leetcode.com/JSDWRLD/)
* This is a repository filed with my LeetCode solutions along with its time complexity and space complexity.
* Repository does not include premium leetcode questions.

## Data Structures
* [Array](https://github.com/JSDWRLD/LeetCode-Solutions-Java#array)
* [HashMap](https://github.com/JSDWRLD/LeetCode-Solutions-Java#hashmap)
* [String](https://github.com/JSDWRLD/LeetCode-Solutions-Java#string)
* [Linked List](https://github.com/JSDWRLD/LeetCode-Solutions-Java#linkedlist)
* [Stack](https://github.com/JSDWRLD/LeetCode-Solutions-Java#stack)
* [Dynamic Programming](https://github.com/JSDWRLD/LeetCode-Solutions-Java#dynamicprogramming)


## Array
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/description/) | [Java](./Arrays/container_with_most_water.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointer, Greedy
66 | [Plus One](https://leetcode.com/problems/plus-one/description/) | [Java](./Arrays/plus_one.java) | _O(n)_ | _O(1)_ | Easy || Arrays
88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/) | [Java](./Arrays/Merge_Sorted_Array.java) | _O(n)_ | _O(1)_ | Easy || Arrays
128 | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/) | [Java](./Arrays/longest_consecutive_sequence.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Set
167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/) | [Java](./Arrays/two_sum_ii_input_array_is_sorted.java) | _O(n)_ | _O(1)_ | Medium || Arrays, Two Pointer, Binary Search
347 | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/description/) | [Java](./Arrays/top_k_frequent_elements.java) | _O(n + k)_ | _O(n + k)_ | Medium || Bucket Sort, Arrays, HashMap/Table
238 | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/) | [Java](./Arrays/product_of_array_except_self.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Prefix Sum
643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/description/) | [Java](./Arrays/maximum_average_subarray_i.java) | _O(n)_ | _O(1)_ | Easy || Sliding Window, Arrays
704 | [Binary Search](https://leetcode.com/problems/binary-search/description/) | [Java](./Arrays/binary_search.java) | _O(log n)_ | _O(1)_ | Easy || Arrays, Binary Search
974 | [Subarray Sums Divisible by K](https://leetcode.com/problems/subarray-sums-divisible-by-k/description/) | [Java](./Arrays/subarray_sums_divisible_by_k.java) | _O(n)_ | _O(n)_ | Medium || Arrays, Prefix Sum, HashMap

## HashMap
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
1 | [Two Sum](https://leetcode.com/problems/two-sum/description/) | [Java](./Maps/two_sum.java) | _O(n)_ | _O(n)_ | Easy || HashMap
49 | [Group Anagrams](https://leetcode.com/problems/group-anagrams/description/) | [Java](./Maps/group_anagrams.java) | _O(n * k log k)_ | _O(n)_ | Medium || HashMap, ArrayList
242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/) | [Java](./Maps/valid_anagram.java) | _O(log n)_ | _O(n + m)_ | Easy || HashMap

## String
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
14 | [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/) | [Java](./Strings/longest_common_prefix.java) | _O(n * log(n))_ | _O(1)_ | Easy || Strings
28 | [Find the Index of the First Occurrence in a String](https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/) | [Java](./Strings/find_index_first_occurrence_string.java) | _O(n)_ | _O(1)_ | Easy || Strings
58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/description/) | [Java](./Strings/length_of_last_word.java) | _O(n)_ | _O(1)_ | Easy || Strings
125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/description/) | [Java](./Strings/valid_palindrome.java) | _O(n)_ | _O(1)_ | Easy || Strings, Two Pointer

## LinkedList
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/) | [Java](./LinkedLists/remove_nth_node_from_end_of_list.java) | _O(n)_ | _O(1)_ | Medium || ListNode, Singly Linked List
83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/) | [Java](./LinkedLists/remove_duplicates_from_sorted_list.java) | _O(n)_ | _O(1)_ | Easy || ListNode, Singly Linked List
206 | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/description/) | [Java](./LinkedLists/reverse_linked_list.java) | _O(n)_ | _O(1)_ | Easy || ListNode, Singly Linked List

## Stack
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
20 | [Valid Parenthesis](https://leetcode.com/problems/valid-parentheses/description/) | [Java](./Stacks/valid_parentheses.java) | _O(n)_ | _O(1)_ | Easy || Stacks
155 | [Min Stack](https://leetcode.com/problems/min-stack/description/) | [Java](./Stacks/min_stack.java) | _O(1)_ | _O(n)_ | Medium | Design | Stacks

## DynamicProgramming
|  #  | Title           |  Solution       |  Time           | Space           | Difficulty    | Tag          | Note| 
|-----|---------------- | --------------- | --------------- | --------------- | ------------- |--------------|-----|
70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/description/) | [Java](./DynamicProgramming/climbing_stairs.java) | _O(n)_ | _O(n)_ | Easy || Memoization
