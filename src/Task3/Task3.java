package Task3;

public class Task3 {
    public static void main(final String[] args) {
        final char[] arrChar = {'c','h','e','e','p'};
        final int[] arrInt = {4,6,8,2,0};
        String arrString  = "";
        for(int i=0;i< Math.max(arrInt.length,arrChar.length);i++) {
            if (i < arrInt.length) {
                arrString += arrInt[i];
            }
            if (i<arrChar.length) {
                arrString += arrChar[i];
            }
        }
        System.out.println(arrString);
    }
}
