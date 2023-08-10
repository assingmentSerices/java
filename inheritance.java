class Shape{
	public void add(){
		System.out.println("Hii chetan");
	}
}
class Cook extends Shape{
	public void  std(){
		System.out.println("piyush");
	}
	
}

class Test{
	public static void main(String[] args) {
		Cook k= new Cook();
		k.std();
         k.add();
	}
}