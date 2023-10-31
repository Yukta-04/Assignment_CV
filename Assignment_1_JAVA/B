// B. Enter a Roman Number as input and convert it to an integer. (ex IX = 9)

import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        String s="MCMXCIV";
        Map<Character,Integer> dict= new HashMap<>(); 
        dict.put('I', 1);  
        dict.put('V', 5);  
        dict.put('X', 10);  
        dict.put('L', 50);  
        dict.put('C', 100);  
        dict.put('D', 500);  
        dict.put('M', 1000);
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            if (dict.get(s.charAt(i))>=dict.get(s.charAt(i+1))){
                ans=ans+dict.get(s.charAt(i));
            }
            else{
                ans=ans-dict.get(s.charAt(i));
            }
        }
        ans=ans+dict.get(s.charAt(s.length()-1));
        System.out.println(ans);
    }
}
