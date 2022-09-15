# Buisness-Portfolio-App-with-admin-panel


public class SyncDataHelper {
//Replace with your own base url
//Custom Admin panel not available for this build
	private static final int CONNECTION_TIMEOUT = 45 * 1000; // 45 seconds
	public static final String URL_ROOT = "http://www.pengaja.com/business/admin/index.php/";
	public static final String URL_UPLOADS = "http://pengaja.com/business/admin/uploads/";

	private static BufferedReader getInputStream(String urlString)
			throws IOException {
		urlString = urlString.replaceAll(" ", "%20");
		URL url = new URL(urlString);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setConnectTimeout(CONNECTION_TIMEOUT);
		return new BufferedReader(new InputStreamReader(conn.getInputStream()));
	}

	public static Clients fetchClients() throws JsonSyntaxException,
			JsonIOException, IOException {
		String urlString = URL_ROOT + "clients/api";
		BufferedReader in = getInputStream(urlString);
		try {
			return new Gson().fromJson(in, Clients.class);
		} finally {
			closeReader(in);
		}
	}

![Screenshot_20220622-115824_Tochy Computer Services](https://user-images.githubusercontent.com/83840753/190369302-5bc20e78-ee7c-420e-8323-fec0259e11f3.jpg)
