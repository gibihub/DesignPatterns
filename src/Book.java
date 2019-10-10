import java.util.Vector;

public class Book {

	private String title;
	private Vector<Chapter> chVec = new Vector<>();
	private Vector<Authors> authVec = new Vector<>();
	public Book(String title) {
		
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Vector<Chapter> getChVec() {
		return chVec;
	}

	public void setChVec(Vector<Chapter> chVec) {
		this.chVec = chVec;
	}
	
	public int createChapter(String chapterName)
	{
		Chapter chp = new Chapter(chapterName);
		chVec.add(chp);
		return chVec.indexOf(chp);
	}
	
	public int createAuthor (String authName)
	{
		Authors auth = new Authors(authName);
		authVec.add(auth);
		return authVec.indexOf(auth);
	}
	
	public void addAuthor(Authors x)
	{
		authVec.add(x);
	}
	
	public Chapter getChapter(int indexofChapter)
	{	
		
		return chVec.get(indexofChapter);
		
	}
	
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
	
	
}
