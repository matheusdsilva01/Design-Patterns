public class ProxySpotify implements IServicoDownload {

	@Override
	public void download(Usuario x) {
		if (x.getTipoUsuario().equals("Premium")) {
			Spotify spot = new Spotify();
			spot.download(x);
		} else {
			System.out.println("Assine o pacote Premium");
		}
	}

}
