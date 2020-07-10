package oopsActivity2_1;

/*
 * 
Activity 2-1

In this activity we use the Abstract Class to show implementation of Abstraction.

For this activitiy:

    Create an abstract class Book that has:
        title of type String
        an abstract method setTitle() that takes one String argument.
        a concrete method getTitle() that returns the value of title.
    Create another class that extends the abstract class called MyBook.
    MyBook defines the setTitle() method to assign the value of title as the argument.


 */
public abstract class Book {
	String title;
	public abstract void setTitle(String s);
		
	public String getTitle(){
		
		return title;
		
	}

}
