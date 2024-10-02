package construtores;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		
		Animal onça = new Animal("Preto e amarelo",4);
		Animal lagarto = new Animal("Verde", 1);
		Animal águia = new Animal("Marrom, Branco e amarelo", 2);
		
		System.out.println(onça.getCor());
		System.out.println(onça.getTamanho());
		
		System.out.println(lagarto.getCor());
		System.out.println(lagarto.getTamanho());
		
		System.out.println(águia.getCor());
		System.out.println(águia.getTamanho());

	}

}
