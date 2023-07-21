import java.util.Arrays;
public class AcsendingOrder {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 1, 4, 5, 6, 7, 2, 5, 3, 7, 8, 9};
        int temp=0;
        int temp2=0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]<=array[j]){
                    temp=array[i];
                    temp2 = array[j];
                    array[i] = temp;
                    array[j]=temp2;
                }
                if(array[i]>array[j]){
                    temp= array[i];
                    array[i] = array[j];
                    array[j]=temp;
                }
            }
        } System.out.println(Arrays.toString(array));
    }
}
