package demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @Package: demo1
 * @ClassName: Demo.java
 * @Description:ArrayList

 * @author   Fan Dada
 * @date     2017��11��17������10:05:01
 * @version  1.0
 */
public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			array.add(i+"");
		}
	       array.size();//����
	       Iterator<String> it = array.iterator();
	       while (it.hasNext()) {
			System.out.println(it.next());//��ArrayList���б���
		}
	       array.contains(1);//�ж��Ƿ����ָ��Ԫ��
	       array.indexOf(1);
	       
	}

}
