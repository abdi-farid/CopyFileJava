import java.io.*;
	/****************************************************
         * copier le contenu d'un fichier dans un autre     *
         * Character Stream                                 *
         * Without using buffers                                    *
         ****************************************************/
public class FluxCarSansBuff{
	public static void main(String[] args) {
		if(args.length != 2 ){
			System.out.println("Error Syntax");
                        System.out.println("use : java FluxCarSansBuff sourceFile.txt destFile.txt");
			System.exit(0);
		}

		try{
				// source FileRedaer
			FileReader source = new FileReader(args[0]);

				// dest FileWriter
			FileWriter dest = new FileWriter(args[1], true); // les données seront ajoutés a la fin de file

			int tmp ;
			while((tmp = source.read()) != -1 ){
				System.out.println((char)tmp+ "\n");
				dest.write(tmp);
			}
			dest.close();
		
		}catch(FileNotFoundException e){
		}catch(IOException e){
		}
	}
}