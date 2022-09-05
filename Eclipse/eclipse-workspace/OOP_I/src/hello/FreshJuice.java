package hello;
 class  FreshJuiceTest{
	enum FreshJuiceSize{Small, Medium, Large}
	FreshJuiceSize size;
}
public class FreshJuice{
	public static void main(String[]args) {
		FreshJuiceTest juice=new FreshJuiceTest();
		juice.size=FreshJuiceTest.FreshJuiceSize.Large;
		/**
		 * also works
		 * juice.size=juice.size.Large;
		*/
		System.out.println("Size: " +juice.size);
	}
}
