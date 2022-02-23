import java.util.regex.Pattern;
import java.util.regex.Matcher;

class S{
	public static void main(String[] args){
		Pattern p = Pattern.compile("0[xX]([0-9a-f])+");
		Matcher m = p.matcher("aw0x2er_ mn0Xac1532t# 0x _q0xw");
		
		System.out.println("aw0x2er_ mn0Xac1532t# 0x _q0xw");
		
		while(m.find()){
			System.out.println(">"+m.group()+"< # start_index: "+m.start()+"~ end_index: "+m.end());
		}
	}
}