package wiprokushagra.topic2.ass1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class FileRnW {

	static Date date = new Date();
	static Double d = 4578523.20;
	static Long l = 54278L;

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		write();
		read();
		System.out.println("ends..");
	}

	private static void write() throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream("C:\\temp\\wipro.txt");
			oos = new ObjectOutputStream(fos);

			oos.writeDouble(d);
			oos.writeObject(date);
			oos.writeObject(l);
		} finally {
			oos.close();
			fos.close();
		}

	}

	private static void read() throws IOException, ClassNotFoundException {

		// Create an input stream for file
		ObjectInputStream input = new ObjectInputStream(new FileInputStream("C:\\temp\\wipro.txt"));

		// Read from file
		// 1. Read double
		double doubleValue = input.readDouble();
		System.out.println("Double value: " + doubleValue);
		// 2. Read date object
		Date date = (java.util.Date) (input.readObject());
		System.out.println("DateTime: " + date);
		Long l = (Long) input.readObject();
		System.out.println("long value" + l);

		// Close the stream
		input.close();
	}

}
