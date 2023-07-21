import java.util.Arrays;
public class Duplicate {
    public static void main(String[] args){
         int[] array = new int[]{1, 2, 1, 4, 5, 6, 7,  2, 5, 3, 7, 8, 9};
        Integer[] duplicate = new Integer[10];
        int counter = 0;
        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if(i!=j && array[i]==array[j]){
                duplicate[counter]= array[j];
                    counter++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(duplicate));
    }
}
