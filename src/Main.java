
public class Main {

	public static void main(String[] args) {
		
//		Book diseaTitanic = new Book("Disea Titanic");
//		Authors rPaul = new Authors("Radu Paul");
//		diseaTitanic.addAuthor(rPaul);
//		int indexOfChapter = diseaTitanic.createChapter("Chapter One");
//		Chapter chpOne = diseaTitanic.getChapter(indexOfChapter);
//		int indexOfSubChapter = chpOne.createSubChapter("ChapterOneOne");
//		SubChapter chponeone= chpOne.getSubChapter(indexOfSubChapter);
//		int indexOfParagraph = chponeone.createParagraph("Paragraph");
//		int indexofImage = chponeone.createImage("Image");
//		int indexofTable = chponeone.createTable("Table");
		
	// LAB 2
		Book discoTitanic = new Book("Disco Titanic");
		Authors rpGheo = new Authors("Radu Pavel Gheo");
		
		discoTitanic.addAuthor(rpGheo);
		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
		
		scOneOne.createParagraph("Paragraph1");
		scOneOne.createParagraph("Paragraph2");
		scOneOne.createParagraph("Paragraph3");
		scOneOne.createImage("Image 1 ");
		scOneOne.createParagraph("Paragraph4");
		scOneOne.createTable("Table 1");
		scOneOne.createParagraph("Paragraph5");
		
		scOneOne.print();
		

	}

}
