interface Printable {
    void print();
}


public class Papers {
    private String con;

    public Papers(String s) {
        con = s;
    }

    public Printable getPrinter() {
        return new Printer();
    }

    private class Printer implements Printable {
        @Override
        public void print() {
            System.out.println("con = " + con);
        }
    }

}

