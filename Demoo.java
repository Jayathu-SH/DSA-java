public class Demoo {
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 6, 8, 9, 11, 34, 67, 99};
        int target = 67;

        int result1 = linearSearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length - 1, 0); // start steps from 0

        if (result1 != -1) {
            System.out.println("Element found at index (linear search): " + result1);
        } else {
            System.out.println("Element not found in linear search");
        }

        if (result2 != -1) {
            System.out.println("Element found at index (binary search): " + result2);
        } else {
            System.out.println("Element not found in binary search");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;

        for (int i = 0; i < nums.length; i++) {
            steps++;
            if (nums[i] == target) {
                System.out.println("Steps taken by linear search: " + steps);
                return i;
            }
        }

        // System.out.println("Steps taken by linear search: " + steps);
        return -1;
    }

    // Overloaded binarySearch to track steps
    public static int binarySearch(int[] nums, int target, int left, int right, int steps) {
        if (left <= right) {
            steps++;
            int mid = (left + right) / 2;

            if (nums[mid] == target) {
                System.out.println("Steps taken by binary search: " + steps);
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, target, mid + 1, right, steps);
            } else {
                return binarySearch(nums, target, left, mid - 1, steps);
            }
        }

        System.out.println("Steps taken by binary search: " + steps);
        return -1;
    }
}
