public class BaseballGameResultCalculator {
    private int maxLen;

    private BaseballGameResultCalculator(){
        this(BaseballGame.DEFAULT_LEN);
    }
    public BaseballGameResultCalculator(int maxLen){
        this.maxLen = maxLen;
    }

    public int getStrikesCnt(String createdStr, String inputStr) {
        return (createdStr.equals(inputStr)) ? 3 : 1;
    }
}
