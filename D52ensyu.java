public class D52ensyu {
    public static void main(String[] args) {
        Animal tama = new Cat("たま");      // Catクラスのインスタンス
        Animal ao = new Horse("青");       // Horseクラスのインスタンス
        Animal generic = new Animal("一般的な動物"); // Animalクラスのインスタンス

        tama.bark();   // たま：「にゃーん」
        ao.bark();     // 青：「ひひーん」
        generic.bark(); // 一般的な動物：「動物の鳴き声」
    }
}

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void bark() {
        System.out.println(name + "：「動物の鳴き声」");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName() + "：「にゃーん」");
    }
}

class Horse extends Animal {
    public Horse(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName() + "：「ひひーん」");
    }
}