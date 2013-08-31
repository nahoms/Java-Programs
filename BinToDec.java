public class BinToDec {

	public static String dec2Bin(int num) {
		int temp = num, rem;
		StringBuffer buffer = new StringBuffer();
		while (temp != 0) {
			rem = temp % 2;
			buffer.append(String.valueOf(rem));
			temp = temp / 2;
		}
		return buffer.reverse().toString();
	}

	public static int bin2Dec(String bin) {
		int num = 0;
		for (int i = bin.length() - 1, j = 0; i >= 0; i--, j++) {
			num += (int) Math.pow(2, j) * (bin.charAt(i) - '0');
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(bin2Dec("1010"));
		System.out.println(dec2Bin(15));
	}

}
