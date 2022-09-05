package just_Space;

public class Duplicate_String {

	public static void main(String[] args) {
		String str[]= {"java","kashi","omg","kashi",};
		boolean flag=false;
		for(int i=0; i<str.length; i++)
		{
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i]==str[j])
				{
					System.out.println("The Dublicate elemnts are "+str[i]);
					flag=true;
				}
			}
		}
		if (flag==false)
		{
			System.out.println("There is no Dublicate elemnts");
		}
	}

}
