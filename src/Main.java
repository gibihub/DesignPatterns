
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
//		Book discoTitanic = new Book("Disco Titanic");
//		Authors rpGheo = new Authors("Radu Pavel Gheo");
//		
//		discoTitanic.addAuthor(rpGheo);
//		int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
//		Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
//		int indexSubChapterOneOne = chp1.createSubChapter("Subcapitolul 1.1");
//		SubChapter scOneOne = chp1.getSubChapter(indexSubChapterOneOne);
//		
//		scOneOne.createParagraph("Paragraph1");
//		scOneOne.createParagraph("Paragraph2");
//		scOneOne.createParagraph("Paragraph3");
//		scOneOne.createImage("Image 1 ");
//		scOneOne.createParagraph("Paragraph4");
//		scOneOne.createTable("Table 1");
//		scOneOne.createParagraph("Paragraph5");
//		
//		scOneOne.print();
//		

		
	// LAB 3
		
Book noapteBuna = new Book("Nb copii");
Authors rpGheo = new Authors("Radu Pavel Gheo");
noapteBuna.addAuthor(rpGheo);

Section cap1 = new Section("Capitolul 1");
Section cap11 = new Section("Capitolul 1.1");
Section cap111 = new Section("Capitolul 1.1.1");
Section cap1111= new Section("SubCh 1.1.1.1");
noapteBuna.addContent(new Paragraph("Multumesc celor care au facut .."));
noapteBuna.addContent(cap1);
cap1.add(new Paragraph("Moto capitol"));
cap1.add(cap11);
cap11.add(new Paragraph("Text from subchapter 1.1"));
cap11.add(cap111);
cap111.add(new Paragraph("Text from subchapter 1.1.1"));
cap111.add(cap1111);
cap1111.add(new Image("Image subchapter 1.1.1.1"));

noapteBuna.print();
		
		
		
		
		
		
		
		
		
		
	}

}
