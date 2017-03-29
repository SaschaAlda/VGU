package org.vgu.se.composite;

public class TestClient {
	
	public void run() {
		
		ComplexDocument doc0 = new ComplexDocument();
		doc0.setID(1);
		
		Document doc2 = new TextDocument("The final exam takes place soon!!" , TextDocument.Encoding.UTF8  );
		doc2.setID(3);
		System.out.println("Size of Doc2: " +  doc2.size() + " Bytes" );
		
		ComplexDocument doc3 = new ComplexDocument();
		doc3.setID(1);
		
		Document doc4 = new GraficDocument( "localhost:8080" );
		doc4.setID(2);
		Document doc5 = new TextDocument("Software Engineering Design is a lecture at the VGU!" , TextDocument.Encoding.UTF32  );
		doc5.setID(3);
		System.out.println("Size of Doc5: " +  doc5.size() + " Bytes" );
		
		doc3.addDocument(doc4);
		doc3.addDocument(doc5);
		
		doc0.addDocument(doc3);
		doc0.addDocument(doc2);
		
		System.out.println("Size of Docs: " +  doc0.size() + " Bytes" );
		
		// Test Case Report
		if ( doc0.size() == 1441 ) {
			System.out.println("Expected Output (size): 1441. Actual Output: 1441 --> Test Case successful!" );
		} else {
			System.out.println("Expected Output (size): 1445. Actual Output: "+ doc0.size() + " --> Test Case NOT successful!" );
		}
		
	}

	public static void main(String[] args) {
		TestClient c = new TestClient();
		c.run();
	}

}
