package mediatheque;

public class CDPrinter implements MediathequeVisitor {

    @Override
    public void visit(Book item) {
    }

    @Override
    public void visit(CD item) {
        System.out.println(item);
    }

}

