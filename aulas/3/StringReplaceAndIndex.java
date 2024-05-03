public class StringReplaceAndIndex {
	public static void main(String[] args) {
		String msg = "As letras as serao trocadas";
		System.out.println(msg);
		
		String msgTrocada = msg.replace('a', 'x');
		System.out.println(msgTrocada);
		System.out.println(); 
		
		String texto = "sou uma string, sou a string";
		System.out.println(texto);
		
		int textIndex = texto.indexOf("string");
		int textLastIndex = texto.lastIndexOf("string");
		
		System.out.println(textIndex);
		System.out.println(textLastIndex);
	}
}
