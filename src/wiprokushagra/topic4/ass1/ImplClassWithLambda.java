package wiprokushagra.topic4.ass1;

public class ImplClassWithLambda{
	public static void main(String[] args) {
		
	  CharacterOccurrence co =(str,ch)->{
		  int ans=0;
		  for(char c:str.toCharArray()){
			  if(c==ch) ans++;
		  }
		  return ans;
	  };
	  
	  String str="How was your day";
	  char ch='a';
	  
	 int occ= co.findOccurence(str,ch);
	  
	  System.out.println("The number of occurence :"+ch+" will be "+occ);
	  
	  
	  String str1="Hello from the other side.";
	 
	  
	 int occ1= co.findOccurence(str1,ch);
	  
	  System.out.println("The number of occurence :"+ch+" will be "+occ1);
	  
	}
}
