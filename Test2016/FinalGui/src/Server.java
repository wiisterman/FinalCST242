import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.HashSet;

public abstract class Server 
{

	private static final int PORT = 55451;
	private static HashSet<String> names = new HashSet<>();
	private static HashSet<String> ids = new HashSet<>();
	private static HashSet<Double> scores = new HashSet<>();
	
	private static HashSet<PrintWriter> writers = new HashSet<>();

	public static void main(String[] args) throws IOException {
		System.out.println("The chat server is running...");
		ServerSocket listener = new ServerSocket(PORT);
		try {
			while (true) {
				new Handler(listener.accept()).start();
			}
		} finally {
			listener.close();
		}
	}

	private static class Handler extends Thread {
		private String name;
		private String id;
		private double score;
		private Socket socket;
		private BufferedReader in;
		private PrintWriter out;

		public Handler(Socket socket) {
			this.socket = socket;
		}

		public void run() {
			try {
				in = new BufferedReader(new InputStreamReader(
						socket.getInputStream()));
				out = new PrintWriter(socket.getOutputStream(), true);

				while (true) {
					out.println("SUBMITNAME");// request a screen name
					name = in.readLine();
				
					score = in.read();// capture the screen from client
					if (name == null) { // test name validity
						return;
					}
					// name is valid at this point
					synchronized (names) {
						if (!names.contains(name)) {
							names.add(name);
							break;
						}
					
					}
				}
					while (true) {
						out.println("SUBMITID");// request a screen name
						id = in.readLine();
					
						if (id == null) { // test name validity
							return;
						}
						// name is valid at this point
						synchronized (ids) {
							if (ids.contains(id)) {
								ids.add(id);
								break;
							}
						}
					}
					while (true) {
						out.println("SUBMITSCORE");// request a screen name
						score = in.read();
					
							// name is valid at this point
					synchronized (scores) 
					{
							if (scores.contains(score)) 
							{
							scores.add(score);
							break;
							}
					}
						
					}		
					
				}

				// name added to the names hashset.
				out.println("STUDENTACCEPTED");
				writers.add(out);
				// output stream added to the writers hashset, ready to chat
				while (true) {
					String line = in.readLine();
					if (line == null) {
						return;
					}
					for (PrintWriter writer : writers) {
						writer.println("MESSAGE " + name + ": " + line);
					}
				catch(IOException e) {
				System.out.println(e);
			}
				}
	
				finally 
				{
				if (name != null) {
					names.remove(name);
				}
				if (out != null) {
					writers.remove(out);
				}
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
}