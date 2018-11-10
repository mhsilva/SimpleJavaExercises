package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleMain {
	public static void main(String[] args) {

		List<Book> books = LibraryFactory.createLibrary();
		Map<String, List<Book>> group = new HashMap<>();
		for (Book book : books) {
			String authorName = book.getAuthor().getName();
			if(!group.containsKey(authorName))
				group.put(authorName, new ArrayList<>());
			group.get(authorName).add(book);
		}
		
		for(Map.Entry entry : group.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
	}
}
