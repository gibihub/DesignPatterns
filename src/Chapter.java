import java.util.Vector;

public class Chapter {

	private String title;
	private Vector <SubChapter> subchVec = new Vector <>();
	
	public Chapter(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	public int createSubChapter(String subchName)
	{
		SubChapter subChp = new SubChapter(subchName);
		subchVec.add(subChp);
		return subchVec.indexOf(subChp);
	}
	
	public SubChapter getSubChapter(int indexOfSubChapter)
	{
		return subchVec.get(indexOfSubChapter);
	}
	
	public void print()
	{
		System.out.println("Chapter title: " + this.title);
		
		for(SubChapter it : subchVec)
		{
			System.out.println("Subch: " + it + " " );
		}
	}
	
}
