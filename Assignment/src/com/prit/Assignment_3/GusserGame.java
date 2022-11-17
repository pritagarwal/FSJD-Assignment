package com.prit.Assignment_3;
import java.util.*;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Guesser kindly guess the number :- ");
		guessNum=scan.nextInt();
		System.out.println();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	String name;
	
	void setName(String name) {
		this.name = name;
	}
	
	int guessNum()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(name+" kindly guess the number :- ");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumberFromPlayer(Player p1,Player p2,Player p3)
	{

		numFromPlayer1=p1.guessNum();
		System.out.println();
		numFromPlayer2=p2.guessNum();
		System.out.println();
		numFromPlayer3=p3.guessNum();
		System.out.println();
	}
	void compare(Player p1,Player p2,Player p3)
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("!!! All players won the game !!!");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println(p1.name+" & "+p2.name+" won the game .");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println(p1.name+" & "+ p3.name+" won the game .");
			}
			else
			{
				System.out.println(p1.name+" won the game .");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println(p2.name+" & "+ p3.name+" won the game .");
			}
			else
			{
				System.out.println(p2.name+" won the game .");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println(p3.name+" won the game .");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}
public class GusserGame {

	public static void main(String[] args) {
		System.out.println("!!!! Welcome to Gusser Game !!!!!");
		
		Scanner sc = new Scanner(System.in);
		int i=1;
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
	    System.out.print("Enter the "+(i++)+"st Player Name :- ");
	    String str = sc.nextLine();
	    p1.setName(str);
	    
	    System.out.print("\nEnter the "+(i++)+"nd Player Name :- ");
	    str = sc.nextLine();
	    p2.setName(str);
	    
	    System.out.print("\nEnter the "+(i++)+"rd Player Name :- ");
	    str = sc.nextLine();
	    p3.setName(str);
	    System.out.println();
	    
	    
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		System.out.println("----------------------------------------------");
		u.collectNumberFromPlayer(p1,p2,p3);
		System.out.println("----------------------------------------------");
		u.compare(p1,p2,p3);

     }

 }



