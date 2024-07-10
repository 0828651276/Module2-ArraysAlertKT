
public class Say {
    public static int countX(String str, char x) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "so lan xuat hien la: ";
        char x = 'o';
        int count = countX(str, x);
        System.out.println("Số lần x xuất hiện trong chuỗi: " + count);

    }
}