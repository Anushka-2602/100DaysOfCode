class Solution {

    int missingNumber(int array[], int n) {

        

        Arrays.sort(array);

        int i;

        for (i = 1; i <= array.length; i++) {

            if (array[i-1] != i) break;

        }

        return i;

    }

}
