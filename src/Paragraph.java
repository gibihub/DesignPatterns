
public class Paragraph implements Element {

	private String title;
	private String text;
	AlignStrategy align;
	

	public Paragraph(String title, String text) {
		super();
		this.title = title;
		this.text = text;
	}

	public Paragraph(String title) {
		super();
		this.title = title;
	}
	
	public void setAlignStrategy(AlignStrategy align)
	{
		this.align=align;
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print()
	{
		System.out.print("Paragraph: " + this.title);
		if(this.align!=null)
		{
			align.print(this.title);
		}
		else
		{
			System.out.println(this.title);
		}
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}
	
}
