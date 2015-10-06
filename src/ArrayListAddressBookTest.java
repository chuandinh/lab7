

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArrayListAddressBookTest
{
    //PART H
    private AddressBook dir;
    private AddressBook deptDir;
    
    @BeforeClass
    public static void setUpBeforeClass() throws Exception
    {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception
    {
    }

    @Before
    public void setUp() 
    {
       //PART H, step 1
       dir = new ArrayListAddressBook();
       
       //PARTH, step 5
       deptDir = new ArrayListAddressBook();
       deptDir.load("deptdir.txt");
       
       //System.out.println(System.getProperty("user.dir"));
    }

    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void anEmptyDirectoryHasNoFred() 
    {
        //AddressBook dir = new ArrayListAddressBook();
        assertNull(dir.get("Fred", "Phone"));
    }
    
    @Test
    public void removeEntryFromEmptyDictionary() 
    {
        //AddressBook dir = new ArrayListAddressBook();
        assertNull(dir.remove("Fred", "Phone"));
    }
    
    
    @Test(expected=NoSuchElementException.class)
    public void removeEntryNotInDictionaryException() 
    {
        //AddressBook dir = new ArrayListAddressBook();
        dir.load("deptdir.txt");
        assertNull(dir.remove("NoEntry", "NoEntry"));
    }
    
  
    @Test
    public void removeNonExistantElement() 
    {
        try {
            //AddressBook dir = new ArrayListAddressBook();
            dir.load("deptdir.txt");
            dir.remove("NoElement", "NoElement");
            
        } catch (NoSuchElementException e) {
            assertEquals(e.getMessage(), "no such element") ;
        }
    }
    
    @Test
    public void deptDirContainsHorstmann() 
    {
       assertNotNull(deptDir.get("Horstmann", "Phone"));
    }
}
