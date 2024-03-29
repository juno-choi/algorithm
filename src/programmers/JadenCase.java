package programmers;

import java.util.Locale;

/**
 * JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다. 문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * s는 길이 1 이상인 문자열입니다.
 * s는 알파벳과 공백문자(" ")로 이루어져 있습니다.
 * 첫 문자가 영문이 아닐때에는 이어지는 영문은 소문자로 씁니다. ( 첫번째 입출력 예 참고 )
 *
 * 3people unFollowed me
 */
public class JadenCase {
    public static void main(String[] args) {
        String str = "3people unFollowed me";
        String solution = solution(str);
        System.out.println("solution = " + solution);
    }
    public static String solution(String s){
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        int cnt = 0;
        for(char c : chars){
            if(c == ' '){
                cnt = 0;
                sb.append(' ');
                continue;
            }
            if(cnt == 0){
                sb.append(String.valueOf(c).toUpperCase());
                cnt++;
            }else{
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
