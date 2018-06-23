package model;

import java.time.LocalDateTime;

public class LoanOnlyOneSpecification implements ISpecification<Member>{
 Book wantBook;
 
 public LoanOnlyOneSpecification(Book wantBook) {
     this.wantBook = wantBook;
 }
	@Override
	public boolean IsSatisfiedBy(Member entity) {
		// TODO Auto-generated method stub
		
		 boolean b = entity.getLoans()
		            .stream()
		            .noneMatch(loan -> loan.HasNotBeenReturned() && loan.getBook().getISBN().equals(wantBook.getId()));
		        if (!b) {
		            System.out.println(LocalDateTime.now() + ":" + entity.getName() + "已经借了1本" + wantBook.getTitle() + "不能再借。");
		        }
		        return b;
	    }
	}
	


