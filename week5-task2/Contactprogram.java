package task2;
import javax.imageio.IIOException;
import javax.swing.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;
class Personsinfo{
	String name;
	String address;
	String phoneNumber;
	
	Personsinfo(String n , String a,String p)
	{
		name=n;
		address=a;
		phoneNumber=p;
	}
	void display()
	{
		JOptionPane.showMessageDialog(null,"Name :"+name+"\nAddress :"+address+"\nPhoneNumber :"+phoneNumber);
		
	}
}
class AddressBook<FileWritter, PrintWritter>{
	ArrayList persons;
	AddressBook()
	{
		persons=new ArrayList();
		loadPerson();
	}
	void addPerson() {
		String name=JOptionPane.showInputDialog("enter your  Name: ");
		String add=JOptionPane.showInputDialog("enter your Address: ");
		String pNo=JOptionPane.showInputDialog("enter your PhoneNumber: ");
		Personsinfo p=new Personsinfo(name, add, pNo);
		persons.add(p);
		
	}
	void searchperson(String n)
	{
		for(int i=0;i<persons.size();i++)
		{
			Personsinfo p=(Personsinfo) persons.get(i);
			if(n.equals(p.name))
			{
				p.display();
				JOptionPane.showMessageDialog(null, "Success");
			}
			
		}

	}
	void deletePerson(String n)
	{
		for(int i=0;i<persons.size();i++)
		{
			Personsinfo p=(Personsinfo) persons.get(i);
			if(n.equals(p.name))
			{
				persons.remove(i);
				JOptionPane.showMessageDialog(null, "Success");
			}
		}
	}
	 void savePerson()
	{
		try {
			Personsinfo p;
		String line;
		FileWriter fw=new FileWriter("personsdetails.txt");
		PrintWriter pw=new PrintWriter(fw);
		 
		for(int i=0;i<persons.size();i++)

		{
			p=(Personsinfo)persons.get(i);
			line=p.name+","+p.address+","+p.phoneNumber;
		}
		pw.close();
		pw.flush();
		fw.close();
		
		}
		catch(IOException ioEx)
		{
			System.out.println(ioEx);
		}
	}
     void loadPerson()
     {
    	 String token[]=null;
    	 String  name,add,ph;
    	 try {
    		 
    		 FileReader fr=new FileReader("personsdetails.txt");
    		 BufferedReader  br= new BufferedReader (fr);
    		 String line=br.readLine();
    		 while(line!=null)
    		 {
    			 token=line.split(",");
    			 name=token[0];
    			 add=token[1];
    			 ph=token[2];
    			 Personsinfo p=new Personsinfo(name, add, ph);
    			 persons.add(p);
    			 line=br.readLine();
    			 
    		 }
    		 br.close();
    		 fr.close();
    	 }
    	 catch(IOException ioEx)
    	 {
    		 System.out.println(ioEx);
    	 }
     }
	
}
class Contactprogram{
	public static void main(String[] args) {
		AddressBook ab=new AddressBook();
		String contact,s;
		int ch;
		while(true) {
			contact=JOptionPane.showInputDialog("Enter 1 to add\n Enter 2 to search\n Enter 3 to delete\n Enter 4 to exit");
			ch=Integer.parseInt(contact);
			switch(ch)
			{
			case 1:
				ab.addPerson();
				break;
			case 2:
				s=JOptionPane.showInputDialog("enter to search");
				ab.searchperson(s);
				break;
			case 3:
				s=JOptionPane.showInputDialog("enter to delete");
				ab.deletePerson(s);
				break;
			case 4:
				ab.savePerson();
				System.exit(0);
			}
		}
		
		
	}

}
