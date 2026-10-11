class Solution {
    public int[] replaceElements(int[] arr) { 
        int max = 0;
        int[] array = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
                array[i] = max;
            }
            max = 0;
        }
         array[arr.length-1] = -1;
         return array;
    }
}