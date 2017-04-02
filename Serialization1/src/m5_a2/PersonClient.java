/********************************************************
 * Project : Serialization I 
 * File : PersonClient.java 
 * Name: Frederick Javalera 
 * Date : 3/28/17 (3/29/17)
 *
 * Description : (Narrative description, not code)
 *
 * 1) What is the purpose of the code; what problem does the code solve.
 * The purpose of this code is to act as a client which creates a list of
 * Person objects, writes that list in serialized form to a .ser doc, and
 * reads that doc back in and prints the results. The original list and
 * the returned list should be the same.
 *
 * 2) What data-structures are used.
 * ArrayLists are used in this program.
 *
 * 3) What algorithms, techniques, etc. are used in implementing the data
 * structures.
 * An enhanced for loop is used to print the beginning and end results.
 *
 * 4) What methods are implemented (optional).
 *
 * Changes : <Description|date of modifications>
 ********************************************************/
package m5_a2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * This class acts as a client which creates a list of Person objects, writes
 * that list in serialized form to a .ser doc, and reads that doc back in and
 * prints the results. The original list and the returned list should be the
 * same.
 * 
 * @author Frederick Javalera
 */
public class PersonClient
{
	/****************************************************
	 * Method : main
	 *
	 * Purpose : The main method creates an ArrayList of Persons and prints them
	 * out. Next, it serializes the list. It then de-serializes the list and
	 * prints the de-serialized resulting list. The two lists should be
	 * identical.
	 *
	 * Parameters : args - An array of arguments.
	 *
	 * Returns : This method does not return a value.
	 *
	 ****************************************************/
	public static void main(String[] args)
	{
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(new Person("Joe Schmoe", "8018671234"));
		personList.add(new Person("Blow Schmoe", "8018671235"));
		personList.add(new Person("Know Schmoe", "8018671236"));
		personList.add(new Person("Dough Schmoe", "8018671237"));
		personList.add(new Person("Snow Schmoe", "8018671238"));
		personList.add(new Person("Flow Schmoe", "8018671239"));

		System.out.println("Person list before writing: ");
		for (Person p : personList)
		{
			System.out.println(p);
		}
		System.out.println("\n");

		PersonClient client = new PersonClient();
//		client.serialize(personList, "src/m5_a2/Persons.ser");
		client.serialize(personList, "/Users/frederickjavalera/Downloads/Persons.ser");
		System.out.println("Serialization done...");
//		ArrayList<Person> newList = client.deserialize("src/m5_a2/Persons.ser");
		ArrayList<Person> newList = client.deserialize("/Users/frederickjavalera/Downloads/Persons.ser");
		System.out.println("De-serialization done...");
		System.out.println("\n");

		System.out.println("Person list after reading: ");
		for (Person p : personList)
		{
			System.out.println(p);
		}
		System.out.println("\n");
	}

	/****************************************************
	 * Method : serialize
	 *
	 * Purpose : The serialize method serializes pList and writes it to file,
	 * fileName.
	 *
	 * Parameters : pList - An arrayList of Person objects. fileName - The name
	 * and location of the file to be written.
	 *
	 * Returns : This method does not return a value.
	 *
	 ****************************************************/
	public void serialize(ArrayList<Person> pList, String fileName)
	{
		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			outStream.writeObject(pList);
		}
		catch (IOException e)
		{
			System.out.println("A problem occurred during serialization.");
			System.out.println(e.getMessage());
		}
	}

	/****************************************************
	 * Method : deserialize
	 *
	 * Purpose : The deserialize method reads the file located at fileName and
	 * stores its contents in a Person ArrayList which it then returns.
	 *
	 * Parameters : fileName - The name and location of the file to be written.
	 *
	 * Returns : This method returns an ArrayList of Persons.
	 *
	 ****************************************************/
	public ArrayList<Person> deserialize(String fileName)
	{
		ArrayList<Person> pList = new ArrayList<Person>();
		try (ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(fileName)))
		{
			pList = (ArrayList<Person>) inStream.readObject();
		}
		catch (IOException | ClassNotFoundException e)
		{
			System.out.println("A problem occurred during de-serialization.");
			System.out.println(e.getMessage());
		}
		return pList;
	}
}