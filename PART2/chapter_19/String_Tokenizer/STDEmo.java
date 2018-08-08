// demostrate StringTokenizer
import java.util.StringTokenizer;

class STDEmo{
	static String in= "title=Java: The Complete Reference;" +
"author=Schildt;" +
"publisher=McGraw-Hill;" +
"copyright=2014";

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer(in,"=;");

		while(st.hasMoreTokens()){
			String key=st.nextToken();
			String val=st.nextToken();
			System.out.println("Tokens->"+st.countTokens());
			System.out.println(key+"\t"+val);
		}

		System.out.println(st.countTokens());
	}
}