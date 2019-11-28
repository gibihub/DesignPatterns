import java.util.Vector;

public class Book{

	private String title;
	private Vector<Authors> authVec = new Vector<>();
	private Vector<Element> elVec = new Vector<>();
	public Book(String title) {
		
		this.title = title;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	
	
	public void print()
	{
		System.out.println("title of book:" + this.title);
		System.out.println();

		System.out.println();
		
		for(Authors it2 : authVec)
		{
			it2.print() ;
		}
		
		for(Element e : elVec)
		{
			e.print();
		}
	}
	
	public void addContent(Element e)
	{
		elVec.add(e);
	}
	
	
	public void accept(Visitor visitor) {
		visitor.visit(this);		
	}

	
	
	
}
