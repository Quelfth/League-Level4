package anagrams;

public class Anagrams {
	public static void main(String[] args) {
		System.out.println(isAnagram("ba", "ab"));
	}

	public static boolean isAnagram(String aRef, String bRef) {
		if (aRef == null)
			return bRef == null;
		if (bRef == null)
			return false;
		String a = aRef + "";
		String b = bRef + "";
		if(b.length() == 0 && a.length() != 0)
			return false;
		for (; a.length() > 0; a = a.substring(1))
			for (int i = 0; i < b.length(); i++)
				if (a.charAt(0) == b.charAt(i) || (a.charAt(0) + "").equalsIgnoreCase(b.charAt(i) + ""))
					b = (i > 0 ? a.substring(0, i) : "") + (i < b.length() - 1 ? b.substring(i + 1) : "");
				else if (i == b.length() - 1)
					return false;
		return b.length() == 0;
	}
}
