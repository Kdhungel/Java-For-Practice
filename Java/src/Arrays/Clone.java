package Arrays;

public class Clone {
    public static void main(String[] args) {
        int arr[] = {33,3,4,5};
        System.out.println("Original Array: ");
        for(int i : arr){
            System.out.println(i);
        }

        System.out.println("Clonned Array");
        int carr[] = arr.clone();
        for (int i : carr){
            System.out.println(i);
        }

        System.out.println(arr == carr);
    }
}
