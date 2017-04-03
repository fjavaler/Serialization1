/********************************************************
 * Project : Serialization I
 * File : Person.java 
 * Name: Frederick Javalera 
 * Date : 3/28/17 (3/29/17)>
 *
 * Description : (Narrative description, not code)
 *
 * 1) What is the purpose of the code; what problem does the code solve.
 * The purpose of this code is to create Person objects. A person object
 * contains a name and a cell phone number.
 *
 * 2) What data-structures are used.
 * No specific data structures used.
 *
 * 3) What algorithms, techniques, etc. are used in implementing the data
 * structures.
 * None.
 *
 * 4) What methods are implemented (optional).
 *
 * Changes : <Description|date of modifications>
 ********************************************************/
package m5_a2;

import java.io.Serializable;

/**
 * This class creates Person objects. A person object contains 
 * a name and a cell phone number. Test
 * 
 * @author Frederick Javalera
 */
public class Person implements Serializable
{
	// fields
	private String name = "";
	private String cellPhone = "";

	/****************************************************
	 * Method : Person (constructor)
	 *
	 * Purpose : The constructor method constructs a Person object.
	 *
	 * Parameters : _name - The name of the Person.
	 * _cellPhone         - The cell Person's cell phone number.
	 *
	 * Returns : This method does not return a value.
	 *
	 ****************************************************/
	public Person(String _name, String _cellPhone)
	{
		this.name = _name;
		this.cellPhone = _cellPhone;
	}

	/****************************************************
	 * Method : getName
	 *
	 * Purpose : The getName method returns the name of the person.
	 *
	 * Parameters : None.
	 *
	 * Returns : Returns the name of the person.
	 *
	 ****************************************************/
	public String getName()
	{
		return name;
	}

	/****************************************************
	 * Method : setName
	 *
	 * Purpose : The setName method updates the person's name to name.
	 *
	 * Parameters : name - the name to be set to.
	 *
	 * Returns : This method does not return a value.
	 *
	 ****************************************************/
	public void setName(String name)
	{
		this.name = name;
	}

	/****************************************************
	 * Method : getCellPhone
	 *
	 * Purpose : The getCellPhone method returns the person's cell phone
	 * number.
	 *
	 * Parameters : None.
	 *
	 * Returns : This method returns the person's cell phone number.
	 *
	 ****************************************************/
	public String getCellPhone()
	{
		return cellPhone;
	}

	/****************************************************
	 * Method : setCellPhone
	 *
	 * Purpose : The setCellPhone method sets the cellPhone field to cellPhone.
	 *
	 * Parameters : cellPhone - The cell phone number to be set to.
	 *
	 * Returns : This method does not return a value.
	 *
	 ****************************************************/
	public void setCellPhone(String cellPhone)
	{
		this.cellPhone = cellPhone;
	}

	/****************************************************
	 * Method : toString
	 *
	 * Purpose : The toString method returns a string containing the 
	 * person's name and cell phone number.
	 *
	 * Parameters : None.
	 *
	 * Returns : This method returns a string containing the person's name 
	 * and cell phone number.
	 *
	 ****************************************************/
	@Override
	public String toString()
	{
		return name + ", " + cellPhone;
	}
}