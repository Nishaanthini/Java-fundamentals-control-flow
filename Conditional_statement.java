import java.util.*;
public class Conditional_statement
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		 
		 
		//if statement
		
		if(num>0){
		    System.out.println("Positive");
		}
		else if(num==0){
		    System.out.println("Zero");
		}
		else{
		    System.out.println("Negative");
		}
		
		
		//Switch case
		
		switch(num){
		    case 1:{
		        System.out.println("Sunday");
		        break;
		    }
		    case 2:{
		        System.out.println("Monday");
		        break;
		    }
		    case 3:{
		        System.out.println("Tuesday");
		        break;
		    }
		    case 4:{
		        System.out.println("Wednesday");
		        break;
		    }
		    case 5:{
		        System.out.println("Thursday");
		        break;
		    }
		    case 6:{
		        System.out.println("Friday");
		        break;
		    }
		    case 7:{
		        System.out.println("Saturday");
		        break;
		    }
		    default:
		        System.out.println("Invalid Number");
		}
		
		
		//for loop

		if(num>0){
			for(int i=1;i<=num;i++){
				System.out.print(i+" ");
			}
			System.out.println();
		}

		
		//while loop

		if(num>0){
			while(num!=0){
				System.out.print(num+" ");
				num--;
			}
			System.out.println();
		}
		
		
		//do while
		
		int n=1;
		do{
		    System.out.print(n+" ");
		    n++;
		    }while(n<=3);
		    
	}
}