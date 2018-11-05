package com.CI284.Assessment.IT_ticketing_system;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) 
	{
		// Setting Heap size to a limit of 25
		Heap heap = new Heap(25);
		boolean runProgram = true;

		// Ticket set creation
		Ticket id010010 = new Ticket("Marc", "Walker", "Network Issue", "Gates", 2);
		Ticket id330060 = new Ticket("Luke", "Davison", "New Computer Configuration", "Gosling", 4);
		Ticket id789012 = new Ticket("Rowan", "Spencer", "Hardware Issue", "Carmack", 3);
		Ticket id453178 = new Ticket("Charly", "Zhu", "Login Problems", "Walker", 3);
		Ticket id666111 = new Ticket("Eli", "Gold", "Account Hacked", "Jobs", 1);
		Ticket id111234 = new Ticket("Gerry", "McDonell", "Lost Password", "Gosling", 4);
		Ticket id975310 = new Ticket("Tyrone", "Mucassa_Wallace", "Network Issue", "Gates", 2);
		Ticket id678104 = new Ticket("Shane", "Butt", "Software crash", "Gates", 2);
		Ticket id288651 = new Ticket("James", "Shaw", "Account compromised", "Jobs", 1);
		Ticket id444441 = new Ticket("Timur", "Nurtayev", "Software/app installation", "Carmack", 3);
		Ticket id012012 = new Ticket("Joe", "Taylor", "Lost Password", "Walker", 4);
		Ticket id327060 = new Ticket("Jessica", "Roberts", "Software crash", "Gates", 2);
		Ticket id689012 = new Ticket("Lianne", "Williams", "Website failure", "Jobs", 1);
		Ticket id453138 = new Ticket("Elizabeth", "Jones", "Login Problems", "Gosling", 4);
		Ticket id616111 = new Ticket("Bob", "Dexter", "Login Problems", "Gosling", 4);
		Ticket id181234 = new Ticket("Patick", "Peter", "Account hacked", "Jobs", 1);
		Ticket id275310 = new Ticket("Curtis", "George", "Network Issue", "Gates", 2);
		Ticket id628104 = new Ticket("Shawn", "Masters", "Software download", "Walker", 2);
		Ticket id208651 = new Ticket("Jameson", "Simone", "Account compromised", "Jobs", 1);
		Ticket id456441 = new Ticket("Hillary", "Goldsack", "Software/app installation", "Carmack", 3);

		// Inserting tickets into heap
		heap.insert(id010010);
		heap.insert(id330060);
		heap.insert(id789012);
		heap.insert(id453178);
		heap.insert(id666111);
		heap.insert(id111234);
		heap.insert(id975310);
		heap.insert(id678104);
		heap.insert(id288651);
		heap.insert(id444441);
		heap.insert(id012012);
		heap.insert(id327060);
		heap.insert(id689012);
		heap.insert(id453138);
		heap.insert(id616111);
		heap.insert(id181234);
		heap.insert(id275310);
		heap.insert(id628104);
		heap.insert(id208651);
		heap.insert(id456441);

		// Output to show structure of heap before and after deletion of root Ticket
		// All works, root node is always the lowest valued severity in ticket
		
		while (runProgram != false) 
		{
			System.out.println();
			System.out.println("WELCOME TO THE IT TICKET MACHINE: ");
			System.out.println();
			System.out.println("/////////////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println();
			System.out.println("Press N: Create a new Ticket");
			System.out.println("Press D: Delete top Ticket");
			System.out.println("Press X: End program");
			System.out.println("Press P: Print entire Ticket List");
			System.out.println();

			Scanner menuChoice = new Scanner(System.in);
			char choice = menuChoice.next().charAt(0);
			choice = Character.toUpperCase(choice);
			
			switch (choice) 
			{
			
				case 'N': 
				{
					Ticket ticket = new Ticket(null, null, null, null, 0);
					Scanner fName = new Scanner(System.in);
					Scanner lName = new Scanner(System.in);
					Scanner pType = new Scanner(System.in);
					Scanner owner = new Scanner(System.in);
					Scanner number = new Scanner(System.in);

					System.out.print("First name: ");
					String input = fName.nextLine();
					ticket.setFirstName(input);

					System.out.print("Last name: ");
					input = lName.nextLine();
					ticket.setLastName(input);

					System.out.print("Issue type: ");
					input = pType.nextLine();
					ticket.setIssueType(input);

					System.out.print("To be fixed by: ");
					input = owner.nextLine();
					ticket.setIssueType(input);

					System.out.print("Severity Level: ");
					int severityLevel = number.nextInt();
					ticket.setSeverity(severityLevel);
					
					heap.insert(ticket);
					break;
				}
				
				case 'P':
				{
					heap.printHeap();
					break;
				}
				
				case 'X':
				{
					System.out.println("Goodbye");
					runProgram = false;
					break;
				}
				
				case 'D':
				{
					System.out.println("Deleted the root Ticket");
					heap.delete(0);
					break;
				}
				
				default:
				{
					System.out.println("Please put in a valid option");
					break;
				}
			}
		}
	}
}
