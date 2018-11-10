package exercises;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExampleMainStream {

	public static void main(String[] args) {

		List<Book> books = LibraryFactory.createLibrary();
		Map<String, List<Book>> collect = books.stream()
				.collect(Collectors.groupingBy(b -> b.getAuthor().getName(), Collectors.toList()));
		collect.forEach((k, v) -> System.out.println(k + ":" + v));
	}
}
