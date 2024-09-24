package org.im;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Todo {
    public static void main(String[] args) throws Exception {
    	String cmd;
    	
    	Scanner in=new Scanner(System.in);
    	 // Adding tasks 
        List<String> tasks = new ArrayList();String task1,task2,task3;
        do {
        System.out.print("Enter command(add,display,remove,update,exit):");cmd=in.nextLine();
        switch(cmd.toLowerCase()) {
        case "add":
        do {	
       
        System.out.print("\nEnter Task name or 'e' to finish:"); task1=in.nextLine();
        if(!task1.equalsIgnoreCase("e")) {
        tasks.add(task1.substring(0,1).toUpperCase()+task1.substring( 1).toLowerCase());
        }
        }while(!task1.equalsIgnoreCase("e"));
      
        
        
        break;
        case "display":
        //Displaying tasks
        System.out.println("To-Do List:-"); int no=1;
        for (String task : tasks) {
            System.out.println(no+". "+task);
            no++;
        }
        break;
        case "remove":
        //Removing  task 
        System.out.print("\nEnter task S.no. for remove:");int re=in.nextInt(); in.nextLine(); re--;   
        if(re>=0 &&re<tasks.size())
        {
        	System.out.println("\nRemoved task: " + tasks.remove(re)); 
        	
        }
        break;
        case "update":
        //Updating task
        System.out.print("\nEnter Task S.no. to modify:");int up=in.nextInt();  in.nextLine(); up--;
     	if(up>=0 && up<tasks.size())
     	{
     		System.out.println("Enter New Task name to Moditify:");String upt=in.nextLine();
     		tasks.set(up,upt.substring(0,1).toUpperCase()+upt.substring(1).toLowerCase());
     		System.out.println("Task was Updated! :)");
     	}
     	else
     	{
     		System.out.println("Invalid S.no. :(");
     	}
     	
   break;
        case"exit":System.out.println("\t\tExiting.....");Thread.sleep(2000);System.out.println("\t*********BYE---BYE----BYEE***********");break;
        default:
        System.out.println("Invalid Command :(");
       }
      }while(!cmd.equalsIgnoreCase("exit"));
    }
}

