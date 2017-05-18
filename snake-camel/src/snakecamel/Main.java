package snakecamel;

import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String s;	
		
		System.out.println("capitalizeするのはいくつありますか");
		int c = sc.nextInt();
		for(int i = 0; i < c; i++){
			System.out.println("文字を入力");
			s = sc.next();
			if(s.isEmpty()){
				System.out.println("→ "); //???空文字の場合...?
			} else {
				System.out.println("→"+scu.capitalize(s));
			}
		}
		
		System.out.println("uncapitalizeするのはいくつありますか");
		c = sc.nextInt();
		for(int i = 0; i < c; i++){
			System.out.println("文字を入力");
			s = sc.next();
			if(s.isEmpty()){
				System.out.println("→ "); //???空文字の場合...?
			} else {
				System.out.println("→"+scu.uncapitalize(s));
			}
		}
			
		System.out.println("snakeToCamelcaseするのはいくつありますか");
		c = sc.nextInt();
		for(int i = 0; i < c; i++){
			System.out.println("文字を入力");
			s = sc.next();
			System.out.println("→"+scu.snakeToCamelcase(s));
		}
		
		System.out.println("camelToSnakecaseするのはいくつありますか");
		c = sc.nextInt();
		for(int i = 0; i < c; i++){
			System.out.println("文字を入力");
			s = sc.next();
			System.out.println("→"+scu.camelToSnakecase(s));
		}
	}
}
