import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args)throws Exception {
	// TODO Auto-generated constructor stub

	System.out.println("Digite o seu CEP");
	String cep = new Scanner(System.in).nextLine();
	
	Endereco endereco = ServicoDeCep.buscaenderecoPelo(cep);
	
	System.out.println("Bairro" + endereco.getBairro());
	System.out.println("Localidade " + endereco.getEndereco());
	System.out.println("Cidade " + endereco.getLocalidade());
	System.out.println("CEP: " + endereco.getCep());
}
}
