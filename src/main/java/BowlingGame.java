
import java.util.Scanner;

public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {
        int score = 0;
        int count = 0;
        int k = 0;
        int number = 0;
        char temp = '0';
        Scanner sc = new Scanner(System.in);
        String str = null;
        System.out.print("输入比赛成绩字符串:");
        str = sc.nextLine();

        char[] inputs = str.toCharArray();

        for (int i = 0; i < inputs.length; i++) {
            score += count;
            count = 0;
            if (number == 11) {
                number++;
                break;
            }
            if (number == 12) {
                if (inputs[28] == 'X') {
                    score -= count;
                    temp = inputs[i];
                    number++;
                } else if (inputs[28] == '/') {
                    score -= count;
                    score = inputs[i] - '0' + score;
                }
                break;
            }
            if (number == 13) {

                if (temp > inputs[i]) {
                    score = temp - '0' + score;
                } else {
                    score = inputs[i] - '0' + score;
                }
            } else {
                if (inputs[i] == 'X') {
                    count = 30;
                    continue;
                } else {
                    k++;
                    if (inputs[i] == '|') {
                        k = 0;
                        number++;
                    } else if (inputs[i] == '-') {
                        count = 0;
                        if (k == 2) {
                            if (inputs[i] == '-') {
                                count = 0;
                            } else if (inputs[i] == '/') {
                                count = 10;
                            } else {
                                int b = inputs[i] - '0';
                                count = b;
                            }
                        }
                    } else {
                        int b = inputs[i] - '0';
                        count = b;
                        if (k == 2) {
                            if (inputs[i] == '-') {
                                count = 0;
                            } else if (inputs[i] == '/') {
                                count = 10;
                            } else {
                                int a = inputs[i] - '0';
                                count = a;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(score);
    
        return 0;
    }
}
