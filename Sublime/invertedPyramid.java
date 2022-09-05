class invertedPyramid
{
	public static void main(String[] args)
	{
int row, i, k,sp;
k=1;
for(row=5;row>=1;row--)
{
for(sp=1;sp<=k;sp++)
{
System.out.print(" ");
}
for(i=row*2-1;i>=1;i--)
{
System.out.print("*");
}
k++;
System.out.print("\n");
}
}
}