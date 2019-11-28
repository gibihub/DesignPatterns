
public class DocumentManager {
private static DocumentManager instance = null;
Book book;

private DocumentManager() {}

public static DocumentManager getInstance() {
	
	if(instance == null)
		instance = new DocumentManager();
	return instance;
}

public Book getBook()
{
	return book;
}

public void setBook(Book b)
{
	book = b;
}
}
