package java_dev;
import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Register {
	Scanner sc = new Scanner(System.in);
	/*
	InputStreamReader ir = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(ir);
	*/
	public String name = null;
	public String address = null;
	public String gmail = null;
	public String setName() {
		String name = null;
		boolean check = true;
		while(check) {
			System.out.print("Fullname : ");
			name = sc.nextLine();
			check = (name == null || name.length() == 0);
		}
		this.name = name;
		return name;
	}
	public String setAddress() {
		String add = null;
		boolean check = true;
		while(check) {
			System.out.print("Address : ");
			add = sc.nextLine();
			check = (add == null || add.length() == 0);
		}
		this.address = add;
		return add;
	}
	public String setGmail() {
		String gmail = null;
		boolean check = true;
		while(check) {
			System.out.print("Gmail : ");
			gmail = sc.nextLine();
			check = (gmail == null || gmail.length() == 0);
		}
		this.gmail = gmail;
		return gmail;
		
	}
	
	public ArrayList<String> getData() {
		String name = this.name;
		String address = this.address;
		String gmail = this.gmail;
		String[] dt = {name, address, gmail};
		int[] data = {name.length(), address.length(), gmail.length()}; 
	    int max = data[0];
	    int count = 0;
	    ArrayList<String> information = new ArrayList<String>();
	    for(int i = 1; i < 3; i++) {
	    	if(data[i] > max) {max = data[i];};
	    }
	    max += (max / 2);
	    for(int j = 0; j < 7; j++) {
	    	String syntax = "";
	    	if(j == 0 || j == 6) {
	    		for(int i = 0 ; i <= max; i++) {
	    		     syntax += "*";
	    	    }
	    		information.add(syntax);
	        }
	    	else if(j == 1 || j == 5) {
	    		for(int i = 0 ; i <= max; i++) {
	    	    	if(i == 0) {
	    	    		syntax += "*";
	    	    	}
	    	    	else if(i == max) {
	    	    		syntax += "*";
	    	    	}
	    	    	else {
	    	    		syntax += " ";
	    	    	}
	    	    }
	    		information.add(syntax);
	    		
	    	 }
	    	else {
	    		
	    		for(int i = 0; i <= max; i++) {
	    			if(i == 0) {
	    				syntax += "*";
	    			}
	    			else if(syntax.length() == max) {
	    				syntax += "*";
	    				break;
	    			}
	    			else if((max / 10) == syntax.length()){
	    				syntax += dt[count];
	    			}
	    			else {
	    				syntax += " ";
	    			}
	    		}
	    		count++;
	    		information.add(syntax);
	    	}
	    		
	    	}
	    System.out.println("max / 10 : " + (max / 10) + " " + max);
	    return information;	
	}
	
}
