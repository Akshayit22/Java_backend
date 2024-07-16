import java.io.*;
import java.util.Scanner;

class Input {
	Input() {
		try {
			/* Scanner and file */
			File f = new File("out.txt");
			Scanner sc = new Scanner(f);

			while (sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			sc.close();

			/* FileReader */
			FileReader r = new FileReader("out.txt");
			int data = r.read();
			System.out.println(data);
			while (data != -1) {
				System.out.print((char) data);
				data = r.read();
			}
			r.close();

		} catch (IOException e) {
			System.out.print(e);
		}
	}
	void IStream(){
		try{
			InputStream in = new FileInputStream("out.txt");
			int data = in.read();
			System.out.println("printing data : " + data);
			while (data != -1) {
				System.out.print((char) data);
				data = in.read();
			}
			in.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

class Output {

	Output() {
		try {
			FileWriter w = new FileWriter("out.txt");
			String out = "This is output text.";

			for (int i = 0; i < 5; i++) {
				w.write(out + 2500 + '\n');
				// w.append('\n');
			}

			w.close();

			System.out.println("done");

		} catch (IOException e) {
			System.out.println(e);
		}
	}

	void OStream(){
		try{
			System.out.println("Nothing");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

public class IO {
	public static void main(String[] args) {
		Output o = new Output();
		o.OStream();
		
		Input i = new Input();
		i.IStream();
	}
}
