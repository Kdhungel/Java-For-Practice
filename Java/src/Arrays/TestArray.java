package Arrays;

/*
 Syntax:
 dataType[] arr;
 dataType []arr;
 dataType arr[];

arrayRefType = new dataType[size]
  */
public class TestArray {

   public static void main(String[] args) {
       int[] a = new int[5];
       // indexing -> 5 --(index)--> {0,1,2,3,4}
       a[0] = 10;
       a[1] = 20;
       a[2] = 30;
       a[3] = 40;
       a[4] = 50;
       /*
       a[i] -> 0,1,2,3,4 (i++)
       a[i] = j (j+=10)
        */
//       System.out.println(a[0]);
//       System.out.println(a[1]);
//       System.out.println(a[2]);
//       System.out.println(a[3]);
//       System.out.println(a[4]);
       for(int i = 0; i < a.length;i++){
           System.out.println(a[i]);
       }
   }
}
