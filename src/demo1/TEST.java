package demo1;

import java.util.ArrayList;
import java.util.Iterator;

public class TEST {
	 ArrayList<Dvd> array = new ArrayList<>();
	public static void main(String[] args) {
			TEST t  = new TEST();
		t.array.add(new Dvd(1,"³���ʦ"));
		t.array.add(new Dvd(2,"Di Renjie"));
		t.array.add(new Dvd(3,"Ruban master"));
		t.array.add(new Dvd(4,"Sun Shangxiang"));
		t.array.add(new Dvd(5,"Liu Bei"));
		t.array.add(new Dvd(6,"�ܲ�"));
		t.array.add(new Dvd(7,"������"));
		t.array.add(new Dvd(8,"������"));
		t.array.add(new Dvd(9,"�����"));
		t.array.add(new Dvd(10,"��СС"));
		t.addArray(1,"");
		Iterator<Dvd> it = t.array.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	/**
	 * ��ArrayList������Ԫ��
	 */
	private void addArray(int id,String name) {
		for (Dvd dvd : array) {
			
			
		}
			
	}
		
		
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


