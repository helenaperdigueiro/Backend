public class App {

	public static void main(String[] args) {

		// criar o cliente da facade
		ICheckFacade cliente1 = new CheckFacade();
		// solicitar uma pesquisa
		cliente1.buscar("02/07/2018", "08/07/2018", "S?o Paulo", "Canc?n");


		// criar o cliente da facade
		ICheckFacade cliente2 = new CheckFacade();
		// solicitar uma pesquisa
		cliente2.buscar("02/07/2018", "08/07/2018", "Belo Horizonte", "Quito");
	}

}
