import java.io.*;
	/****************************************************
         * copier le contenu d'un fichier dans un autre     *
         * Character Stream                                 *
         * using buffers                                    *
         ****************************************************/
public class FluxCar{
	public static void main(String[] args) {
		if(args.length != 2 ){
			System.out.println("Error Syntax");
                        System.out.println("use : java FluxCar sourceFile.txt destFile.txt");
			System.exit(0);
		}

		try{
				// source avec un tempon de lecture 
			FileReader source = new FileReader(args[0]);
			BufferedReader reader = new BufferedReader(source);

				// dest avec un tampon d ecriture
			FileWriter dest = new FileWriter(args[1]);
			BufferedWriter writer = new BufferedWriter(dest);

			String tmp = "";

			while((tmp = reader.readLine()) != null ){
				System.out.println(tmp+ "\n");
				writer.write(tmp);
				writer.flush();
				writer.newLine();
			}
			writer.close();
		
		}catch(FileNotFoundException e){
		}catch(IOException e){
		}
	}
}