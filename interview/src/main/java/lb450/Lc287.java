package lb450;

public class Lc287 {

    //https://leetcode.com/problems/find-the-duplicate-number/

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Find the intersection point of the two pointers
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);   // stop before matching number.
        // bcoz before matching number - that number is repeated.

        // Find the entrance to the cycle
        int ptr1 = nums[0];
        int ptr2 = slow;
        while (ptr1 != ptr2) { // now if both the numbers are same , then they will both go to start of circle.
            ptr1 = nums[ptr1];
            ptr2 = nums[ptr2];
        }
// return the number just before starting of circle.
        return ptr1;
    }
}
/*
This solution uses Floyd's Tortoise and Hare algorithm to detect the cycle in the array.
The fast pointer moves twice as fast as the slow pointer, and when they meet,
it indicates the presence of a cycle.

After finding the intersection point, we reset one of the pointers to the beginning of
the array and move both pointers at the same speed until they meet again. The point of
intersection is the entrance to the cycle, which corresponds to the repeated number.

Please note that this solution assumes there is only one repeated number in the array
 and the array is guaranteed to have a cycle.
 */