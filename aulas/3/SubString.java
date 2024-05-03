public class SubString {
	public static void main(String[] args) {
		String msg = "sou uma string";
		String msg2 = msg.substring(4);
		
		System.out.println(msg);
		System.out.println(msg2);
		
		System.out.println();
		
		String rec = "vou ser recortado";
		String rec2 = rec.substring(4, 12);
		
		System.out.println(rec);
		System.out.println(rec2);
	}
}
