// package Lap3.common;

// import java.util.HashMap;
// import java.util.LinkedHashMap;
// import java.util.Map;
// import java.util.StringTokenizer;

// public class Algorithms {
// private Map<Character, Integer> charCounter = 
//             new HashMap<>();
//      private Map<String, Integer> wordCounter =
//             new HashMap<>();

// public  void countCharacter(String content) {
//         for (char ch : content.toCharArray()) {
//             if (Character.isSpaceChar(ch)) continue;
//             if (!charCounter.containsKey(ch)) {
//                 charCounter.put(ch, 1);
//             } else {
//                 charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
//             }
//         }
//         System.out.println(charCounter);
//     }
    
//     public void countLetter(String content){
//          StringTokenizer tokenizer = new StringTokenizer(content);
//         while (tokenizer.hasMoreTokens()) {
//             String token = tokenizer.nextToken();
//             if (!wordCounter.containsKey(token)) {
//                 wordCounter.put(token, 1);
//             } else {
//                 wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
//             }
//         }
//         System.out.println(wordCounter);
//     }

//  }

