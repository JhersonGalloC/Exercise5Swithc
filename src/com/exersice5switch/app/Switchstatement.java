package com.exersice5switch.app;
import java.util.Scanner;
public class Switchstatement {

	public static void main(String[] args) 
	
	{
		int nMes=0;
		char answer='s';
		
		//object construction
		Scanner input = new Scanner(System.in);
		
		//Input data validation
		
		while(nMes<=0)
		{
			System.out.println("Dame un umero de mes (Solo valores positivos): ");
		
		nMes = input.nextInt();
		
		if(nMes<=0) {

			System.out.println("Dato No VALIDO");
		}
		}
		switch(nMes)
		{
		case 1: System.out.println("Juanuary");
		break;
		case 2: System.out.println("february");
		break;
		case 3: System.out.println("March");
		break;
		case 4: System.out.println("April");
		break;
		case 5: System.out.println("May");
		break;
		case 6: System.out.println("Jun");
		break;
		case 7: System.out.println("July");
		break;
		case 8: System.out.println("Agosto");
		break;
		case 9: System.out.println("Septiembre");
		break;
		case 10: System.out.println("octubre");
		break;
		case 11: System.out.println("Novimienre");
		break;
		case 12: System.out.println("diciembtre");
		break;	
		default: System.out.println("Number of month not valid!!");
		}
		System.out.println("Do you ha another month? (y/n)");
		answer =input.next().charAt(0);
	
				
	}

}