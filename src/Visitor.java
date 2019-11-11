
public interface Visitor {

	public void visit(Image img);
	public void visit(ImageProxy imgproxy);
	public void visit(Paragraph pgh);
	public void visit(Table tb);
	
}
