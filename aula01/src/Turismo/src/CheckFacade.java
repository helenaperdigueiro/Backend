public class CheckFacade implements ICheckFacade{

	// armazenam nas variáveis uma instância de cada um
	private VooAPI vooAPI;
	private HotelAPI hotelAPI;	

	// construtor que cria as instâncias
	public CheckFacade() {
		vooAPI = new VooAPI();
		hotelAPI = new HotelAPI();
	}

	//  simplifica as buscas de voos e hotéis
	public void buscar(String dataPartida, String dataRetorno, String origem, String destino) {
		vooAPI.buscarVoos(dataPartida, dataRetorno, origem, destino);
		hotelAPI.buscarHoteis(dataPartida, dataRetorno, destino);
	}
}