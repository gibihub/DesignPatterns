
public class Paragraph implements Element {

	private String title;

	public Paragraph(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print()
	{
		System.out.println("Paragraph: " + this.title);
	}
	
}
