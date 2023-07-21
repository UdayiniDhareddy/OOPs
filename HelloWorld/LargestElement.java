public class LargestElement {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 4, 5, 6, 7, 2, 5, 3, 7, 8};
        int largest = 0;
        for(int i=0;i<array.length;i++){
            if (array[i] > largest){
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}
