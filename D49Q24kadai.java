public class D49Q24kadai {
    public static void main(String[] args) {
        int values[] = {10, 20, 30, 40}; // 配列の定義
        int sum = 0;

        // 配列の要素を合計する
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }

        // 合計数と要素数を出力する
        System.out.println("合計数: " + sum);
        System.out.println("要素数: " + values.length);
    }
}