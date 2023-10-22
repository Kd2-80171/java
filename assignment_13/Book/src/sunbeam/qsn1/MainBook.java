package sunbeam.qsn1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MainBook{
static Scanner in = new Scanner(System.in);

public static int menu() {
	int choice;
	System.out.println("------------------------------------------");
	System.out.println("0. Exit");
	System.out.println("1. Add New Book if not Present.");
	System.out.println("2. Display All Books.");
	System.out.println("3. Search a Book with Given Isbn.");
	System.out.println("4. Delete Book from given index.");
	System.out.println("5. Delete Book with given Isbn.");
	System.out.println("6. Display Books in Reverse Order.");
	System.out.println("7. Save books in file");
	System.out.println("8. load in books");
	System.out.println("------------------------------------------");

	System.out.println("Enter Your Choice : ");
	choice = in.nextInt();

	return choice;

}

public static void main(String[] args) {

	int choice;
	ArrayList<Book> bookList = new ArrayList<>();

	do {
		choice = menu();
		Book temp;
		String searchIsbn;
		switch (choice) {
		case 1:// add book if not present
			temp = new Book();
			temp.accept();
			if (bookList.contains(temp)) {
				int foundBookAtIdx = bookList.indexOf(temp);
				/*
				Book b=bookList.get(foundBookAtIdx);
				b.setQty(b.getQty()+1);
				*/
				temp.setQuantity(bookList.get(foundBookAtIdx).getQuantity() + 1);

				bookList.set(foundBookAtIdx, temp);
				
				System.out.println("Quantity Increased.");
			} else {
				bookList.add(temp);
				System.out.println("Book Added.");
			}
			break;

		case 2:// display all books
			Iterator<Book> itr = bookList.iterator();

			while (itr.hasNext()) {
				Book b = itr.next();
				System.out.println(b);
			}
			break;

		case 3:// search a book with given isbn
			System.out.print("Enter isbn of Book to search : ");
			searchIsbn = in.next();
			temp = new Book();
			temp.setIsbn(searchIsbn);

			int foundAtIdx = bookList.indexOf(temp);
			if (foundAtIdx == -1) {
				System.out.println("Book Not Found.");
			} else {
				System.out.println("Book found at index " + foundAtIdx);
			}

			break;

		case 4:// delete a book at given Idx
			System.out.print("Enter index to delete the book from  : ");
			int idx = in.nextInt();
			bookList.remove(idx);
			System.out.print("Book removed from index "+idx);
			break;
			
		case 5://delete book with given isbn
			System.out.print("Enter Isbn to Delete : ");
			searchIsbn=in.next();
			temp=new Book();
			temp.setIsbn(searchIsbn);
			
			bookList.remove(temp);
			System.out.println("Book removed");
			break;
		case 6:
			Collections.reverse(bookList);
			for(Book b:bookList)
			{
				System.out.println(b);
			}
			Collections.reverse(bookList);
			
			break;
			
		case 7:
		{
		  
		
			try(FileOutputStream fout = new FileOutputStream("books.txt")){
				try(DataOutputStream dout = new DataOutputStream(fout)){
					for (Book b : bookList) {
						dout.writeUTF(b.getIsbn());
						dout.writeDouble(b.getPrice());
						dout.writeUTF(b.getAuthorName());
						dout.writeInt(b.getQuantity());
					}
				
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				
				System.out.println("books saved");
			
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}break;
		}
		
		case 8:
		{
			try(FileInputStream fin = new FileInputStream("movies.bin")) {
				try(DataInputStream din = new DataInputStream(fin)) {
					while(true) {
						Book b = new Book();
						b.setIsbn(din.readUTF());
						b.setPrice(din.readDouble());
						b.setAuthorName(din.readUTF());
						b.setQuantity(din.readInt());
						System.out.println(b);
					}
				} // din.close();
			} // fin.close();
			catch (EOFException e) {
				// do nothing
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		default:
			System.out.println("Invalid Choice");
			break;
			
		}
	} while (choice != 0);
	
	System.out.println("Program Ended.");

}
}