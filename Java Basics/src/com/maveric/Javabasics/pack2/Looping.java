package com.maveric.Javabasics.pack2;

public class Looping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Loops will keep routing condition till it reaches target
		//For loop post increment
		/*for (int a=0;a<5;a++)
		{
			System.out.println(a);
		}
		System.out.println("\n");
		for (int a=0;a<5;a=a+2)
		{
			System.out.println(a);
		}*/
		//modified for loop. Initialization happens outside the loop
		/*int a=0;
		for (;a<5;a=a+2)
		{
			System.out.println(a);
		}*/
		//Increment or decrement happens inside loop
		/*for(int a=0;a<5;)
		{
			System.out.println(a);
			a=a+2;
		}*/
		// Initialization outside and condition inside for loop which is same as While loop
		/*int a=0;
		for(;a<5;)
		{
			System.out.println(a);
			a=a+2;
		}*/
		/*int a=0;
		while(a<5)// replacing the for with while loop
		{
			System.out.println(a);
			a=a+2;
		}
		*/
		/*int a=1;
		int b=0;
		do {
			System.out.println(b);
			b++;
		}while(b<a);
		*/
		String[] a = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
		/*int l = a.length;
		for(int i=0;i<1;i++) {
			System.out.println(a[i]+"="+a[i].length());
		}*/
		//for each loop: which will take array a values into b starting from index 0 to end. B is not an array
		for (String b:a)
		{
			if(b.length()<=3) // length <=3 values will be skipped and continues the next iteration using continue 
			{
				continue;
			}
			System.out.println(b+"="+b.length());
		}
	}

}
