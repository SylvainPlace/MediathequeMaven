package mediatheque;

public interface ItemVisitor {
    public void visit(CD item);
    public void visit(Book item);
}
