package Lap3.controller;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;


import Lap3.common.Library;
import Lap3.view.Menu;
   
public class Count extends Menu<String> {
    
    static String[] mc = {"Letter count "," Charater Count", "Exit"};
    String str;
    Library library;
  

    public Count() {
        super("PROGRAMMING", mc);
        library = new Library();
        str = library.getString("Input string: ");
    }
    
    public void execute(int n) {
        switch (n) {
            case 1:
               countLetter(str);;
                break;
            case 2:
                str = str.replaceAll("\\s+", "");
               countCharacter(str);
                break;
            case 3:
                System.exit(0);
        }
    }

 private Map<Character, Integer> charCounter = 
            new HashMap<>();
            //chua key va value, key o day la cac ki tu,  value laf kieu int de dem
            
     private Map<String, Integer> wordCounter =
            new HashMap<>();
            
public void countCharacter(String content) {
        for (char ch : content.toCharArray()) {
           // chuoi thnah mang ki tu
            if (Character.isSpaceChar(ch)) continue;
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
                // get(ch) lay value de cong len 1
            }
        }
        System.out.println(charCounter);
    }
    
    public void countLetter(String content){
         StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }
        System.out.println(wordCounter);
    }
   
}


// countCharacter(String content): Phương thức này được sử dụng để đếm số lần xuất hiện của mỗi ký tự trong chuỗi content. Cụ thể:

// Một HashMap được sử dụng để lưu trữ ký tự và số lần xuất hiện của nó. Map này được gọi là charCounter.
// Phương thức lặp qua từng ký tự trong chuỗi content bằng cách sử dụng vòng lặp for-each.
// Mỗi ký tự được kiểm tra xem có phải là khoảng trắng không bằng cách sử dụng Character.isSpaceChar(ch). 
//Nếu là khoảng trắng, việc đếm không được thực hiện và lặp qua ký tự tiếp theo.
// Nếu ký tự không tồn tại trong charCounter, nó sẽ được thêm vào charCounter với số lần xuất hiện là 1.
// Nếu ký tự đã tồn tại trong charCounter, số lần xuất hiện của nó sẽ tăng lên 1.
// Cuối cùng, sau khi xử lý toàn bộ chuỗi content, charCounter sẽ chứa thông tin về số lần xuất hiện của mỗi ký tự trong chuỗi, và nó sẽ được in ra màn hình.
// countLetter(String content): Phương thức này được sử dụng để đếm số lần xuất hiện của mỗi từ trong chuỗi content. Cụ thể:

// Một HashMap được sử dụng để lưu trữ từ và số lần xuất hiện của nó. Map này được gọi là wordCounter.
// Phương thức sử dụng StringTokenizer để tách chuỗi content thành các từ riêng lẻ. StringTokenizer là một công cụ trong Java để phân tách chuỗi thành các phần tử riêng biệt dựa trên các ký tự ngăn cách, mặc định là khoảng trắng.
// Phương thức lặp qua từng từ trong chuỗi content bằng cách sử dụng vòng lặp while.
// Mỗi từ được kiểm tra xem có tồn tại trong wordCounter hay không. Nếu không tồn tại, từ đó sẽ được thêm vào wordCounter với số lần xuất hiện là 1.
// Nếu từ đã tồn tại trong wordCounter, số lần xuất hiện của nó sẽ tăng lên 1.
// Cuối cùng, sau khi xử lý toàn bộ chuỗi content, wordCounter sẽ chứa thông tin về số lần xuất hiện của mỗi từ trong chuỗi, và nó sẽ được in ra màn hình.