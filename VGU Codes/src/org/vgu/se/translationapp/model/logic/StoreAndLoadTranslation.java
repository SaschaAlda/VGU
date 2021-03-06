package org.vgu.se.translationapp.model.logic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.vgu.se.translationapp.model.entities.PerformedTranslation;


public class StoreAndLoadTranslation {
	
	private List<PerformedTranslation> listOfTranslation = null;
	
	private static StoreAndLoadTranslation translation = null;
	
	public final static String LOCATION = "/Users/saschaalda/tmp/translations.ser";
	
	private StoreAndLoadTranslation() {
		listOfTranslation = new ArrayList<PerformedTranslation>();
	}
	
	public static StoreAndLoadTranslation getInstance() {
		if ( translation == null ) {
			translation = new StoreAndLoadTranslation();
		}
		return translation;
	}
	
	/**
	 * This method loads a stored list of performed Translation objects from list.
	 * It will override the existing list in the memory.
	 * Client should perform this method before any new Objects are inserted!
	 * @throws PersistenceExeception
	 */
	public void loadPerformedTranslations() throws PersistenceExeception {
		ObjectInputStream ois = null;
		FileInputStream fis = null;
		try {
		  fis = new FileInputStream( LOCATION );
		  ois = new ObjectInputStream(fis);
		  
		  // Reading the list (cast necessary!!)
		  Object obj = ois.readObject();
		  if (obj instanceof List<?>) {
			  // As requested: new list overrides the existing one
			  this.listOfTranslation = ( List<PerformedTranslation> ) obj;
		  }
		  
		}
		catch (IOException e) {
			// Re-throw the exception to the calling context
			throw new PersistenceExeception("ERROR: The list could not be loaded - File not found!!");
			
		}
		catch (ClassNotFoundException e) {
			// Re-throw the exception to the calling context
			throw new PersistenceExeception("ERROR: The list could not be casted - Contact the Developer!!");
		}
		finally {
		  if (ois != null) try { ois.close(); } catch (IOException e) {}
		  if (fis != null) try { fis.close(); } catch (IOException e) {}
		}
	}
	
	/**
	 * Method for storing PeformedTranslation Objects
	 * This method will override the existing file and, thus, objects
	 * Client should load these objects from disk before any new Objects are inserted!
	 * Otherwise, objects will be lost!
	 * 
	 */	
	public void storePerformedTranslations() throws PersistenceExeception {
		ObjectOutputStream oos = null;
		FileOutputStream fos = null;
		try {
		  fos = new FileOutputStream( LOCATION );
		  oos = new ObjectOutputStream(fos);
		
		  oos.writeObject( this.listOfTranslation );
			
		} catch (IOException e) {
			e.printStackTrace();
			// Re-throw the exception to the calling context
			throw new PersistenceExeception("ERROR: The list could not be stored - File not found!!");
		} 
		
		finally {
		  if (oos != null) try { oos.close(); } catch (IOException e) {}
		  if (fos != null) try { fos.close(); } catch (IOException e) {}
		}
	}
	
	public List getListOfCurrentTranslation() {
		return this.listOfTranslation;
	}
	
	public int size() {
		return this.listOfTranslation.size();
	}
	

	public void addTranslation(PerformedTranslation performedTrans) {
		this.listOfTranslation.add( performedTrans );	
	}
	


}


