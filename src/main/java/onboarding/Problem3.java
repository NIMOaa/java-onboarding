package onboarding;

public class Problem3 {
    public static int solution(int number) {
        int answer = 0;
        for(int i = 0; i < number; i++){
            while(i>0){
                if(i%10 ==3 || i%10 == 6 || i%10 ==9)
                    answer += 1;
                i /= 10;
            }
        }
        return answer;
    }
}
