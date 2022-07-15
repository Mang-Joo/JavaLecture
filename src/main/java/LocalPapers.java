


public class LocalPapers {
    private String con;

    public LocalPapers(String s) {
        con = s;
    }

    public Printable getPrinter() {
        class Printer implements Printable {
            @Override
            public void print() {
                System.out.println("con = " + con);
            }
        }
        return new Printer();
    }

    public static void main(String[] args) {
        Papers papers = new Papers("서류 내용 : 행복합니다.");
        Printable printable = papers.getPrinter();
        printable.print();
    }



}

