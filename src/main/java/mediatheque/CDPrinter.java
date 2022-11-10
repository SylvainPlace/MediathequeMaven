package mediatheque;

public class CDPrinter implements ItemVisitor {

    @Override
    public void visit(Book item) {
    }

    @Override
    public void visit(CD item) {
        System.out.println(item);
    }

}

