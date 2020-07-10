package oopsActivity2_1;

public class MyBook extends Book {

	
	public static void main(String[] args) {
		String MyTitle="DBS Management";
		MyBook title=new MyBook();
		
		title.setTitle(MyTitle);
		System.out.println("Title of the Book-"+title.getTitle());

	}

	@Override
	public void setTitle(String s) {
		title=s;
		
	}

}
