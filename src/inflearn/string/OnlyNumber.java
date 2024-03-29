package inflearn.string;

import java.util.Scanner;

/**
 * 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
 *
 * 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
 */
public class OnlyNumber {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.next();
        StringBuilder sb = new StringBuilder();
        input = input.replaceAll("[^0-9]","");
        int answer = Integer.parseInt(input);
        System.out.println(answer);
    }
}
