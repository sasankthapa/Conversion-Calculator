import java.util.HashMap;

public class Dictionary {

	static HashMap<Integer,String> hexMap=new HashMap<Integer,String>();
	
	static {
		hexMap.put(new Integer(10),"A");
		hexMap.put(new Integer(11),"B");
		hexMap.put(new Integer(12),"C");
		hexMap.put(new Integer(13),"D");
		hexMap.put(new Integer(14),"E");
		hexMap.put(new Integer(15),"F");
	}
	
	static HashMap<String,String> BinMap=new HashMap<String,String>();
	static HashMap<Character, String> ReverseBinMap=new HashMap<Character, String>();
	
	static {
		ReverseBinMap.put('0',"0000");
		ReverseBinMap.put('1',"0001");
		ReverseBinMap.put('2',"0010");
		ReverseBinMap.put('3',"0011");
		ReverseBinMap.put('4',"0100");
		ReverseBinMap.put('5',"0101");
		ReverseBinMap.put('6',"0110");
		ReverseBinMap.put('7',"0111");
		ReverseBinMap.put('8',"1000");
		ReverseBinMap.put('9',"1001");
		ReverseBinMap.put('A',"1010");
		ReverseBinMap.put('B',"1011");
		ReverseBinMap.put('C',"1100");
		ReverseBinMap.put('D',"1101");
		ReverseBinMap.put('E',"1110");
		ReverseBinMap.put('F',"1111");
	}
	
	static {
		BinMap.put("0000","0");
		BinMap.put("0001","1");
		BinMap.put("0010","2");
		BinMap.put("0011","3");
		BinMap.put("0100","4");
		BinMap.put("0101","5");
		BinMap.put("0110","6");
		BinMap.put("0111","7");
		BinMap.put("1000","8");
		BinMap.put("1001","9");
		BinMap.put("1010","A");
		BinMap.put("1011","B");
		BinMap.put("1100","C");
		BinMap.put("1101","D");
		BinMap.put("1110","E");
		BinMap.put("1111","F");
	}
}
