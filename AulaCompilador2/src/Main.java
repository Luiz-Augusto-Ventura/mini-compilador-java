import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String programaFonte = input.nextLine();
		
		input.close();
		
		Berco compBerco = new Berco(programaFonte);
		
		compBerco.init();
		//compBerco.expression();
		//compBerco.assignment();
		compBerco.program();
		
		//Retorna o código objeto 
		System.out.println(compBerco.getCodeObjeto());
		
	}

}

