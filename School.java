package java_dev;
import java.util.*;

public class School extends Register{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Register rg = new Register();
		String name = rg.setName();
		String addr = rg.setAddress();
		String gmail = rg.setGmail();
        ArrayList<String> arr = rg.getData();
        for(int i = 0; i < arr.size(); i++) {
        	System.out.println(arr.get(i));
        }
	}

}
