public class Outer {
    private static int num = 0; // 이 static 변수는 Outer로 Nested1, Nested2 클래스끼리만 공유하겠다는 의미로 사용한다.

    static class Netsted1 { // Static 네스티드 클래스
        void add(int n) {
            num += n;
        }
    }

    static class Netsted2 { // Static 네스티드 클래스
        int get() {
            return num;
        }
    }
}

class StaticNested {
    public static void main(String[] args) {
        Outer.Netsted1 netsted1 = new Outer.Netsted1();
        netsted1.add(5);
        Outer.Netsted2 netsted2 = new Outer.Netsted2();
        System.out.println(netsted2.get());
    }
}
