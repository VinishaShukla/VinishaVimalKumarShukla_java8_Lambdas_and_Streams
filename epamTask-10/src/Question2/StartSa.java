package Question2;
import java.util.*;
import java.util.function.Predicate;
public class StartSa {
	public static void main(String[] args) 
	{
		String []strArray = {"apple","banana","avocados","mango","apricots"};
		List<String> strList = Arrays.asList(strArray);
		
		List<String> filterList = filterListStartWithLetterA(strList,(String str) ->( str.charAt(0) == 'a'));
		System.out.println(filterList);
		
	}
	
	public static List<String> filterListStartWithLetterA(List<String> list,Predicate<String> predicate)
	{
		List<String> finalList = new ArrayList<>();
		
		for(String str : list)
		{
			if(predicate.test(str))
			{
				finalList.add(str);
			}
		}
		
		return finalList;
		
	}
}
