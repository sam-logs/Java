package com.company.filehandling.session2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MainDeserialize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\output.csv"));
			PlayerDetails details = (PlayerDetails) in.readObject();
			System.out.println(details.getPlayerName()+ " "+details.getTeamName()+" "+details.getMatchesPlayed() );
			in.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
