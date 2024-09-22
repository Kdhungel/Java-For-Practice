package Arrays;

import jdk.jshell.EvalException;

public class Test1 {
    public static void main(String[] args) {
// () -> parenthesis, [] -> square brackets, {} -> curly braces
        int a[] = {33,3,4,5};
//        for(int i = 0; i < a.length; i++){
//            System.out.print(a[i]+ " ");
//        }
        for (int value:a){
            System.out.println(value);
        }

    }
}
