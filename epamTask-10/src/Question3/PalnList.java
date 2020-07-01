package Question3;
import java.util.*;
import java.util.function.Function;
public class PalnList {
	public static void main(String[] args) 
	{
		String strArray[] = {"1001","0101","0110","1111","0000"};
		
		List<String> strList = Arrays.asList(strArray);
		List<String> resultList = getPalidromeList(strList,(String str) -> (str.equals(new StringBuffer(str).reverse().toString()) ? 1 : 0) );
		
		System.out.println(resultList);		
	}
	
	public static List<String> getPalidromeList(List<String> list,Function<String,Integer> function)
	{
		
		List<String> finalList = new ArrayList<>();
		for(String str : list)
		{
			if(function.apply(str) == 1)
				finalList.add(str);
		}
		
		return finalList;
	}
}
