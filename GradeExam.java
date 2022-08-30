public class GradeExam {
    public static void main(String[] args) {
        char[][] studentAnswers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
//(1)
        //for each loop
        for(char[] studentData: studentAnswers)
        {
            int correctCount = 0;

            for(char answer : studentData )
            {
                //(3)
                if(answer == keys[3]);

            }
        }

        for (int i = 0; i < studentAnswers.length; i++) {
            int count = 0;
            for (int j = 0; j < studentAnswers[i].length; j++) {
                if (studentAnswers[i][j] == keys[j]) {
                    count++;
                }
            }
            System.out.println("Student " + (i + 1) + "'s count is " + count);
        }


    }
}
