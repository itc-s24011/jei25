public class D53Q5kadai {
    public static void main(String[] args) {
        if (args.length % 4 != 0) {
            System.out.println("エラー: 入力フォーマットが正しくありません。");
            return;
        }

        System.out.println("商品名\t税抜\t税込\tタイプ");

        int totalExcludingTax = 0;
        int totalIncludingTax = 0;

        for (int i = 0; i < args.length; i += 4) {
            String productName = args[i + 1];
            int priceWithoutTax = Integer.parseInt(args[i + 2]) * Integer.parseInt(args[i]);
            String type = args[i + 3];

            int priceWithTax = type.equals("f") ? (int) Math.round(priceWithoutTax * 1.08) : (int) Math.round(priceWithoutTax * 1.10);

            totalExcludingTax += priceWithoutTax;
            totalIncludingTax += priceWithTax;

            String typeLabel = type.equals("f") ? "食品等" : "その他";

            System.out.printf("%s\t%d円\t%d円\t%s\n", productName, priceWithoutTax, priceWithTax, typeLabel);
        }

        System.out.printf("合計\t\t%d円\t%d円\n", totalExcludingTax, totalIncludingTax);
    }
}
