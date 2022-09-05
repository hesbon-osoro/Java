package arrays;

import java.util.Scanner;

public class BowlingTeam2 {
	static final int NUM_TEAMS = 4;
	static BowlingTeam2[] teams = new BowlingTeam2[NUM_TEAMS];
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
		final int NUM_TEAM_MEMBERS = 4;
		BowlingTeam2 bowlTeam = new BowlingTeam2(); 
		String name;
		Scanner input = new Scanner(System.in);
		int x,y; 
		
		for(y = 0; y < NUM_TEAMS; ++y) {
			teams[y] = new BowlingTeam2();
			System.out.print("Enter team name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);
			
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x) { 
				System.out.print("Enter team member's name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
				} 
		}
		for(y = 0; y < NUM_TEAMS; ++y) {
			System.out.println("\nMembers of team " + teams[y].getTeamName()); 
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x) 
				System.out.print(teams[y].getMember(x) + " "); 
			System.out.println();
			}

	}

}

