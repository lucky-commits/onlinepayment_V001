package basics;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Java");
        hashSet.add("Asp.net");
        hashSet.add("Python");
        hashSet.add("Cloud Computing");
      
  

        System.out.println("HashSet elements are,");
        hashSet.stream().forEach(System.out::println);

        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.add("Java");
        treeSet.add("Asp.Net");
        treeSet.add("Python");
        treeSet.add("Cloud Computing");

        

        System.out.println("TreeSet elements are,");
        treeSet.stream().forEach(System.out::println);
}

}
