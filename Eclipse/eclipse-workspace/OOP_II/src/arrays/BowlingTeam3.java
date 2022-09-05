package arrays;


import java.util.Scanner;

public class BowlingTeam3 {
	static final int NUM_TEAMS = 4;
	static BowlingTeam3[] teams = new BowlingTeam3[NUM_TEAMS];
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
		BowlingTeam3 bowlTeam = new BowlingTeam3(); 
		String name;
		Scanner input = new Scanner(System.in);
		int x,y; 
		
		for(y = 0; y < NUM_TEAMS; ++y) {
			teams[y] = new BowlingTeam3();
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
		System.out.print("\n\nEnter a team name to see its roster >> "); 
		name = input.nextLine();
		for(y = 0; y < teams.length; ++y)
			if(name.equals(teams[y].getTeamName()))
				for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			System.out.print(teams[y].getMember(x) + " ");
		System.out.println();
	}

}



