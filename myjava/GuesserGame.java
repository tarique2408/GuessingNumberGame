package myjava;
import java.util.*;

class Guesser{
	int numGuesser;
	int guessingNumber()
	{
		System.out.println("Tarique ek number guess kro !! fir dekhte h kaun sahi guess kar pata h tumhara number ");
		Scanner g=new Scanner(System.in);
		numGuesser=g.nextInt();
		return numGuesser;
	}
}
class Player
{
	int guesserNumber;
	int guessingNum()
	{
		Scanner s=new Scanner(System.in);
		guesserNumber=s.nextInt();
		return guesserNumber;
	}
}

class Umpire
{
	
	int guessNum;
	void guesserNum()
	{
		Guesser g=new Guesser();
		guessNum=g.guessingNumber();
	}
	int playerNum1,playerNum2,playerNum3;
	void playerNum()
	{
		
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		System.out.println("Irfan guess kr!!");
		playerNum1=p1.guessingNum();
		System.out.println("Khalid  ab tum guess kro");
		playerNum2=p2.guessingNum();
		System.out.println("Izhar ab tumhari bari");
		playerNum3=p3.guessingNum();
		
	}
	void compareNum()
	{
		if(guessNum==playerNum1)
		{
			if(guessNum==playerNum1&&guessNum==playerNum2&&guessNum==playerNum3)
			{
				System.out.println("Aap sabhi winner ho !! badhai ");
			}
			else if(guessNum==playerNum1&&guessNum==playerNum2)
			{
				System.out.println(" Irfan and Khalid aap dono winner ho");
			}
			else if(guessNum==playerNum1&&guessNum==playerNum3)
			{
				System.out.println("Irfan and Izhar dono winner ho ");
			}
			else {
				System.out.println(" Irfan is winner");
			}
		
		}
		else if(guessNum==playerNum2)
		{
			if(guessNum==playerNum2&&guessNum==playerNum3)
			{
				System.out.println("khalid and Izhar dono winner ho");
			}
			else
			{
				System.out.println("khalid is winner");	
			}
			
		}
		else if(guessNum==playerNum3)
		{
			System.out.println("Izhar is winner");
		}
		else {
			System.out.println("No one is winner");
		}
	}
	
}


public class GuesserGame{

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.guesserNum();
		u.playerNum();
		u.compareNum();
		

	}

}

