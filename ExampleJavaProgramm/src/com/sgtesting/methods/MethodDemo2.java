package com.sgtesting.methods;
class Practice
{
	void Fact(int n) {
		int fact=1;
		{
			for(int i=1; i<=n; i++)
			{
				fact=fact*i;
				{
					System.out.println(fact+"  ");
				}
			}
		}
	}

	public class MethodDemo2 {

		public static void main(String[] args) {
			Practice o1=new Practice();
			o1.Fact(5);
		}

	}
}

