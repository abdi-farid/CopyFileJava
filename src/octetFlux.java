import java.io.*;
	/****************************************************
         * copier le contenu d'un fichier dans un autre     *
         * byte Stream                                      *
         * using buffers                                    *
         ****************************************************/
public class octetFlux{
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("Error Syntax");
                        System.out.println("use : java octetFlux sourceFile.txt destFile.txt");
			System.exit(0);
		}

		try{
				// input with buffer
			FileInputStream FIS = new FileInputStream(args[0]);
			BufferedInputStream BIS = new BufferedInputStream(FIS);

				// ouput with buffer
			FileOutputStream FOS = new FileOutputStream(args[1]);
			BufferedOutputStream BOS = new BufferedOutputStream(FOS);

			int tmp;
			while((tmp = BIS.read()) != -1){
				BOS.write(tmp);
			}
			BOS.flush();
			BOS.close();
			BIS.close();
		}catch(IOException e){
		}
	}
}