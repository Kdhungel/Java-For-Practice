package Arrays;

public class Copy {
    public static void main(String[] args) {
        char[] copyFrom = {'a', 'e','i','o','u'};

        char[] copyTo = new char[3];

        System.arraycopy(copyFrom,0, copyTo, 0,3);
        System.out.println(String.valueOf((copyTo)));
    }
}
