package dcmfc.estudos.algoritmos.bean;

import java.math.BigInteger;

import dcmfc.estudos.algoritmos.dominio.ListNode;

public class ListaEncadeadaBean {
	
	/*Somar dois numeros e retornar como uma lista encadeada*/
	public ListNode somarDoisNumeros(ListNode l1, ListNode l2)
	{
ListNode result = null;
		
		String numberL1 = "";
        String numberL2 = "";
 
        while(l1 != null)
        {        	
            numberL1 = Integer.toString(l1.getVal())+numberL1;
            l1 = l1.next;
        }
        
        while(l2 != null)
        {
        	numberL2 = Integer.toString(l2.getVal()) + numberL2;
            l2 = l2.next;
        }
        
        BigInteger r1 = new BigInteger(numberL1);
        BigInteger r2 = new BigInteger(numberL2);
        BigInteger sum = r1.add(r2);
        
        String sumString = String.valueOf(sum);
       
        int stringSize = sumString.length();
        result = new ListNode(Integer.valueOf(sumString.substring(stringSize-1)));
        
        ListNode lastList = result;
        for(int i = 1; i < sumString.length(); i++)
        {
        
            lastList.next = new ListNode(Integer.valueOf(sumString.substring(stringSize-(i+1),stringSize-i)));
            lastList = lastList.next;
        }
		
		return result;
	}

}
