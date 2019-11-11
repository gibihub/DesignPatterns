import java.util.concurrent.TimeUnit;

public class Image implements Element {

	private String title;

	Image(String name) {
title = name;
		try {
		TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void print()
	{
		System.out.println("ImageName: "+ this.title);
	}

	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
		
	}
	
}
