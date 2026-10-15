package java_programs;

import java.util.LinkedList;
import java.util.ListIterator;

public class linked_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>linkedlist=new LinkedList<>();
linkedlist.add("A");
linkedlist.add("B");
linkedlist.add("D");
linkedlist.add("O");
System.out.println(linkedlist);
linkedlist.add(4,"B");
linkedlist.add(5,"B");
System.out.println(linkedlist);
linkedlist.remove("B");
linkedlist.remove("o");
System.out.println(linkedlist);
ListIterator<String>iterator=linkedlist.listIterator();
while(iterator.hasNext()) {
	System.out.println(iterator.next());
}
	}

}
