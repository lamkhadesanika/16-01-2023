package com_arrya;

public class UseDocument {
	public static String authorMaxCopies(Document d1, Document d2) {
		// TODO Auto-generated method stub
		String result;
		
		if(d1.getCopies() == d2.getCopies())
			return d1.getAuthor();
		else if (d1.getCopies() == d2.getCopies())
			return d1.getAuthor();
		else {
			result = d1.getAuthor() +"and"+ d2.getAuthor();
		return result;
		}
	}

	public static String countCopiesAuthor(Document[] docs, String auth) {
		// TODO Auto-generated method stub
		int Count = 0;
		String Count1 = (String) null;
		for(int i=0;i<docs.length;i++) {
			if(docs[i].getAuthor().equals(auth)) {
				Count1 = Count1 + docs[i].getCopies();
			}
		}
		return Count1;
	}

}
