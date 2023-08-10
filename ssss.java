import java.util.SortedSet;

class Test{
	public static void main(String[] args) {
		SortedSet s= new SortedSet();
       s.add(300);
       s.add(400);
       s.add(200);
       s.add(900);
       System.out.println( s);
       s.first();
        System.out.println( s);
	}
}