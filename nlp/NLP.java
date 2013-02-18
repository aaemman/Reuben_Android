package nlp;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import event.Address;

public class NLP {
	private static String command;
	private static HashMap<String, Method> prefixes = new HashMap<String, Method>();
	private static HashMap<String, Address> locations = new HashMap<String, Address>();
	private static HashMap<String, Integer> time = new HashMap<String, Integer>();
	
	public NLP(){
		try {
			//adding prefixes to hashmap and associating methods
			prefixes.put("at", NLP.class.getMethod("checkLocationTime"));
			prefixes.put("in", NLP.class.getMethod("csLocation"));
			prefixes.put("with", NLP.class.getMethod("csParticpants"));
			
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//helper for time and location prefix (prefix is the same)
	private void checkLocationTime(List splitCommand){
		if(!csTime(splitCommand)){
			csLocation(splitCommand);
			
		}
	}
	private static String[] splitCommand(String command){
		String[] splitCommand = command.split(" ");
		return splitCommand;	
	}
	
	
	private static void checkPrefix(String[] splitCommand){
		int length = splitCommand.length;
		for(int i = 0;i<length; i++){
				try {
					prefixes.get(splitCommand[i]).invoke(Arrays.asList(splitCommand).subList(i+1,length));
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
		}
	}
	
	private static boolean csTime(List splitCommand){
		return false;
		
	}
	
	private static boolean csDate(List splitCommand){
		return false;
		
	}
	
	private static boolean csTitle(List splitCommand){
		return false;
		
	}
	private static boolean csParticpants(List splitCommand){
		return false;
		
	}
	private static boolean csLocation(List splitCommand){
		return false;
		
	}
	
	
}
