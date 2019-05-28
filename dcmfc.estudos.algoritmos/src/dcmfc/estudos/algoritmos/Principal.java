package dcmfc.estudos.algoritmos;

import java.util.ArrayList;
import java.util.List;

import dcmfc.estudos.algoritmos.bean.ArrayBean;
import dcmfc.estudos.algoritmos.bean.IntegerBean;
import dcmfc.estudos.algoritmos.bean.ListaEncadeadaBean;
import dcmfc.estudos.algoritmos.bean.StringsBean;
import dcmfc.estudos.algoritmos.dominio.ListNode;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("##########Estudos de Algoritmos##############");
		
		StringsBean stringBean = new StringsBean();
		stringBean.isMatch("ab", ".*");
		
		/*stringBean.findLenghtLongestSubstringWithoutRepeat("aabaab!bb");
		
		String palindrome = stringBean.encontrarMaiorPalindrome("abb");
		System.out.println(palindrome);
		
		System.out.println(stringBean.atoiConversion("2147483646"));
		
		ListaEncadeadaBean listaEncadeadaBean = new ListaEncadeadaBean();
		
		ListNode valor1 = new ListNode(8);
		ListNode valor2 = new ListNode(9);
		ListNode valor3 = new ListNode(9);
		ListNode valor4 = new ListNode(2);
		
		valor2.next = valor3;
		valor1.next = valor2;
		listaEncadeadaBean.somarDoisNumeros(valor1, valor4);

		ArrayBean arrayBean = new ArrayBean();
		
		int[] x1 = new int[1];
		int[] x2 = new int[2];
		
		x1[0] = 3;
		x2[0] = -2;
		x2[1] = -1;
		
		arrayBean.findMedianSortedArrays(x1, x2);
		
		IntegerBean integerBean = new IntegerBean();
		System.out.println(integerBean.reverseMath(1463847412));*/
		
	}

}
