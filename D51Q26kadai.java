public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1; // 判定に使用する数値
        String result = "";

        switch (n) {
            case 1: // n が 1 の場合
                result = "one";
                break; // これがないと次の case に処理が移る（fall-through）
            case 2: // n が 2 の場合
                result = "two";
                break; // これがないと次の case に処理が移る
            default: // どの case にも該当しない場合
                result = "unknown";
                break; // これがなくても構わないが、一貫性のために入れておく
        }

        System.out.println(result); // "one" と出力される
    }
}
