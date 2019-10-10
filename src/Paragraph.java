
public class Paragraph {

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

	@Override
	public String toString() {
		return "Paragraph [title=" + title + "]";
	}
	
}
