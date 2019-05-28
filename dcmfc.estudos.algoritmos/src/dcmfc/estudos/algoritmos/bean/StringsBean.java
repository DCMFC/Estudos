package dcmfc.estudos.algoritmos.bean;

public class StringsBean {
	
	/*Given a string, find the length of the longest substring without repeating characters.*/
	public void findLenghtLongestSubstringWithoutRepeat(String inputString)
	{
		if(inputString == null || inputString.equals(""))
		{
			System.out.println("0");
			return;
		}
		
		String substring = inputString.substring(0,1);
		int maxLength = 1;
		String longestString = inputString.substring(0,1);
		char c;
		for(int i = 1; i < inputString.length(); i++)
		{
			c = inputString.charAt(i);
			
			if(substring.contains(String.valueOf(c)))
			{
				int index = substring.indexOf(String.valueOf(c));
				
				if(index == substring.length()-1)
					substring = String.valueOf(c);
				else
					substring = substring.substring(index+1).concat(String.valueOf(c));
			}
			else
				substring = substring.concat(String.valueOf(c));
			
			if(substring.length() > maxLength)
			{
				maxLength = substring.length();
				longestString = substring;
			}
		}
		
		System.out.println(String.format("Maximum: %d | Substring: %s", maxLength, longestString) );
	}
	
	public String encontrarMaiorPalindrome(String s)
	{
		
		if(s == null || s.equals(""))
			return "";
		
		String longestPalindromic = "";
		longestPalindromic = s.substring(0,1);
		String auxSubstring;
		for(int i = 0; i<s.length();i++)
		{
			for(int j = i; j < s.length(); j++)
			{
				auxSubstring = s.substring(i,j+1);	
				if(isPalindromic(auxSubstring))
				{
					if(auxSubstring.length() > longestPalindromic.length())
						longestPalindromic = auxSubstring;
				}
			}			
		}
		return longestPalindromic;
	}
	
	private boolean isPalindromic(String input)
	{
		boolean result = true;
		
        for(int i = 0; i<input.length()/2;i++)
		    if(input.charAt(i) != input.charAt(input.length()-i-1))
                return false;
        
		return result;
	}
	
	public int atoiConversion(String str)
	{
		//remove whitespace
		str = str.trim();
		int i = 1;
		String result = "";
		
		if(str.isEmpty())
			return 0;
		
		if(!Character.isDigit(str.charAt(0)) && str.charAt(0) != '-' && str.charAt(0) != '+')
			return 0;
		
		result = result + str.charAt(0);
		if(str.charAt(0) == '-' || str.charAt(0) == '+')
			if(str.length()<2 || !Character.isDigit(str.charAt(1)))
				return 0;
			else
			{
				i++;
				result = result + str.charAt(1);
			}
		
		while(i<str.length() && Character.isDigit(str.charAt(i)))
		{
			if(Integer.valueOf(result) > 0)
			{
				if(Integer.valueOf(result) > Integer.MAX_VALUE/10)
					return Integer.MAX_VALUE;
				else if(Integer.valueOf(result) == Integer.MAX_VALUE/10)
				{
					if(Integer.valueOf(str.substring(i,i+1)) >= 7)
						return Integer.MAX_VALUE;
				}
			}
			else{
				if(Integer.valueOf(result) < (Integer.MIN_VALUE/10))
					return Integer.MIN_VALUE;
				else if(Integer.valueOf(result) == Integer.MIN_VALUE/10) {
					
					if(Integer.valueOf(str.substring(i,i+1)) >= 8)
						return Integer.MIN_VALUE;
				}
				
			}
				
			result = result + str.charAt(i);
			i++;
		}
		
		return Integer.valueOf(result);
		
		
	}
	
public boolean isMatch(String s, String p) {
        
        //. matches any
        //* matches one or more
        
        while(s.length() > 0)
        {
            String pattern;
            
            if(p.length() > 0)
                pattern = separatePattern(p);
            else
                return false;
            
            p = p.substring(pattern.length());
            
            String next = null;
            
            if(p.length() > 0)
               next = p.substring(0,1);
            
            int sizeLoop = s.length()/pattern.length();
            int sizePattern = pattern.length();
        
            if(next!=null && next.equals("*"))
            {    
                for(int i = 0; i < sizeLoop; i++)
                {
                    if(s.substring(sizePattern*i,(sizePattern*i)+sizePattern).equals(pattern) || s.substring(sizePattern*i,(sizePattern*i)+sizePattern).equals("."))
                    {
                        s = s.substring((sizePattern*i)+sizePattern);
                    }
                    else
                        break;
                }
              
            }
            else
            {
                if(sizePattern <= s.length())
                {
                    if(s.substring(0,sizePattern).equals(pattern))
                    {
                        s = s.substring(sizePattern);
                    }
                    else 
                        return false;
                }
                else 
                    return false;
            }
            
        }
        
        return true;
        
    }
    
private String separatePattern(String pattern)
{
    String currentPattern = "";
            
    int sizePattern = pattern.length();
    
    if(sizePattern == 1)
        return pattern.substring(0);
    
    for(int i = 0; i < sizePattern-1; i++)
    {
        if(pattern.substring(i,i+1).equals(".") || pattern.substring(i,i+1).equals("*"))
            return currentPattern;
        else 
            currentPattern += pattern.substring(i,i+1);
            
    }
    
    if(!pattern.substring(sizePattern-1).equals(".") && !pattern.substring(sizePattern-1).equals("*"))
        currentPattern += pattern.substring(pattern.length()-1);
    
    return currentPattern;
}
}
