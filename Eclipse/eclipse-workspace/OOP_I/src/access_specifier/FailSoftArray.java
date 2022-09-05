package access_specifier;
class FailArray{
	private int arry[];//reference to array
	private int errval;//value to return if get() fails
	public int length;
	/*construct array given its size and the value
	 * to return if get() fails*/
	public FailArray(int size, int errv) {
		arry=new int [size];
		errval=errv;
		length=size;		
	}
	//return a value at a given index
	public int get(int index) {
		if(ok(index))
			return arry[index];
		return errval;
	}
	//put a value at an index. Return false on failure.
	public boolean put(int index, int val) {
		if(ok(index)) {
			arry[index]=val;
			return true;
		}
		return false;
	}
	//return true if index is within bounds.
	private boolean ok(int index) {
		if(index>=0&&index<length)
			return true;
		return false;
	}
}
public class FailSoftArray {

	public static void main(String[] args) {
		FailArray fa=new FailArray(5,-1);
		int i,x;
	//show quiet failures
	System.out.println("Fail Quietly.");
	for(i=0;i<(fa.length*2);i++) {	
		fa.put(i, i*10);
	}
	for(i=0;i<(fa.length*2);i++) {
		x=fa.get(i);
		if(x!=-1)
			System.out.print(x+"["+i+"] ");
		}
	System.out.println("");
	//now, handle failures
	System.out.println("\nFail with error reports.");
	for(i=0;i<(fa.length*2);i++) 	
	if(!fa.put(i, i*10))
		System.out.println("Index "+i+" out-of-bounds.");
	for(i=0;i<(fa.length*2);i++) {
		x=fa.get(i);
		if(x!=-1)
			System.out.println(x+" ");
		else
			System.out.println("Index "+i+" out-of-bounds");
		
	}
	
	}

}
