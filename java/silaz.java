import java.io.*;
class seri{
	public static void main(String[] args)throws Exception {
    /*  FileOutputStream fos= new FileOutputStream("final.obj");
       ObjectOutputStream oos=new ObjectOutputStream(fos);
       Dog d=new Dog();
       oos.writeObject(d);
*/
       FileInputStream fis=new FileInputStream("final.obj");
       ObjectInputStream ois=new ObjectInputStream(fis);
       Dog d=(Dog)ois.readObject();
       System.out.println(d.a+","+d.b);

         
	}
}
class Dog implements Serializable
{
     int a=10;
	   transient int b=20;
}