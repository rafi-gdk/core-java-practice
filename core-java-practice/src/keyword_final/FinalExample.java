package keyword_final;

//No one can inherit this class
public final class FinalExample {
	
	//Can not change the number
	public final int number=10;

	//No one can override this method
	public final void method()
	{
		//implementation
	}
	
	public static void main(String[] args) {
		
		//we get the error if you try to change the value
		//number=20;
	}
}
