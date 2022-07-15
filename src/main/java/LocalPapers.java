


public class LocalPapers {
    private String con;

    public LocalPapers(String s) {
        con = s;
    }

    public Printable getPrinter() {
        /*
        * 인터페이스의 구현 결과 하나밖에 없다.
        * */
        class Printer implements Printable {
            @Override
            public void print() {
                System.out.println("con = " + con);
            }
        }
        /*
        * return new Printable(); 추상 메서드이기 때문에 인스턴스 생성이 안된다.
        * print라는 메서드를 구현해야 한다. 그것을 한번에 처리한다.
        * */
//        return new Printer();

        /*
        * Printable 인터페이스를 구현한 인스턴스를 return
        * 이름이 없는 익명 클래스!
         * */
        return new Printable() {
            @Override
            public void print() {
                System.out.println("con = " + con);
            }
        };

    }

    public static void main(String[] args) {
        Papers papers = new Papers("서류 내용 : 행복합니다.");
        Printable printable = papers.getPrinter();
        printable.print();
    }



}

