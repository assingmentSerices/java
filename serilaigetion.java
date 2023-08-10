import java.io.*;
import java.util.*;
class text
{
	public static void main(String[] args) throws Exception
	{
		//serilaigation
		// Emp e=new Emp();
		// FileOutputStream fos=new FileOutputStream("op.obj");
		// ObjectOutputStream oos=new  ObjectOutputStream(fos);
		// oos.writeObject(e);
	//Deserilaigation
	FileInputStream fis=new FileInputStream("op.obj");
		ObjectInputStream ois=new  ObjectInputStream(fis);
	Emp e=(Emp)ois.readObject();
	System.out.println(e.name);
	System.out.println(e.id);
	System.out.println(e.d.name); 
	System.out.println(e.c.name);
	System.out.println(e.a.name);
}
}
class Emp implements Serializable
{
	transient int id =1000;
	String name="chetan";
	Dog d=new Dog();
	Cat c=new Cat();
	Animal a=new Animal();
}

class Dog implements Serializable

{
	String name="Tomy";
}
class Cat implements Serializable
{
	String name="Piyush";
}
class Animal implements Serializable
{
	String name="abhay";
}