 class OccurrenceCounter {

    static int numberOfOccurrences(int[] array, int x) {
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int count = 0;
        for (int num : array) {
            if (num == x) {
                count++;
            }
        }
        if (count == 0) // If count is zero, target element not found
            return -1;
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 7, 7, 8};
        int target = 7;
        int occurrences = numberOfOccurrences(array, target);
        System.out.println("Number of occurrences of " + target + " in the array: " + occurrences);
    }
}
