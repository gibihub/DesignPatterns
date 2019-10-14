import java.util.Vector;

public class SubChapter {

	private String title;
//	private Vector <Paragraph> pghVec = new Vector <>();
//	private Vector <Image> imgVec = new Vector <>();
//	private Vector <Table> tableVec = new Vector <>();
	private Vector <Element> elemVec = new Vector <>();
	
	
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

	public void print()
	{
		System.out.println("SubChapter title: " + this.title);
		
//		for(Paragraph itp : pghVec)
//		{
//			itp.print();
//		}
//		
//		for(Image iti : imgVec)
//		{
//			iti.print();
//		}
//		
//		for(Table itT : tableVec)
//		{
//			itT.print();
//		}
		
		for(Element itE : elemVec)
		{
			itE.print();
		}
		
	}
	
	public int createParagraph(String pghName)
	{
		Paragraph pghp = new Paragraph(pghName);
		elemVec.add(pghp);
		return elemVec.indexOf(pghp);
	}
	
	public int createImage(String imgName)
	{
		Image img = new Image(imgName);
		elemVec.add(img);
		return elemVec.indexOf(img);
	}
	
	public int createTable(String tableName)
	{
		Table tbl = new Table(tableName);
		elemVec.add(tbl);
		return elemVec.indexOf(tbl);
	}
	
	
}
