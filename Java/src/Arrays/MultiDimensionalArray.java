package Arrays;
/*
/*
 Syntax:
 dataType[][] arr;
 dataType [][]arr;
 dataType arr[][];

arrayRefType = new dataType[size][size]
  */

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        // row (outer loop)
        for(int i = 0; i < 3; i++){
            // column (inner loop)
            for(int j = 0; j < 3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
