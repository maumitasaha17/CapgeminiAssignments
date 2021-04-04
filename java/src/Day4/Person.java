package Day4;

public class Person {

	String name;
	char gender;
	int age;
	
	//has a relationship
	Address addr;
	Product product;
	
	//constructors
	Person(){
	Person(String name,char gender, int age){
		this.name = name;
		this.gender= gender;
		this.age = age;
	}
	

}
