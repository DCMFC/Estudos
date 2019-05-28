package dcmfc.estudos.algoritmos.bean;

public class IntegerBean {
	
public int reverse(int x) {
        
        try{
        
            String result = "";
            String sinal = "";
            String input = String.valueOf(x);
            int finalResult;

            if(x<0)
            {
                sinal = "-";
                input = input.substring(1);
            }
            for(int i=0; i<input.length(); i++)
                result = input.charAt(i) + result;

            result = sinal+result;
            
            finalResult = Integer.valueOf(result);
            return finalResult;
        }
        catch(Exception ex)
        {
            return 0;
        }
        
         
    }

public int reverseMath(int x) {
    
	try{
        
        int result;
        int finalResult;
        
        finalResult = x%10;
        x = x/10;
        
        if(x==0)
            return finalResult;
            
        while(x != 0){
            result = x % 10;
            x = x/10;

            if(checkOverflow(finalResult))
                return 0;

            finalResult = finalResult*10 + result;
        }

 
        return finalResult;
    }
    catch(Exception ex)
    {
        return 0;
    }
    
     
}

private boolean checkOverflow(int input)
{
    if(input > 0 && input >= Integer.MAX_VALUE/10)
        return true;
    
    if(input < 0 && input <= Integer.MIN_VALUE/10)
        return true;

    return false;
}

}
