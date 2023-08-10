import java.util.*;
class text{
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
        city c1=new city("100","indore");
        city c2=new city("200","nag");
        a.add(c1);
        a.add(c2);
  		a.add("satyam");
		a.add("pink");
		System.out.println(a);
	}
}
class city
{
      city(String id,String name)
      {
      	this.id=id;
      	this.name=name;

      } 
      String id,name;
      public String toString()
      {
      	return "id->"+id+",name->"+name;

      } 
}