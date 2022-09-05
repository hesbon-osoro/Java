package inheritance;
class radius
{
	 int r=7;
}
class diameter extends radius
{
 public void diam()
	{
	int d;
	d=2*r;
	System.out.println("Diameter ="+d);
}
}
class perimeter extends radius
{
 public void perim()
	{
	float p;
	p=3.142f*r*r;
	System.out.println("Circumference ="+p);
}
}
class volume extends radius
{
 public void vol()
	{
	float v;
	v=3.142f*r*r*r*4/3;
	System.out.println("Volume ="+v);
	}
	
}
public class Hierarrchical
{
	
	public static void main(String[] args)
	{
	System.out.println("The output is: ");
	volume v= new volume();
	perimeter p=new perimeter();
	diameter d=new diameter();
	d.diam();
	p.perim();
	v.vol();
		
	}

}
