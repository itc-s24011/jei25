public class D53Q27kadai {
    public static void main(String[] args) {
        System.out.println(Ramen.MISO);
    }
}
enum Ramen {
    SYOUYU("醤油",690),TONKOTU("豚骨",-680),SIO("塩",690),MISO("味噌",680);
    private String japaneseName;
    int price;
    Ramen(String japaneseName,int price) {
        this.japaneseName = japaneseName;
        if(price >= 0) {
            this.price = price;
        } else {
            this.price = -1 * price;
        }
    }
    public String toString() {
        return japaneseName + ":" + price + "円";
    }
}