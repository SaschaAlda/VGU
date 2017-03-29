package org.vgu.se.composite;

import java.io.UnsupportedEncodingException;

public class TextDocument extends AbstractDocument {

		
		enum Encoding {		
			UTF8("UTF-8"), 
			UTF16("UTF-16"), 
			UTF32("UTF-32");
			
			private final String code;
			private Encoding(String code) {
				this.code = code;
			}
			
			public String code(){
				return code;
			}
		}
		
		private Encoding coding;
		private String text;
		
		
		public TextDocument(String text, Encoding coding) {
			this.coding=coding;
			this.text=text;
			
		}

		@Override
		public int size() {
			try {
				return text.getBytes(coding.code()).length;
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return 0;
		}

	}



