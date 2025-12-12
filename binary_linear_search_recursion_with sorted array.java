// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
     int nums[] = {5, 7, 9, 11, 13};
    
        // int nums[] = new int[10000];

        int target = 13;

        //int result = linearSearch(nums, target);
                int result = binarySearchRecursion(nums, target,0,nums.length-1);

                int result2 = binarySearch(nums, target);


if (result != -1)
    System.out.println("Element found at Index : " + result);
else
    System.out.println("Element not found");
    }


public static int linearSearch(int[] nums, int target) {
    int steps = 0;

    for (int i = 0; i < nums.length; i++) {
        steps++;

        if (nums[i] == target) {
            System.out.println("Element found, steps linear: " + steps);
            return i;
        }
    }

    System.out.println("Element not found, total steps linear: " + steps);
    return -1;
}

    
    
    public static int binarySearch(int[] nums, int target) {

    // 5, 7, 9, 11, 13
    int steps=0;
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
     steps++;
        int mid = (left + right) / 2;

        if (nums[mid] == target) {
              System.out.println("Element not found, total steps binary: " + steps);
            return mid;
        }
        else if (nums[mid] < target) {
            left = mid + 1;
        }
        else {
            right = mid - 1;
        }
    }
 System.out.println("Element not found, total steps binary: " + steps);
    return -1;
}

public static int binarySearchRecursion(int[] nums, int target, int left, int right) {

    // Base condition
    if (left > right) {
        return -1;
    }

    int mid = (left + right) / 2;

    if (nums[mid] == target) {
        return mid;
    }
    else if (nums[mid] < target) {
        return binarySearchRecursion(nums, target, mid + 1, right);
    }
    else {
        return binarySearchRecursion(nums, target, left, mid - 1);
    }
}


}
