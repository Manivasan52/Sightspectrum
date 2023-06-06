package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
String str="mani arun murali mani is mani vijay mani";
Pattern p=Pattern.compile("mani");
Matcher m=p.matcher(str);
int count =0;
while(m.find())
{
	count++;
	System.out.println(m.group()+count+" :times"+m.start()+"  :end "+m.end());
}

	}

}
