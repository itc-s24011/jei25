public class D53Q25kadai {
    public static void main(String[] args) {
        // char配列からStringを生成
        char[] ch = {'A', 'B', 'C'};
        // 文字列リテラルからStringを生成
        String s1 = new String("ABC"); // 明示的にnewを使用
        String s2 = new String(ch);    // char配列からStringを生成

        // .equalsメソッドを使用して内容の比較を行う
        boolean b1 = s1.equals(s2); // 内容が同じならtrue（"ABC" == "ABC"）
        boolean b2 = s1.equals(s1); // 同じオブジェクト同士の比較なのでtrue

        // 結果を表示
        System.out.println(b1 + " " + b2);

        /*
         * 修正ポイント：
         * - String比較に == を使わず、内容を比較する .equals メソッドを使用した。
         *   == ではオブジェクトの参照が同じかを比較してしまうため、意図通りに動作しないことがある。
         * - コメントを詳しくし、初心者にもわかりやすくした。
         */
    }
}
