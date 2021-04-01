package myArrayList;
import java.util.Iterator;

public class main {
	public static void main(String[] args)  {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			int ranNum = (int) (Math.random() * 5);
			list.add(0, ranNum);
		}
		System.out.println(list.toString());
		
		
		System.out.println(list.indexOf(new Integer(1)));
//		
//		boolean iscontain = list.contains(new Integer(1));
//		System.out.println(iscontain);
//		
//		int halfSize = list.size() / 2;
//		for (int i = 0; i < halfSize; i++) {
//			int ranNum = (int) (Math.random() * 100);
//			list.remove(ranNum);
//		}
//		
//		
		
		
		
		
		
		
		
//		
//		list.add("a");
//		list.add("d");
//		list.add("c");
//		list.add("e");
//		list.add("r");
//		
//		list.remove(0);
//		list.remove(0);
//		
//		
//		
//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
//		
		
//		Iterator<String> iter = list.iterator();
//		while(iter.hasNext()) {
//			String s = iter.next();
//			System.out.println(s);
//		}
		
		
	}
}
