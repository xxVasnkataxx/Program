public class ScoreConverter {

    public String convertScoreToGrade(int score) {
        if (score < 52) {
            return "F";
        } else if (score < 64) {
            return "D";
        } else if (score < 76) {
            return "C";
        } else if (score < 88) {
            return "B";
        }
        else {
            return "A";
        }
    }
}
