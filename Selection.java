
public class Selection {

    public static void main(String[] arg) {
        int arr[] = {33, 66, 5, 544, 454, 4, 5};
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            int min_indx = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[min_indx] > arr[j]) {
                    min_indx = j;
                }
            }
            int temp = arr[min_indx];
            arr[min_indx] = arr[i];
            arr[i] = temp;
        }
        for(int i=0; i<length; i++){
            System.err.println(arr[i]+" ");
        }
    }
}
