import java.io.*;
        
        /****************************************************
         * copier le contenu d'un fichier dans un autre     *
         * byte Stream                                      *
         * Without using buffers                                    *
         ****************************************************/
public class octetFluxSansBuff{
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Error Syntax");
                        System.out.println("use : java octetFluxSansBuff sourceFile.txt destFile.txt");
			System.exit(0);
		}

		try{
				// inputstream without buffer
			File file = new File(args[0]);
			FileInputStream FIS = new FileInputStream(file);
			long l =file.length();

				// outputstream without buffer
			FileOutputStream FOS = new FileOutputStream(args[1], true);

			for(long i=1; i<=l; i++){
				FOS.write((FIS.read()));
			}
			FOS.close();
			FIS.close();
		}catch(IOException e){
		}
	}
}