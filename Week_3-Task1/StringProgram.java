package Task1;

public class StringProgram {
public static void main(String[] args) {
	String str2="sightspectrum";
	for(int i=1;i<=str2.length();i++)
	{
		char ch[]=str2.toCharArray();
		System.out.println(ch[i]+" "+i);
	}

}
}
