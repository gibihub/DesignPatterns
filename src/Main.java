
public class Main {

	public static void main(String[] args) {
		
		Book diseaTitanic = new Book("Disea Titanic");
		Authors rPaul = new Authors("Radu Paul");
		diseaTitanic.addAuthor(rPaul);
		int indexOfChapter = diseaTitanic.createChapter("Chapter One");
		Chapter chpOne = diseaTitanic.getChapter(indexOfChapter);
		int indexOfSubChapter = chpOne.createSubChapter("ChapterOneOne");
		SubChapter chponeone= chpOne.getSubChapter(indexOfSubChapter);
		int indexOfParagraph = chponeone.createParagraph("Paragraph");
		int indexofImage = chponeone.createImage("Image");
		int indexofTable = chponeone.createTable("Table");
		
		

	}

}
