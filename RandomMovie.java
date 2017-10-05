import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class RandomMovie {
	
	 public static void main(String[] args){
		
		Scanner sc= new Scanner(System.in);
		
		
		String [] choices = {" Horror ", " Comedy" , "Romance", " Childrens" , " Action " , " Adventure" , "Drama" , " Independent", " Sci-Fi & Fantasy", "Thriller"};
		 
		Random rand= new Random();
		
		int poop =  JOptionPane.showConfirmDialog(null, "Why are you bothering me ?? Probably cause you can't choose a movie genre, huh? Well then Click Yes if you need my help!", "Movie Choice", JOptionPane.YES_NO_OPTION);
		
		
		if(poop== JOptionPane.YES_OPTION){
			
		int selection = rand.nextInt(choices.length);
		JOptionPane.showMessageDialog(null, " The genre of movie you should watch is :  "+ choices[selection] );
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Well then Good Luck!");
			System.exit(0);
		}
}
}
