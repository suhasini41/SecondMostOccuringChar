package package1;

import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccuringChar
{
	public static void main(String args[])
	{
		String s = "baby";
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i], 0)+1);
		}
		System.out.println(map);
		int max = 0,min=0;
		char maxc = ' ',minc = ' ';
		for(Map.Entry<Character,Integer> e : map.entrySet())
		{
			if(e.getValue()>max)
			{
				min = max;
				minc = maxc;
				max = e.getValue();
				maxc = e.getKey();
			}
			else if(e.getValue()>min)
			{
				min = e.getValue();
				minc = e.getKey();
			}
		}
		System.out.println("Second highest occuring character in "+s+" is : "+minc);
	}


}
