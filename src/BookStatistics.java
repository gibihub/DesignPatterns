
public class BookStatistics implements Visitor {

	private int imgC ;
	private int imgP_C;
	private int pghC ;
	private int tbC;
	public BookStatistics() {
		super();
		this.imgC = 0;
		this.imgP_C = 0;
		this.pghC = 0;
		this.tbC = 0;
	}

	@Override
	public void visit(Image img) {
this.imgC ++;
		
	}

	@Override
	public void visit(ImageProxy imgproxy) {
		// TODO Auto-generated method stub
		this.imgC ++;
	}

	@Override
	public void visit(Paragraph pgh) {
		// TODO Auto-generated method stub
		this.pghC ++;
		
	}

	@Override
	public void visit(Table tb) {
		// TODO Auto-generated method stub
		this.tbC++;
	}
	
	public void printStatistics()
	{
		System.out.println("Nr img: " + this.imgC );
		System.out.println("NrPgh: "+ this.pghC);
		System.out.println("NrTbl: "+this.tbC);
	}

	
	
}
