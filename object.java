 class Student{      
 
String name;
int rollno;
int age;
	 
void info(){
System.out.println("Name: "+name);
System.out.println("Roll Number: "+rollno);
System.out.println("Age: "+age);
	}  
	
public static void main(String[] args) {
Student std = new Student();
		
// Accessing and property value
std.name = "Pankaj";
std.rollno = 33;
std.age = 24;
		
// Calling method
std.info();
}
}