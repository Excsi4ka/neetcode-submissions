class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int col = matrix[0].length;
        int end = matrix.length * col - 1;
        int start = 0;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            int num = matrix[mid / col][mid % col];
            if (num == target)
               return true;
            if (num < target)
               start = mid + 1;
             else
                end = mid - 1;

        }
        return false;
    }
}
