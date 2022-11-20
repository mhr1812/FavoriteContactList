/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daa;

import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Nitu
 */
public class DAA {

    PriorityQueue<Contact> usersContacts = new PriorityQueue<>();
    PriorityQueue<Contact> usersPlaceHolder = new PriorityQueue<>();
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        DAA main = new DAA();
        main.start();
    }

    void start() {
        System.out.println("OPENING YOUR CONTACT-List");
        System.out.println("======================");
        menu();
    }

    void menu() {
        System.out.print("\nWhat do you want to perform? \nA:Add Contact \nE:Edit Contact \nN:Next Contact \nL:List All Contacts \nV:View Contact \nR:Remove Contact \nQ:Quit \nEnter your choice: ");
        try
        {
            switch (scanner.nextLine().toLowerCase().charAt(0))
            {
                case 'a' : 
                    add(); 
                    break;
                    
                case 'e' : 
                    edit(); 
                    break;
                    
                case 'n' : 
                    next(); 
                    break;
                    
                case 'l' : 
                    list(); 
                    break;
                    
                case 'v' : 
                    view(); 
                    break;
                    
                case 'r' : 
                    remove(); 
                    break;
                    
                case 'q' : 
                    quit(); 
                    break;
                    
                default:
                    printErrorMessage("Not a valid value");
                    menu();
            }
        }
        catch(StringIndexOutOfBoundsException error)
        {
            printErrorMessage("Please enter an value");
            menu();
        }
    }

    void add() {
        usersContacts.add(new Contact(getIdFromUser(),getContactNumberInput(),getContactFirstNameInput(),getContactLastNameInput(),getTaskPriorityInput()));
        System.out.println("Contact successfully added!");
        menu();
    }
    void edit() {
        int selectedId = getIdFromUser();
        for(Contact contact : usersContacts)
        {
            if(contact.getId() == selectedId)
            {
                System.out.print("What do you want to edit? (F:First Name, L:Last Name, N:Mobile Number, P:Priority) : ");
                try
                {
                    switch (scanner.nextLine().toLowerCase().charAt(0))
                    {
                        case 'f' : 
                            editFirstName(contact); 
                            break;
                           
                        case 'l' : 
                            editLastName(contact); 
                            break;
                            
                        case 'n' : 
                            editNumber(contact); 
                            break;
                            
                        case 'p' : 
                            editContactPriority(contact); 
                            break;
                           
                        default:
                            printErrorMessage("Not a valid value");
                            edit();
                    }

                    System.out.println("Contact successfully edited!");
                    menu();
                }
                catch(StringIndexOutOfBoundsException error)
                {
                    printErrorMessage("Please enter an value");
                    edit();
                }
            }
        }
    }
    void next() {
        if(!usersContacts.isEmpty())
        {
            System.out.println(usersContacts.peek().toString());
        }
        else
        {
            printErrorMessage("There are no tasks in your list");
        }

        menu();
    }
    void list() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        if(!usersContacts.isEmpty())
        {
            while(!usersContacts.isEmpty())
            {
                Contact contact = usersContacts.poll();
                System.out.println(contact);
                usersPlaceHolder.add(contact);
            }

            while(!usersPlaceHolder.isEmpty())
            {
                Contact contact = usersPlaceHolder.poll();
                usersContacts.add(contact);
            }
        }
        else
        {
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        menu();
    }
    void view() {
        int id = getIdFromUser();
        for(Contact contact : usersContacts)
        {
            if(contact.getId() == id)
            {
                System.out.println(contact.toString());
                menu();
                return;
            }
        }

        printErrorMessage("Contact doesn't exist");
        menu();
    }
    void remove() {
        int id = getIdFromUser();
        for(Contact contact : usersContacts)
        {
            if(contact.getId() == id)
            {
                usersContacts.remove(contact);
                System.out.println("Contact successfully removed!");
                menu();
                return;
            }
        }

        printErrorMessage("Contact doesn't exist");

        menu();
    }
    void quit() {
        System.out.println("======================");
        System.out.println("CLOSING YOUR CONTACT-List");
        System.exit(0);
    }
    int getIdFromUser() {
        System.out.print("Please enter contact id: ");
        if(scanner.hasNextInt())
        {
            int id = scanner.nextInt();
            scanner.nextLine();
            return id;
        }
        else
        {
            printErrorMessage("Contact id must be a number");
            return getIdFromUser();
        }
    }
    String getContactNumberInput(){
        System.out.print("Please enter contact's mobile number : ");
        String input = scanner.nextLine();
        if(!input.replace(" " , "").isEmpty())
        {
            return input;
        }
        else
        {
            printErrorMessage("Contact's number can't be left empty");
            return getContactNumberInput();
        }
    }

    String getContactFirstNameInput() {
        System.out.print("Please enter contact's first name : ");
        String input = scanner.nextLine();
        if(!input.replace(" " , "").isEmpty())
        {
            return input;
        }
        else
        {
            printErrorMessage("Contact's name can't be left empty");
            return getContactFirstNameInput();
        }
    }
    
    String getContactLastNameInput() {
        System.out.print("Please enter contact's last name : ");
        String input = scanner.nextLine();
        if(!input.replace(" " , "").isEmpty())
        {
            return input;
        }
        else
        {
            printErrorMessage("Contact's name can't be left empty");
            return getContactLastNameInput();
        }
    }
    Priority getTaskPriorityInput() {
        System.out.print("Please enter contact priority (F:Favorite, G:General) : ");
        try
        {
            switch (scanner.nextLine().toLowerCase().charAt(0))
            {
                case 'f' : 
                    return Priority.FAVORITE;
                    
                case 'g' : 
                    return Priority.GENERAL;
                    
                default:
                    printErrorMessage("Not a valid value");
                    return getTaskPriorityInput();
            }
        }
        catch(StringIndexOutOfBoundsException error)
        {
            printErrorMessage("Please enter an value");
            return getTaskPriorityInput();
        }
    }

    void editFirstName(Contact contact) {
        contact.setFname(getContactFirstNameInput());
    }
    
    void editLastName(Contact contact) {
        contact.setLname(getContactLastNameInput());
    }
    
    void editContactPriority(Contact contact) {
        contact.setPriority(getTaskPriorityInput());
    }
    
    void editNumber(Contact contact) {
        contact.setNumber(getContactNumberInput());
    }

    void printErrorMessage(String message) {
        System.out.println("[ERROR] >> " + message + "\n");
    }
    
}
