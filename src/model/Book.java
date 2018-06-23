package model;

public class Book {
   private String Id;
   public String ISBN;
   private String title;
   
   private Member LoanTo;
public String getId() {
	return Id;
}

public void setId(String id) {
	this.Id = id;
}


   
public final String getISBN() {
	return ISBN;
}

public final void setISBN(String ISBN) {
	this.ISBN = ISBN;
}

public final String getTitle() {
	return title;
}

public final void setTitle(String title) {
	this.title = title;
}

public final Member getLoanTo() {
	return LoanTo;
}

public final void setLoanTo(Member loanTo) {
	this.LoanTo = loanTo;
}


public Book(String Id,String ISBN,String Title){
	this.Id=Id;
	this.ISBN=ISBN;
	this.title=Title;
}

}
