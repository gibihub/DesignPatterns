
public class Table {

	private String title;

	public Table(String title) {
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
		return "Table [title=" + title + "]";
	}
	
}
