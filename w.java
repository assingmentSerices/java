abstract class Animal
{  
  abstract void eat();  
  abstract void jump();
}  
class Dog extends Animal{  
void eat()


{
System.out.println("they are eating food");

} 
 void jump()
 {
 	System.out.println("my name is chetan kushwah");
 } 
public static void main(String args[]){  
 Dog obj = new Dog();  
 obj.eat();  
 obj.jump();
}  
}  