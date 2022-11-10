package mediatheque;

public class BookPrinter implements MediathequeVisitor {


    @Override
    public void visit(Book item) {
        System.out.println(item);
    }

    @Override
    public void visit(CD item) {
    }


}

