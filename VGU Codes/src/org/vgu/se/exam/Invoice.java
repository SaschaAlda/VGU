package org.vgu.se.exam;

public class Invoice {
	
	public Invoice( int id ) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	private int id;
	
	private String content;
	
	

}
