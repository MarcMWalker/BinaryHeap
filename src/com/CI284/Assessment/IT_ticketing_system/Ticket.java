package com.CI284.Assessment.IT_ticketing_system;

public class Ticket 
{
	private String firstName;
    private String lastName;
    private String owner;
    private String issue;
    private int severityLevel;
    
    //Constructs ticket object
    public Ticket(String firstName, String lastName, String issue, String owner, int severityLevel) 
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.owner = owner;
    	this.issue = issue;
    	this.severityLevel = severityLevel;
    }
    
    //Returns first name in ticket object
    public String getFirstName() {return firstName;}
    
    //Sets string for variable firstName
    public void setFirstName(String firstName) {this.firstName = firstName;}
    
    //Returns last name in ticket object
    public String getLastName() {return lastName;}
    
    //Sets string for variable lastName
    public void setLastName(String lastName) {this.lastName = lastName;}
    
    //Return person/owner to fix problem
    public String getOwner() {return owner;}
    
    //Sets who the owner/person to fix issue
    public void setOwner(String owner){this.owner = owner;}
    
    //Returns the issue type
    public String issueType() {return issue;}
    
    //Set issue type
    public void setIssueType(String issueType){this.issue = issueType;}
    
    //Returns severity level variable
    public int severityType(){return severityLevel;}
    
    //Sets severityLevel variable
    public void setSeverity(int severityLevel){this.severityLevel = severityLevel;}
    
    //Prints receipt of ticket object details
    public void printTicketDetails(Ticket ticket)
    {
    	System.out.println("((Ticket details)) " + "\n" + "\n" + "Name: " + firstName + " " + lastName + "\n" + 
    			"Issue: " + issue + "\n" + "To be fixed by: " + owner + "\n" + "Severity type: " + severityLevel + "\n");
    }
    
    //Prints details of ticket for program rather than ticket objects
    public String toString() 
    {
        return "((Ticket)) " +
                "First Name: " + "'" + firstName + "'" +
                ", Last Name: " + "'" + lastName + "'" +
                ", Severity Type: " + "'" + severityLevel + 
                "'" + ", Issue: " + "'" + issue + "'" + 
                ", Owner: " + "'" + owner + "'" + '\n';
    }
}
