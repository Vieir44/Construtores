package construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		
		Consulta consulta1 = new Consulta("Rodolfo", "19/09/2024","Sèrgio");
		Consulta consulta2 = new Consulta("Naves", "05/10/2024", "Paulo");
		Consulta consulta3 = new Consulta("Otávio", "10/10/2024", "Daniel");
		
		System.out.println(consulta1.getNomeDents());
		System.out.println(consulta1.getData());
		System.out.println(consulta1.getNomePente());
		
		System.out.println(consulta2.getNomeDents());
		System.out.println(consulta2.getData());
		System.out.println(consulta2.getNomePente());
		
		System.out.println(consulta3.getNomeDents());
		System.out.println(consulta3.getData());
		System.out.println(consulta3.getNomePente());
		
		

	}

}
