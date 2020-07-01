package Question1;

import java.util.*;
public class ListCre {
	public static void main(String[] args) 
	{
		List <Integer>list = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int numberOfElements = sc.nextInt();
		
		int i;
		
		for(i = 0;i < numberOfElements;i++)
		{
			list.add(sc.nextInt());
		}
		
		System.out.println(list);
		
		ListCre average = new ListCre();
		System.out.println(average.getAverageOfListIntegers(list));
		
		sc.close();		
	}
	public double getAverageOfListIntegers(List<Integer> list)
	{
		double average = 0.0f;		
		
		IntSummaryStatistics summaryStats = list.stream()
			      .mapToInt((a) -> a)
			      .summaryStatistics();
		
		average = (double) summaryStats.getAverage();
		
		return average;
	}
}
