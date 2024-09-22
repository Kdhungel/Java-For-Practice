package DataTypes;

public class DataTypeDocs {
    /*
    1. Primitive Data type
        # int, double, long, byte, short, float, boolean, char
        boolean: 1 bit
        char: 2 byte
        byte: 1 byte
        short: 2 byte
        int: 4 byte
        long: 8 byte
        float: 4 byte
        double: 8 byte
       ----------------------------------------------------------
    2.  Non-Primitive Data Type
        # Classes, Interfaces, Arrays

     */
    public static void main(String[] args) {
        int a = 2;

        String name = "Kritish";
        String st = new String("Kritish");
        System.out.println(st.toUpperCase());
        int emojiSmilingHeart = 0x1F60D;
        System.out.println(Character.toString(emojiSmilingHeart));
    }
}
