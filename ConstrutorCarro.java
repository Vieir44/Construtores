package construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		
		Carro uno = new Carro("1BD4", 04);
		Carro bmw = new Carro("3EF8", 03);
		
		System.out.println(uno.getPlaca());
		System.out.println(uno.getNumChassi());
		
		System.out.println(bmw.getPlaca());
		System.out.println(bmw.getNumChassi());
		
		
		
		
		

	}

}
