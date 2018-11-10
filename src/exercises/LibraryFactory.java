package exercises;

import java.util.Arrays;
import java.util.List;

public class LibraryFactory {
	
	public static List<Book> createLibrary() {
		return Arrays.asList(new Book("To Kill a Mockingbird", new Author("Harper Lee")),
				new Book("Pride and Prejudice", new Author("Jane Austen")),
				new Book("The Diary of Anne Frank", new Author("Anne Frank")),
				new Book("1984", new Author("George Orwell")),
				new Book("Harry Potter and the Sorcerer's Stone", new Author("J.K. Rowling")),
				new Book("The Lord of the Rings(1-3)", new Author("J.R.R. Tolkien")),
				new Book("The Great Gatsby", new Author("F. Scott Fitzgerald")),
				new Book("Charlotte's Web", new Author("E.B. White")),
				new Book("The Hobbit", new Author("J.R.R. Tolkien")),
				new Book("Little Women", new Author("Louisa May Alcott")),
				new Book("Fahrenheit 451", new Author("Ray Bradbury")),
				new Book("Jane Eyre", new Author("Charlotte Bronte")),
				new Book("Animal Farm", new Author("George Orwell")),
				new Book("Gone with the Wind", new Author("Margaret Mitchell")),
				new Book("The Catcher in the Rye", new Author("J.D. Salinger")),
				new Book("The Book Thief", new Author("Markus Zusak")),
				new Book("The Adventures of Huckleberry Finn", new Author("Mark Twain")),
				new Book("The Hunger Games", new Author("Suzanne Collins")),
				new Book("The Help", new Author("Kathryn Stockett")),
				new Book("The Lion, the Witch, and the Wadrobe", new Author("C.S. Lewis")),
				new Book("The Grapes of Wrath", new Author("John Steinbeck")),
				new Book("The Lord of the Flies", new Author("William Golding")),
				new Book("The Kite Runner", new Author("Khaled Hosseini")),
				new Book("Night", new Author("Elie Wiesel")),
				new Book("Hamlet", new Author("William Shakespeare")),
				new Book("A Wrinkle in Time", new Author("Madeleine L'Engle")),
				new Book("Of Mice and Men", new Author("John Steinbeck")),
				new Book("A Tale of Two Cities", new Author("Charles Dickens")),
				new Book("Romeo and Juliet", new Author("William Shakespeare")),
				new Book("The Hitchhikers Guide to the Galaxy", new Author("Douglas Adams")),
				new Book("The Secret Garden", new Author("Frances Hodgson Burnett")),
				new Book("A Christmas Carol", new Author("Charles Dickens")),
				new Book("The Little Prince", new Author("Antoine de Saint-Exup�ry")),
				new Book("Brave New World", new Author("Aldous Huxley")),
				new Book("Harry Potter and the Deathly Hallows", new Author("J.K. Rowling")),
				new Book("The Giver", new Author("Lois Lowry")),
				new Book("The Handmaid's Tale", new Author("Margaret Atwood")),
				new Book("Where the Sidewalk Ends", new Author("Shel Silverstein")),
				new Book("The Fault in Our Stars", new Author("John Green")),
				new Book("Anne of Green Gables", new Author("L.M. Montgomery")),
				new Book("The Adventures of Tom Sawyer", new Author("Mark Twain")),
				new Book("Macbeth", new Author("William Shakespeare")),
				new Book("The Girl with a Dragon Tattoo", new Author("Stieg Larrson")),
				new Book("Frankenstein", new Author("Mary Shelley")),
				new Book("The Color Purple", new Author("Alice Walker")),
				new Book("The Count of Monte Cristo", new Author("Alexandre Dumas")),
				new Book("A Tree Grows in Brooklyn", new Author("Betty Smith")),
				new Book("East of Eden", new Author("John Steinbeck")),
				new Book("Alice in Wonderland", new Author("Lewis Carroll")),
				new Book("In Cold Blood", new Author("Truman Capote")),
				new Book("Catch-22", new Author("Joseph Heller")),
				new Book("The Stand", new Author("Stephen King")),
				new Book("Outlander", new Author("Diana Gabaldon")),
				new Book("Harry Potter and the Prisoner of Azkaban", new Author("J.K. Rowling")),
				new Book("Enders Game", new Author("Orson Scott Card")),
				new Book("Anna Karenina", new Author("Leo Tolstoy")),
				new Book("Watership Down", new Author("Richard Adams")),
				new Book("Memoirs of a Geisha", new Author("Arthur Golden")),
				new Book("Rebecca", new Author("Daphne du Maurier")),
				new Book("A Game of Thrones", new Author("George R.R. Martin")),
				new Book("Great Expectations", new Author("Charles Dickens")),
				new Book("The Old Man and the Sea", new Author("Ernest Hemingway")),
				new Book("The Adventures of Sherlock Holmes(#3)", new Author("Arthur Conan Doyle")),
				new Book("Les Mis�rables", new Author("Victor Hugo")),
				new Book("Harry Potter and the Half-Blood Prince", new Author("J.K. Rowling")),
				new Book("Life of Pi", new Author("Yann Martel")),
				new Book("The Scarlet Letter", new Author("Nathaniel Hawthorne")),
				new Book("Celebrating Silence: Excerpts from Five Years of Weekly Knowledge",
						new Author("Sri Sri Ravi Shankar")),
				new Book("The Chronicles of Narnia", new Author("C.S. Lewis")),
				new Book("The Pillars of the Earth", new Author("Ken Follett")),
				new Book("Catching Fire", new Author("Suzanne Collins")),
				new Book("Charlie and the Chocolate Factory", new Author("Roald Dahl")),
				new Book("Dracula", new Author("Bram Stoker")),
				new Book("The Princess Bride", new Author("William Goldman")),
				new Book("Water for Elephants", new Author("Sara Gruen")),
				new Book("The Raven", new Author("Edgar Allan Poe")),
				new Book("The Secret Life of Bees", new Author("Sue Monk Kidd")),
				new Book("The Poisonwood Bible: A Novel", new Author("Barbara Kingsolver")),
				new Book("One Hundred Years of Solitude", new Author("Gabriel Garc��a M�rquez")),
				new Book("The Time Traveler's Wife", new Author("Audrey Niffenegger")),
				new Book("The Odyssey", new Author("Homer")),
				new Book("The Good Earth (House of Earth #1)", new Author("Pearl S. Buck")),
				new Book("Mockingjay (Hunger Games #3)", new Author("Suzanne Collins")),
				new Book("And Then There Were None", new Author("Agatha Christie")),
				new Book("The Thorn Birds", new Author("Colleen McCullough")),
				new Book("A Prayer for Owen Meany", new Author("John Irving")),
				new Book("The Glass Castle", new Author("Jeannette Walls")),
				new Book("The Immortal Life of Henrietta Lacks", new Author("Rebecca Skloot")),
				new Book("Crime and Punishment", new Author("Fyodor Dostoyevsky")),
				new Book("The Road", new Author("Cormac McCarthy")),
				new Book("The Things They Carried", new Author("Tim O'Brien")),
				new Book("Siddhartha", new Author("Hermann Hesse")),
				new Book("Beloved", new Author("Toni Morrison")),
				new Book("Slaughterhouse-Five", new Author("Kurt Vonnegut")),
				new Book("Cutting For Stone", new Author("Abraham Verghese")),
				new Book("The Phantom Tollbooth", new Author("Norton Juster")),
				new Book("The Brothers Karamazov", new Author("Fyodor Dostoyevsky")),
				new Book("The Story of My Life", new Author("Helen Keller")));

	}
}
