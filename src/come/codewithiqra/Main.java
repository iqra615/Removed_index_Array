package come.codewithiqra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int array[] = {3,2,4,5,6,7,8,9};
        System.out.println("Ordered Array:" + Arrays.toString(array));
        int RemoveIndex= 1;


        for (int i =RemoveIndex; i< array.length-1; i++)
        {
            array[i]=array[i+1];


        }
        System.out.println("After removing index: "+ Arrays.toString(array));
    }

}
