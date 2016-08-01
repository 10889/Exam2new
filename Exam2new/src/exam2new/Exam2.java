package exam2new;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		double w=0;
		
		System.out.println( "请输入工资：" );
        Scanner q = new Scanner(System.in);
        String e = q .nextLine();
        w = Integer.parseInt(e, 10);
        if(w<1500){
        	System.out.println( "税收为:"+w*0.3 );
        }
        else if(w<4500){
        	System.out.println( "税收为:"+(w*0.3+(w-3000)*0.1 ));
        }
        else if(w<9000){
        	System.out.println( "税收为:"+(w*0.3+(w-3000)*0.1+(w-4500)*0.2));

	}
        else if(w<35000){
        	System.out.println( "税收为:"+(w*0.3+(w-3000)*0.1+(w-4500)*0.2+(w-9000)*0.25));

	}
        else if(w<55000){
        	System.out.println( "税收为:"+(w*0.3+(w-3000)*0.1+(w-4500)*0.2+(w-9000)*0.25+
        			(w-35000)*0.3));

	}
        else if(w<80000){
        	System.out.println( "税收为:"+(w*0.3+(w-3000)*0.1+(w-4500)*0.2+(w-9000)*0.25+
        			(w-35000)*0.3+(w-55000)*0.35));
}
        else{
        	System.out.println( "税收为:"+(w*0.3+(w-3000)*0.1+(w-4500)*0.2+(w-9000)*0.25+
        			(w-35000)*0.3+(w-55000)*0.35+(w-80000)*0.45));
}
	}
}





