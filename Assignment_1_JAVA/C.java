// C. Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)


public class Main {
    
    public static void main(String[] args) {
      String s="Aabcdefghiijklmlnopqrstuvwxy";
      boolean isPanagram=true;
      s=s.toLowerCase();
        for(char ch='a';ch<='z';ch++){
            if (!s.contains(String.valueOf(ch))){
                isPanagram=false;
                break;
            }
    
        }
        if (isPanagram){
            System.out.print("Given input is a Panagram");
        }
        else{
            System.out.print("Given input not a panagram");
            
        }
        
        
    }
}
