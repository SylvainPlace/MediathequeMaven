package mediatheque;

public interface MediathequeVisitor {
    public void visit(CD item);
    public void visit(Book item);
    
}
