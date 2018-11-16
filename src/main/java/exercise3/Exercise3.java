package exercise3;

import com.sun.corba.se.pept.encoding.InputObject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise3 {
	public static void save(Drawable[] listeDrawable, Path filePath){
		try{
			OutputStream outputStream = Files.newOutputStream(filePath);
			ObjectOutput objSave = new ObjectOutputStream(outputStream);
			objSave.writeObject(listeDrawable);
		}
		catch (Exception e){
			e.printStackTrace();
		}
	}

	public static Drawable[] load(Path filePath){
		Drawable[] ListeLue;
		try{
			InputStream inputStream = Files.newInputStream(filePath);
			ObjectInput objRead = new ObjectInputStream(inputStream);
			return ListeLue = (Drawable[]) objRead.readObject();

		}
		catch (Exception e){
			e.printStackTrace();
			return new Drawable[0];
		}

	}

	public static void main(String[] args) {
		Path filePath;
		filePath = Paths.get("filePath.txt");
		Drawable[] listeDrawable;
		try {
			listeDrawable = load(filePath); //si on veut charger on prend ceci
		/* listeDrawable = new Drawable[]{new Rectangle(new Point(20,20), new Point(120,150)),
			new Square(new Point(20,20),60)};*/ //si on veut sauvegarder à partir d'une liste initalisée dans le programme, on prend ceci

			new Panel(listeDrawable);
			//save(listeDrawable,filePath); //si on veut sauvegarder à partir d'une liste initalisée dans le programme, on prend ceci

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
