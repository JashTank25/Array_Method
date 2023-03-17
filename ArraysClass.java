import java.util.Arrays;
public class ArraysClass
{
	public static void main(String[] args) 
	{
		int[] a={1,5,6,4,7,3,8};
		Arrays.sort(a);
		int[] b=Arrays.copyOf(a,a.length);//method => copyOfRange(var_name,from,to)
		for(int i:a)
		{
			System.out.print(i+" "); //output : 1 3 4 5 6 7 8
		}
		System.out.println();
		Arrays.fill(a,9);
		for(int i:a)
		{
			System.out.print(i+" "); //output : 9 9 9 9 9 9 9
		}
		System.out.println();
		for(int i:b)
		{
			System.out.print(i+" "); //output : 1 3 4 5 6 7 8
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(b,6));// output : 4
		String c=Arrays.toString(b);
		System.out.println(c);// output : [1, 3, 4, 5, 6, 7, 8]
	}
}