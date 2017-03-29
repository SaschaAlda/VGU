package org.vgu.se.composite;

import java.util.ArrayList;
import java.util.List;

public class ComplexDocument extends AbstractDocument  {
	
	private List<Document> docList = new ArrayList<Document>();
	
	public void addDocument( Document doc ) {
		this.docList.add(doc);
	}
	
	public void removeDocument(  Document doc ){
		this.docList.remove(doc);
	}

	@Override
	public int size() {
		int completBytes = 0;
		for ( Document doc : docList) {
			completBytes = completBytes + doc.size();
		}
		return completBytes;
	}



}
