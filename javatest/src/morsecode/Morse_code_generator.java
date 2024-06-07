import java.io.*;
import java.util.*;

class Gen_Morse extends Morse_Mapping {
    public static String toMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        for (char character : text.toCharArray()) {
            String morseChar = morseCodeMap.get(character);
            if (morseChar != null) {
                morseCode.append(morseChar).append(" ");
            }
        }
        return morseCode.toString().trim();
    }
}

public class Morse_code_generator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("영어 문장을 입력하세요:");
        String input = scanner.nextLine();

        // 영어 문장을 모스 코드로 변환
        String morseCode = Gen_Morse.toMorse(input);

        // 모스 코드를 파일에 저장
        String fileName = "morse_code.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(morseCode);
            System.out.println("Morse code has been saved to " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
