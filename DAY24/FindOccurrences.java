public class FindOccurrences {

    public static int findOccurrences(int[] arr, int key, int index, int[] indices, int pos) {
        if (index == arr.length) {
            return pos;
        }
        if (arr[index] == key) {
            indices[pos] = index;
            pos++;
        }
        return findOccurrences(arr, key, index + 1, indices, pos);
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};
        int key = 2;
        int[] result = new int[arr.length];
        int count = findOccurrences(arr, key, 0, result, 0);
        
        for (int i = 0; i < count; i++) {
            System.out.print(result[i] + " ");
        }
    }

}
