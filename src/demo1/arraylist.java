package demo1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * @Package: demo1
 * @ClassName: Demo.java
 * @Description:ArrayList

 * @author   Fan Dada
 * @date     2017年11月17日上午10:05:01
 * @version  1.0
 */
public class arraylist {
	public static void main(String[] args) {
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			array.add(i+"");
		}
	       array.size();//长度
	       Iterator<String> it = array.iterator();
	       while (it.hasNext()) {
			System.out.println(it.next());//对ArrayList进行遍历
		}
	       array.contains(1);//判断是否包含指定元素
	       array.indexOf(1);
	       
	}

}
