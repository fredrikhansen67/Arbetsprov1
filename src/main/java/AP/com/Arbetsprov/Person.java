package AP.com.Arbetsprov;

import java.util.Comparator;

public class Person {
	private static int counter=0;//Räknar upp antal objekt klassen skapat
	private int personID;
	private  String fName;
	private  String eName;
	private  String gender;
	
	public Person(String fName, String eName, String gender){
		this.setPersonID(newPersonToCounter());
		this.fName = fName;
		this.eName = eName;
		this.gender = gender;
	}
	
	public  String getfName() {
		return fName;
	}

	public  void setfName(String fName) {
		this.fName = fName;
	}

	public  String geteName() {
		return eName;
	}

	public  void seteName(String eName) {
		this.eName = eName;
	}

	public  String getGender() {
		return gender;
	}

	public  void setGender(String gender) {
		this.gender = gender;
	}


	
	private int newPersonToCounter() {	
		return counter=counter+1;
	}

	public int getPersonID() {
		return personID;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public static Comparator<Person> FirtNameComparator = new Comparator<Person>() {
        public int compare(Person obj1, Person obj2) {
            return obj1.getfName().compareTo(obj2.getfName());
        }	
    };
    public static Comparator<Person> SurNameComparator = new Comparator<Person>() {
        public int compare(Person obj1, Person obj2) {
            return obj1.geteName().compareTo(obj2.geteName());
        }	
    };
    
	@Override
	public String toString() {
		return "Person [personID=" + personID + ", fName=" + fName + ", eName=" + eName + ", gender=" + gender + "]";
	}
	
	
	

}
