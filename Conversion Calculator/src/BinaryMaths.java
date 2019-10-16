
public class BinaryMaths {
	
	public static String toDecimal(String num) {
		int decimal=Integer.parseInt(num,2);
		return(String.valueOf(decimal));
	}
	
	public static String toHex(String num) {
		char[] u= num.toCharArray();
		int count=4;
		String temp="";
		String toReturn="";
		for(int i=u.length-1;i>=0;i--) {
			if(count==0) {
				toReturn=Dictionary.BinMap.get(temp)+toReturn;
				temp=""+String.valueOf(u[i]);
				count=3;
			}else {
				count--;
				temp=String.valueOf(u[i])+temp;
			}
		}
		while(count>0) {
			count--;
			temp="0"+temp;
		}
		return Dictionary.BinMap.get(temp)+toReturn;
	}
	
	public static String toOctal(String num) {
		char[] u= num.toCharArray();
		int count=3;
		String temp="";
		String toReturn="";
		for(int i=u.length-1;i>=0;i--) {
			if(count==0) {
				toReturn=Dictionary.BinMap.get("0"+temp)+toReturn;
				temp=""+String.valueOf(u[i]);
				count=2;
			}else {
				count--;
				temp=String.valueOf(u[i])+temp;
			}
		}
		while(count>0) {
			count--;
			temp="0"+temp;
		}
		return Dictionary.BinMap.get("0"+temp)+toReturn;
	}
}
