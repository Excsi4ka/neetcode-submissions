class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rowLength = matrix[0].length;
        int totalLength = matrix.length * rowLength;
        return binarySearch(matrix, target, 0, totalLength - 1, rowLength);
    }

    public boolean binarySearch(int[][] matrix, int target, int start, int end, int len) {
        int middle = start + (end - start) / 2;
        int num = matrix[middle / len][middle % len];
        if (num == target)
            return true;
        if (start == end)
            return false;
        if (num < target)
            return binarySearch(matrix, target, middle + 1, end, len);
        else
            return binarySearch(matrix, target, start, middle, len);
    }
}
