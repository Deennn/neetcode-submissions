class Solution {
    public int[] replaceElements(int[] arr) { 
        int max = 0;
        int[] array = new int[arr.length];
        array[arr.length-1] = -1;
        for (int i = arr.length - 1; i > 0; i--) {
            max = Math.max(array[i], arr[i]);
            array[i-1] = max;
        }
        
         return array;
    }
}