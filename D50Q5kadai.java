public class D50Q5kadai {
    public static void main(String[] args) {
        // 初期データを配列に格納
        int[] data = {5, 4, 3, 2, 1};

        // ソート前のデータを表示
        System.out.println("ソート前: " + arrayToString(data));

        // バブルソートを実行
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    // 要素を入れ替える
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                    // ソート途中のデータを表示
                    System.out.println("ソート途中: " + arrayToString(data));
                }
            }
        }

        // ソート結果を表示
        System.out.println("-------------------");
        System.out.println("ソート結果: " + arrayToString(data));
    }

    // 配列を文字列に変換するメソッド
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int num : array) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }
}
