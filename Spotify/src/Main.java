public class Main {
	public static void main(String[] args) {
		IServicoDownload download = new ProxySpotify();
		Usuario usuario1 = new Usuario("Matheus", "Free");
		download.download(usuario1);
	}
}
