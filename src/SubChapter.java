import java.util.Vector;

public class SubChapter {

	private String title;
	private Vector <Paragraph> pghVec = new Vector <>();
	private Vector <Image> imgVec = new Vector <>();
	private Vector <Table> tableVec = new Vector <>();
	
	public SubChapter(String title) {
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
		return "SubChapter [title=" + title + "]";
	}
	
	public int createParagraph(String pghName)
	{
		Paragraph pghp = new Paragraph(pghName);
		pghVec.add(pghp);
		return pghVec.indexOf(pghp);
	}
	
	public int createImage(String imgName)
	{
		Image img = new Image(imgName);
		imgVec.add(img);
		return imgVec.indexOf(img);
	}
	
	public int createTable(String tableName)
	{
		Table tbl = new Table(tableName);
		tableVec.add(tbl);
		return tableVec.indexOf(tbl);
	}
	
	
}
