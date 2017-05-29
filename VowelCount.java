import java.io.*;
import java.util.*;

public class VowelCount {
  public static void main(String[] args) {

    int vowelCount = 0;
    Console console = System.console();
    System.out.println("I count vowels in phrases. Say anything!");
    String userResponse = console.readLine();
    String vowels = "aeiou";
    for (int i = 0; i<= userResponse.length(); i++){
      if (userResponse(i) == "a"){
        System.out.println("Vowel");
      }
    }







    // if (userResponse.matches("[a,e,i,o,u]")){
    //   System.out.println("Vowel found");
    //   vowelCount++;
    // }



    // char[] userArray = userResponse.toCharArray();
    //
    // for (char letter : userArray) {
    //   if (letter.matches(".*[aeiou].*")) {
    //     vowelCount++;
    //   }
    // }

    System.out.println(vowelCount);

  }
}
