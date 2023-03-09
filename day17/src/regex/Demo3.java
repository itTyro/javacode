package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo3 {
    public static void main(String[] args) {
        String str = "java自从95年问世以来,经历了很多版本,目前企业中用的最多的就是Java8和java11," +
                "相信在不久的将来Java17也能登上历史舞台,Java17也是长期支持版本";
        String regex1 = "((?i)Java)(?=8|11|17)";
        String regex2 = "((?i)Java)(?:8|11|17)";
        String regex3 = "((?i)Java)(?!8|11|17)";
        Pattern p = Pattern.compile(regex3);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
