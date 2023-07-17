import java.util.ArrayList;
import java.util.List;

public class _11_1773_CountItemsMatchingARule {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count1 = 0;

        int tcn = getTCN(ruleKey);
        for(int count=0; count<items.size(); count++){
            String str = items.get(count).get(tcn);
            if(ruleValue.equals(str)){
                count1++;
            }
        }
        return count1;
    }
    public static int getTCN(String ruleKey){
        return switch(ruleKey){
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> -1;
        };
    }
}
