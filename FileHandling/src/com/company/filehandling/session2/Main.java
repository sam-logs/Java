package com.company.filehandling.session2;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		try {
			System.out.println("Enter number of items: ");
			int n = sc.nextInt();
			for (int i = 0; i < n; i++) {
				System.out.println("Enter player name: ");
				String playerName = sc.next();
				System.out.println("Enter team name: ");
				String teamName = sc.next();
				System.out.println("Enter matches played: ");
				int matchesPlayed = sc.nextInt();

				PlayerDetails obj = new PlayerDetails(playerName, teamName, matchesPlayed);
				try {
					// FileOutputStream fout = new FileOutputStream(new
					// File("C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\output.csv"));
					// ObjectOutputStream out = new ObjectOutputStream(fout);
					FileOutputStream fout = new FileOutputStream(
							"C:\\Users\\Saumya.Prabhakar\\Documents\\Folder\\output.csv");
					BufferedOutputStream bout = new BufferedOutputStream(fout);

					//byte b[] = obj.getMatchesPlayed()+obj.getPlayerName()+obj.getTeamName();

					//pw.close();
				} catch (Exception e) {
					System.out.println(e);
				}

			}
			System.out.println("Success");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
