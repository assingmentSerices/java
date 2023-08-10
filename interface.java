interface WW{
	void get();
}


interface YY{
	 void get();
	
}


class TT implements WW,YY{
	public void get(){
		System.out.println("hhh");
	}
}


class Test{
	public static void main(String[] args) {
		TT t= new TT();
       t.get();
	}
}