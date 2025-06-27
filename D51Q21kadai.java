public class D51Q21kadai {
    public static void main(String[] args) {
        // 10進数 (Decimal)
        int decimalValue = 10; // 通常の10進数

        // 8進数 (Octal) - 頭に0を付ける
        int octalValue = 012; // 8進数の12は10進数の10と同じ値

        // 16進数 (Hexadecimal) - 頭に0xを付ける
        int hexValue = 0xA; // 16進数のAは10進数の10と同じ値

        // 計算処理：10進数、8進数、16進数をすべて加算
        int total = decimalValue + octalValue + hexValue;

        // 計算結果を表示
        System.out.println("合計 (10進数で表示): " + total);
    }
}