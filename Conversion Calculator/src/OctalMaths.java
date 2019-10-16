
public class OctalMaths {

	public static String toDecimal(String num) {
		int num1=0;
		for(int i=0;i<num.length();i++) {
			Integer curr=Integer.valueOf(num.substring(i,i+1));
			num1+=curr*Math.pow(8,(num.length()-1-i));
		}
		return String.valueOf(num1);
	}
	
	public static String toBinary(String num) {
		String toReturn="";
		for(int i=num.length()-1;i>=0;i--) {
			Character curr=num.charAt(i);
			toReturn=Dictionary.ReverseBinMap.get(curr).substring(1,4)+toReturn;
		}
		int index=0;
		while(toReturn.charAt(index)=='0') {
			index++;
		}
		return toReturn.substring(index,toReturn.length());
	}
	
	public static String toHex(String num) {
		String binary=toBinary(num);
		return BinaryMaths.toHex(binary);
	}
}
