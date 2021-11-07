# Copy File Java

ces programmes JAVA servent à copier le contenu d'un fichier texte dans un autre 
chaque programme s'exécute indépendament des autres 

pour utiliser un programme de copie, faites comme suit :
  1. compiler le fichier java 
      **javac javaFile.java**
  
  2. exécuter le bytecode généré
      **java javaFile sourceFile.txt destFile.txt**
      
## Explication des fichiers 
- ***FluxCar.java*** : 
    - **Compilation** : ***javac FluxCar.java***
    - **Exécution** : ***java FluxCar sourceFile.txt destFile.txt***<br>
La copie de données se fait caractère par caractère en utilisant des BUFFERS
      
- **FluxCarSansBuff.java** : 
    - **Compilation** : ***javac FluxCarSansBuff.java***
    - **Exécution** : ***java FluxCarSansBuff sourceFile.txt destFile.txt***<br>
La copie de données se fait caractère par caractère sans utiliser des **flux** (BUFFERS)


- **octetFlux.java** : 
    - **Compilation** : ***javac octetFlux.java***
    - **Exécution** : ***java octetFlux sourceFile.txt destFile.txt***<br>
La copie de données se fait octet par octet en utilisant les flux **flux** (BUFFERS)


- **octetFluxSansBuff.java** : 
    - **Compilation** : ***javac octetFluxSansBuff.java***
    - **Exécution** : ***java octetFluxSansBuff sourceFile.txt destFile.txt***<br>
La copie de données se fait octet par octet sans utiliser les **flux** (BUFFERS)


