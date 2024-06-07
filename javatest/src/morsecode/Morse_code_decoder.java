import java.io.*;
import java.util.*;

class Decode_Morse extends Morse_Mapping {
    public static String toEnglish(String morseCode) {
        String[] morseWords = morseCode.split(" / ");
        StringBuilder englishText = new StringBuilder();

        for (String morseWord : morseWords) {
            String[] morseChars = morseWord.split(" ");
            for (String morseChar : morseChars) {
                for (Map.Entry<Character, String> entry : morseCodeMap.entrySet()) {
                    if (entry.getValue().equals(morseChar)) {
                        englishText.append(entry.getKey());
                        break;
                    }
                }
            }
            englishText.append(" ");
        }

        return englishText.toString().trim();
    }
}

public class Morse_code_decoder {
    public static void main(String[] args) {
        String fileName = "morse_code.txt";

        try {
            // 파일에서 모스 코드 읽기
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            StringBuilder morseCode = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                morseCode.append(line).append("\n");
            }

            reader.close();

            // 읽은 모스 코드를 영어로 변환
            String englishText = Decode_Morse.toEnglish(morseCode.toString().trim());

            // 변환된 텍스트를 콘솔에 출력
            System.out.println("해석한 모스코드: " + englishText);
        } catch (FileNotFoundException e) {
            System.err.println("The file " + fileName + " was not found.");
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
