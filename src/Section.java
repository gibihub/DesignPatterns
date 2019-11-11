import java.util.Vector;


public class Section implements Element {

	private String sectionTitle;
	private Vector<Element> elVec = new Vector<>();
	public Section(String sectionTitle, Vector<Element> elVec) {
		super();
		this.sectionTitle = sectionTitle;
		this.elVec = elVec;
	}
	public String getSectionTitle() {
		return sectionTitle;
	}
	public void setSectionTitle(String sectionTitle) {
		this.sectionTitle = sectionTitle;
	}
	public Vector<Element> getElVec() {
		return elVec;
	}
	public void setElVec(Vector<Element> elVec) {
		this.elVec = elVec;
	}
	public Section(String sectionTitle) {
		super();
		this.sectionTitle = sectionTitle;
	}
	
	public int add(Element x)
	{	
		elVec.add(x);
		return elVec.indexOf(x);
	}
	
	public void remove(Element x)
	{
		elVec.remove(x);
	}
	
	public Element getElement(int x)
	{
		return elVec.get(x);
	}
	
	public void print()
	{
		System.out.println("SectionTitle: "+this.sectionTitle);
		System.out.println();
		
		for(Element e : elVec)
		{
			e.print();
		}
	}
	@Override
	public void accept(Visitor visitor) {
		for(Element e : elVec)
		{
			e.accept(visitor);
			}
		visitor.visit(this);
		}
		
	
	
}
