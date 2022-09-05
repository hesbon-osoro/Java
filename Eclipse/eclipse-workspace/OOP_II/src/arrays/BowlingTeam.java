package arrays;

import java.util.Scanner;

public class BowlingTeam {
	private String teamName;
	private String[] members = new String[4];
	public void setTeamName(String team) { 
		teamName = team;
	} 
	public String getTeamName() { 
		return teamName; 
		}
	public void setMember(int number, String name) { 
		members[number] = name;
		}
	public String getMember(int number) {
		return members[number];
		}
	public static void main(String[] args) {
		String name;
		BowlingTeam bowlTeam = new BowlingTeam(); 
		int x;
		final int NUM_TEAM_MEMBERS = 4;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter team name >> ");
		name = input.next(); 
		bowlTeam.setTeamName(name);
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x) { 
			System.out.print("Enter team member's name >> "); 
		name = input.nextLine();
		bowlTeam.setMember(x, name);
		}
		System.out.println("\nMembers of team " + bowlTeam.getTeamName());
		for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			System.out.print(bowlTeam.getMember(x) + " ");
		System.out.println();
		}
	}
