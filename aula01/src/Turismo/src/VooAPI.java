public class VooAPI {

	//   Procura de voos de acordo com um horário pré-estabelecido.
	public void buscarVoos(String dataPartida, String dataRetorno, String origem, String destino) {
		System.out.println("==============================");
		System.out.println("Voos encontrados para " + destino + " desde " + origem);
		System.out.println("Data IDA: " + dataPartida + " Data Volta " + dataRetorno);
		System.out.println("......");
		System.out.println("......");
		System.out.println("==============================");
	}

}
