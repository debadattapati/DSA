// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
         int nums[] = {6, 5, 2, 8, 9, 4};
        int size = nums.length;
        int temp = 0;
        
        int outerLoop=0;
        
                int innerLoop=0;


        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Bubble sort logic
        for (int i = 0; i < size; i++) {

outerLoop++;

           // for (int j = 0; j < size - 1; j++) {
          
          //to save the tikje we can use this it
                            for (int j = 0; j < size-i - 1; j++) {
innerLoop++;

                if (nums[j] > nums[j + 1]) {

                    // swap
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        
        
                    System.out.println(" ");

                System.out.println("loops inner,ouiter:"+innerLoop+" ,"+outerLoop);

        
    }
    
}
