
public class Image extends Element {

	private String title;

	public Image(String title) {
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
		System.out.println("ImageName: "+ this.title);
	}
	
}
