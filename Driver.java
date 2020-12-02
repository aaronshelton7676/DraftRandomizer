import java.awt.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("WELCOME TO THE 2020 DEAN LEAGUE DRAFT LOTTERY!!!!");
		
		Scanner keyboard = new Scanner(System.in);

		
		boolean run = true;
		ArrayList<Team> teams = new ArrayList<Team>();
		ArrayList<Team> sortedTeams = new ArrayList<Team>();
		teams.add(new Team("Chevy", "Yay!!!! It's meeeeeee!!!!", "Shit......."));
		teams.add(new Team("Caleb", "Dean Boy!!!!", "Sorry Dean!!!!"));
		teams.add(new Team("Ronny", "Ronny Babyyyyyyy", "Ron, sorry ya jackass!"));
		teams.add(new Team("Dobes", "Dobler I cant belive your luck", "Sorry Bud!!!!!"));
		teams.add(new Team("Dave", "Davey Dean!! Congrats man!!", "Sorry Dave Dean!!!"));
		teams.add(new Team("Casson", "Well if he didn't win he'd have his cop buddies arrest me", "please dont sue...."));
		teams.add(new Team("Dullard", "This is rigged, stop the count", "You get what you deserve mortonite"));
		teams.add(new Team("Bradford", "Brad!!!! Congrats savior of Hyrule", "You get what you deserve mortonite"));
		teams.add(new Team("Specs", "Back-To-Back first overall picks!!!", "Well you can't always get so lucky Specs"));
		teams.add(new Team("Adam", "Well at least a Shelton won, thats worth something", "Wow, he'll find a way to fuck it up"));
		teams.add(new Team("Joko", "I hope nobody else wanted to draft james harden", "welcome to the league buddy"));
		teams.add(new Team("Peezus", "Hope those mocks helped bud!!!", "Hope those mocks helped bud!!!"));
		System.out.println("Ready to start???");
		String start1 = keyboard.nextLine();
		System.out.println("Would you like to rig this so you win automatically, Aaron?");
		String start2 = keyboard.nextLine();
		System.out.println("Are you sure?");
		String start3 = keyboard.nextLine();
		System.out.println("Fair enough, would you like to begin?");
		String start = keyboard.nextLine();
		int numTeams = 12;
		if(start.equalsIgnoreCase("Y")) {
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			System.out.println("");
			while(run) {
				pickTeam(teams,sortedTeams,numTeams);
				System.out.println("");
				System.out.println("");
				System.out.println("");

				printList(sortedTeams, teams);
				numTeams--;
				System.out.println("");
				System.out.println("");
				System.out.println("");

				if(numTeams==0) {
					System.out.println("The draft is now complete");
					System.exit(0);
					
				}else {
					System.out.println("Ready to pick another team?");
					String process = keyboard.nextLine();
					if(process.equalsIgnoreCase("n")) {
						System.exit(0);
					}
				}
			}
		}

	}
	
	private static void pickTeam(ArrayList<Team> teams, ArrayList<Team> sortedTeams, int order) throws InterruptedException {
		Random generator = new Random();
		int randomIndex = generator.nextInt(teams.size());
		Team team = teams.get(randomIndex);
		System.out.println("Processing......");
		Thread.sleep(1000);
		System.out.println("Processing......");
		Thread.sleep(1000);
		System.out.println("Processing......");
		Thread.sleep(1000);
		System.out.println("Processing......");
		Thread.sleep(1000);
		System.out.println("Processing......");
		System.out.println("");
		System.out.println("");
		System.out.println("Picking at number " + order + " is " + team.getName() + "!!!!!!");
		team.setOrder(order);
		teams.remove(randomIndex);
		sortedTeams.add(team);
		if(order ==3) {
			pickFinalTeam(teams,sortedTeams,order);
		}else {
			System.out.println(team.getMessage());

		}
		
	}
	
	private static void printList(ArrayList<Team> teams, ArrayList<Team> remainingTeams) throws InterruptedException {

		System.out.println("The order currently is:");
		ArrayList<Team> revTeams = reverseArrayList(teams);
		for(Team team:revTeams) {
			System.out.println(team.getOrder() + "." + team.getName());
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("The remaining teams are");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		for(Team team:remainingTeams) {
			System.out.println(team.getName());
		}
	}
	
	private static void printFinalList(ArrayList<Team> teams) throws InterruptedException {

		System.out.println("The order currently is:");
		ArrayList<Team> revTeams = reverseArrayList(teams);
		for(Team team:revTeams) {
			System.out.println(team.getOrder() + "." + team.getName());
		}
	}
	
	public static ArrayList<Team> reverseArrayList(ArrayList<Team> alist) 
    { 
        // Arraylist for storing reversed elements 
        ArrayList<Team> revArrayList = new ArrayList<Team>(); 
        for (int i = alist.size() - 1; i >= 0; i--) { 
  
            // Append the elements in reverse order 
            revArrayList.add(alist.get(i)); 
        } 
  
        // Return the reversed arraylist 
        return revArrayList; 
    } 
	
	private static void pickFinalTeam(ArrayList<Team> teams, ArrayList<Team> sortedTeams, int order) throws InterruptedException {
		System.out.println("And now its down to two teams!!!!!");
		for(Team team: teams) {
			System.out.println(team.getName());
			
		}		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Ready to pick the final team?");
		String next = keyboard.nextLine();
		if(next.equalsIgnoreCase("y")) {
			System.out.println("HERE WE GO!!!!");
			printSleep();
		}
		Random generator = new Random();
		int randomIndex = generator.nextInt(teams.size());
		Team team = teams.get(randomIndex);
		System.out.println("Picking at number " + " 2 " + " is " + team.getName() + "!!!!!!");
		System.out.println("");
		System.out.println("Which means!!!!!!!!");
		team.setOrder(order);
		teams.remove(randomIndex);
		sortedTeams.add(team);
		team = teams.get(0);
		System.out.println("The 2020 Dean League Basketball Draft Lottery winner is " + team.getName() + "!!!!!!");
		System.out.println(team.getFirstMessage());
		order--;
		team.setOrder(1);
		teams.remove(randomIndex);
		sortedTeams.add(team);
		System.out.println("");
		System.out.println("");
		System.out.println("");

		printFinalList(sortedTeams);
		System.exit(0);
		
		
	}
	
	private static void printSleep() throws InterruptedException {
		for(int i=0;i<999;i++) {
			System.out.println("Drumroll.......");
			Thread.sleep(10);
		}
		
	}

}
