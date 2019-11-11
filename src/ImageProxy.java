
public class ImageProxy implements Element {
 private String imageName;
 private Image realImage;


public ImageProxy(String imageName) {
	super();
	this.imageName = imageName;
}

@Override
public void print() {
	if (realImage != null)
	{
		realImage.print();
	}
	else
		{
			realImage = new Image(imageName);
		}
}

@Override
public void accept(Visitor visitor) {
	visitor.visit(this);
	
}


}
