package onboarding;

import java.util.List;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        int pobi1 = pobi.get(0);
        int pobi2 = pobi.get(1);
        int crong1 = crong.get(0);
        int crong2 = crong.get(1);

        if(pageError(pobi1, pobi2)) return -1;
        if(pageError(crong1, crong2)) return -1;

        int maxPobi = maxNum(pobi1, pobi2);
        int maxCrong = maxNum(crong1, crong2);

        if (maxPobi > maxCrong)
            answer = 1;
        if (maxPobi < maxCrong)
            answer = 2;
        if (maxPobi == maxCrong)
            answer = 0;
        return answer;
    }

    private static boolean pageError(int left, int right) {
        if (right - left != 1) return true;

        return false;
    }

    private static int maxNum(int left, int right) {
        String strLeft = Integer.toString(left);
        String strRight = Integer.toString(right);

        int[] arrLeft = new int[strLeft.length()];
        int[] arrRight = new int[strRight.length()];

        for (int i = 0; i < strLeft.length(); i++) {
            arrLeft[i] = strLeft.charAt(i) - '0';
        }
        for (int i = 0; i < strRight.length(); i++) {
            arrRight[i] = strRight.charAt(i) - '0';
        }

        int sumLeft = 0;
        int sumRight = 0;
        int mulLeft = 1;
        int mulRight = 1;


        for (int i = 0; i < arrLeft.length; i++) {
            sumLeft += arrLeft[i];
            mulLeft *= arrLeft[i];
        }
        for (int i = 0; i < arrRight.length; i++) {
            sumRight += arrRight[i];
            mulRight *= arrRight[i];
        }
        int[] arrMax = {sumLeft, sumRight, mulLeft, mulRight};
        int maxNumber = arrMax[0];
        for (int i = 1; i < arrMax.length; i++) {
            if (arrMax[i] > maxNumber)
                maxNumber = arrMax[i];
            }
        return maxNumber;
        }
    }