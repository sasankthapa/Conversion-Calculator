public class DecimalMaths {

	public static String toBinary(String num) {
		String result="";
		int n=Integer.parseInt(num);
		int a;
		while(n>0) {
			a = n % 2;
            result = a + "" + result;
            n = n / 2;
		}
		return result;
	}
	
	public static String toOctal(String num) {
		String result="";
		int n = Integer.parseInt(num);
		int a;
		while(n>0) {
			a=n%8;
			result=a+""+result;
			n=n/8;
		}
		return result;
	}
	
	public static String toHex(String num) {
		String result="";
		int n=Integer.parseInt(num);
		int a;
		while(n>0) {
			a = n % 16;
			if(Dictionary.hexMap.containsKey(a)) result=Dictionary.hexMap.get(a)+result;
			else result = a + "" + result;
            n = n / 16;
		}
		return result;
	}
}
