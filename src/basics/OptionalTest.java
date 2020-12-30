package basics;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args)
	{
		String[] str=new String[20];
		str[10]="learnprograming byluckysir";
	
		Optional<String> checkNull=Optional.ofNullable(str[10]);
		if(checkNull.isPresent())
		{
			String upperCase=str[10].toUpperCase();
			
			System.out.print(upperCase);
		}
		else
		
		System.out.print("String value is not present");
		
		
	}

}
