public class MemberClass {
    private int num = 0;

    /*
    * 멤버 클래스에서 Outer인스턴스 변수를 접근할 수 있다.
    * Outer 클래스에 종속적이다.
    * */
    class Member { // 멤버 클래스 정의
        void add(int n) {
            num += n;
        }

        int get() {
            return num;
        }
    }

    class MemberInner {
        public static void main(String[] args) {
            MemberClass o1 = new MemberClass();
            MemberClass o2 = new MemberClass();

            // o1 기반으로 두 인스턴스 생성
            MemberClass.Member o1m1 = o1.new Member();
            MemberClass.Member o1m2 = o1.new Member();

            // o2 기반으로 두 인스턴스 생성
            MemberClass.Member o2m1 = o1.new Member();
            MemberClass.Member o2m2 = o1.new Member();

            // o1 기반으로 생성된 두 인스턴스의 메소드 호출
            o1m1.add(5);
            System.out.println(o1m2.get());

            // o2 기반으로 생성된 두 인스턴스의 메소드 호출
            o2m1.add(7);
            System.out.println(o2m2.get());

        }
    }
}
