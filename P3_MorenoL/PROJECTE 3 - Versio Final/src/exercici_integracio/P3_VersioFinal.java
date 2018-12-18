package exercici_integracio;
/**
 *
 * @author hmorenol
 */
import java.util.Scanner;
public class P3_VersioFinal {
    //Definim les constants min  max per l'identificador
    public static final int MIN_ID = 1;
    public static final int MAX_ID = 2000;
    //Min & Max MES
    public static final int MIN_MES = 1;
    public static final int MAX_MES = 12;
    //Min & Max ANY
    public static final int MIN_ANY = 1900;
    public static final int MAX_ANY = 2100; 
    //Min 6 Max Genere
    public static final int GENERE1 = 1;
    public static final int GENERE2 = 2;
    public static final String NOM_G1 = "Noia";
    public static final String NOM_G2 = "Noi";
    //Definim les constants de Categoria
    public static final int CAT1 = 1;
    public static final int CAT2 = 2;
    public static final int CAT3 = 3;
    public static final int CAT4 = 4;      
    public static final String CAT1_NOM = "Alevi";
    public static final String CAT2_NOM = "Infantil";
    public static final String CAT3_NOM = "Junior";
    public static final String CAT4_NOM = "Senior";
    //Definim les constants de CLUB
    public static final int CLUB0 = 0;
    public static final int CLUB1 = 1;
    public static final int CLUB2 = 2;
    public static final int CLUB3 = 3;
    public static final int CLUB4 = 4;
    public static final int CLUB5 = 5;
    public static final String CLUB_NOM0 = "No federat";
    public static final String CLUB_NOM1 = "Barcelona";
    public static final String CLUB_NOM2 = "Tarragona";
    public static final String CLUB_NOM3 = "Hospitalet";
    public static final String CLUB_NOM4 = "Girona";
    public static final String CLUB_NOM5 = "Cerdanyola del Vallés";
    public static final int MAX_INTENTS = 3;
    
    public static final int MAX_PARTICIPANTS = 10;
    public static void main (String[] agrs){
        //Declarem els arrays
        int[] arrayIds = new int[MAX_PARTICIPANTS];
        int[] arrayGenere = new int[MAX_PARTICIPANTS];
        int[] arrayMes = new int[MAX_PARTICIPANTS];
        int[] arrayAny = new int[MAX_PARTICIPANTS];
        int[] arrayCat = new int[MAX_PARTICIPANTS];
        int[] arrayClub = new int[MAX_PARTICIPANTS];
        
        //Declarem les variables        
        int canviId, canviGenere, canviMes, canviAny, canviCat, canviClub, 
                comptador = 0, numUser= 0, opcio = 0, seguir = 0;
        String nomGenere= "", nomCat = "", nomClub = "";
        Scanner lector = new Scanner(System.in);
        boolean dadaCorrecte = true, mesParticipants;
       
        /*
        Demana les dades d'un alumne, les mostrarà i 
        demanarà si es vol introduïr un altre alumne.
        */
        do {
            mesParticipants = false;
        //Funcionalitat que demana fins a 3 cops una dada.        
            do{
                //Comencem amb el programa i a demanar dades
                System.out.println("\nEntrada dades de participant:"
                        + "\n------------------------------");
                //Demanem l'id de registre a l'usuari
                System.out.print("\nIntrodueix el ID de registre: ");
                dadaCorrecte = lector.hasNextInt();
                if(dadaCorrecte){//comprovem que és un número sencer
                    //Lectura de dada
                    arrayIds[numUser] = lector.nextInt();
                    //Comprovem que el valor d'ID estigui entre 1 i 2000
                    if ((arrayIds[numUser] < MIN_ID) || (arrayIds[numUser] > MAX_ID )){
                        dadaCorrecte = false;
                    }
                }
                comptador++;
            } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
            if(dadaCorrecte){//comprovem que és un número sencer
                comptador = 0;
                do {
                    //Demanem la data de naixament a l'usuari
                    System.out.println("\nQuina és la teva data de naixament?");
                    //Demanem el Any
                    System.out.print("Any?: ");
                    //Lectura de dada
                    arrayAny[numUser] = lector.nextInt();
                    //Comprovem que el MES estigui entre 1 i 12
                    if(arrayAny[numUser] < MIN_ANY || arrayAny[numUser] > MAX_ANY){
                        dadaCorrecte = false;
                    } else {
                        comptador = 0;
                        do{
                        //Demanem el Mes
                        System.out.print("Mes?: ");
                        dadaCorrecte = lector.hasNextInt();
                        if(dadaCorrecte){//comprovem que és un número sencer
                            //Lectura de dada
                            arrayMes[numUser] = lector.nextInt();
                            //Comprovem que l'ANY estigui entre 1900 i 2100
                            if (arrayMes[numUser] < MIN_MES || arrayMes[numUser] > MAX_MES){
                                dadaCorrecte = false;
                            }    
                        }
                        comptador++;
                        } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
                    }
                   comptador++; 
                } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
            }         
            if(dadaCorrecte){//comprovem que és un número sencer
                comptador = 0;
                do {
                    //Demanem el genere a l'usuari
                    System.out.print("\nEts Noia [1] o Noi [2]?: "); 
                   //Lectura de dada
                    arrayGenere[numUser] = lector.nextInt();
                    //Comprovem que els valors siguin 1 o 2
                    if(arrayGenere[numUser] < GENERE1 || arrayGenere[numUser] > GENERE2){
                        dadaCorrecte = false;
                    }
                    comptador++;
                } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
            }
            if(dadaCorrecte){ //comprovem que és un número sencer
                comptador = 0;
                do{
                    //Demanem la categoria a l'usuari
                    System.out.println("\nTria la teva categoria");
                    System.out.println("\t[1] - Alevi");
                    System.out.println("\t[2] - Infantil");
                    System.out.println("\t[3] - Junior");
                    System.out.println("\t[4] - Senior");
                    System.out.print("La meva categoria és: ");
                    //Lectura de dades
                    arrayCat[numUser] = lector.nextInt();
                    //Comprovem que els valors siguin els de les opcions
                    if(arrayCat[numUser] < CAT1 || arrayCat[numUser] > CAT4){
                        dadaCorrecte = false;
                    }
                    comptador++;
                } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
            }
            if(dadaCorrecte){//comprovem que és un número sencer
                comptador = 0;
                do{
                    //Demanem el club a l'usuari
                    System.out.println("\nTria el teu Club");
                    System.out.println("\t[0] - No federat");
                    System.out.println("\t[1] - Barcelona");
                    System.out.println("\t[2] - Tarragona");
                    System.out.println("\t[3] - Hospitalet");
                    System.out.println("\t[4] - Girona");
                    System.out.println("\t[5] - Cerdanyola del Vallés");
                    System.out.print("El meu Club és: ");
                    //Lectura de dades
                    arrayClub[numUser] = lector.nextInt();
                    //comprovem que els valor siguin els de les opcions
                    if(arrayClub[numUser] < CLUB0 || arrayClub[numUser] > CLUB5){
                        dadaCorrecte = false;
                    }
                    comptador++;
                } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
            }
            if (dadaCorrecte){
                numUser++;
            }else{
                System.out.println("Dades incorrectes");
            }
            //Mostrem si vol seguir introduïnt usuaris.
            System.out.println("\nVols introduïr més participants.");
            System.out.println("NO - [0]");
            System.out.println("SI - [1]");
            dadaCorrecte = lector.hasNextInt();
            if (dadaCorrecte){//comprovem que és un número sencer
                opcio = lector.nextInt();//LLegim el valor introduït
                if(opcio == 1){//el lector es 1, continuará afegint participants
                    mesParticipants = true;
                }
            } else {
                System.out.println("Opcio incorrecta");
            }                        
        } while ((mesParticipants) && (numUser < MAX_PARTICIPANTS));
        for (int i=0; i<numUser;i++){
            //Obtenim el Genere
            switch(arrayGenere[i]){
                case GENERE1:
                    nomGenere = NOM_G1;                    
                    break;
                case GENERE2:
                    nomGenere = NOM_G2;                    
                    break;
            }
            //Obtenim el nom de la catgoria per mostrar
            switch (arrayCat[i]){
                case CAT1:
                    nomCat = CAT1_NOM;
                    break;
                case CAT2:
                    nomCat = CAT2_NOM;
                    break;
                case CAT3:
                    nomCat = CAT3_NOM;
                    break;
                case CAT4:
                    nomCat = CAT4_NOM;
                    break;
            }
            //Obtenim el nom del Club
            switch(arrayClub[i]){
                case CLUB0:
                   nomClub = CLUB_NOM0;
                   break;
                case CLUB1:
                   nomClub = CLUB_NOM1;
                   break;
                case CLUB2:
                   nomClub = CLUB_NOM2;
                   break;
                case CLUB3:
                   nomClub = CLUB_NOM3;
                   break;
                case CLUB4:
                   nomClub = CLUB_NOM4;
                   break;
                case CLUB5:
                   nomClub = CLUB_NOM5;
                   break;
            }
            System.out.println("\n\nLes teves dades són:"
                    +"\n----------------------------------------------------");
            System.out.println("ID \tData Naixement \tGenere \tCategoria \tClub");
            System.out.println(arrayIds[i]+"\t"+arrayMes[i]+"/"+arrayAny[i]
                    +"\t\t"+nomGenere+"\t"+""+nomCat+"\t"+nomClub);
            System.out.println("---------------------------------------"
                    + "-------------");
        }
        //Preguntem si es vol ordenar per any de naixement.
        System.out.println("\nVols mostrar el llistat ordenat per any de naixement?");
        System.out.println("NO - [0]");
        System.out.println("SI - [1]");
        dadaCorrecte = lector.hasNextInt();
        if (dadaCorrecte){//comprovem que és un número sencer
            seguir = lector.nextInt();//LLegim el valor introduït
            if(seguir == 1){//si és 1, els ordenara per any.       
                //Bucle per ordenar les posicions per l'any de naixement.
                for(int i = 0; i < numUser - 1; i++){
                    for (int j = i + 1; j < numUser; j++){
                        if(arrayAny[i] > arrayAny[j]){
                            canviAny = arrayAny[i];
                            arrayAny[i] = arrayAny[j];
                            arrayAny[j] = canviAny;
                            //Canviem la resta de valors.
                            canviId = arrayIds[i];
                            arrayIds[i] = arrayIds[j];
                            arrayIds[j] = canviId;
                            canviGenere = arrayGenere[i];
                            arrayGenere[i] = arrayGenere[j];
                            arrayGenere[j] = canviGenere;
                            canviMes = arrayMes[i];
                            arrayMes[i] = arrayMes[j];
                            arrayMes[j] = canviMes;
                            canviCat = arrayCat[i];
                            arrayCat[i] = arrayCat[j];
                            arrayCat[j] = canviCat;
                            canviClub = arrayClub[i];
                            arrayClub[i] = arrayClub[j];
                            arrayClub[j] = canviClub;
                        }
                    }
                }
                //Mostrem les dades ordenades
                System.out.println("\nLes dades ordenades per Any de Naixement:");
                for (int i=0; i<numUser;i++){
                    //Obtenim el Genere
                    switch(arrayGenere[i]){
                        case GENERE1:
                            nomGenere = NOM_G1;                    
                            break;
                        case GENERE2:
                            nomGenere = NOM_G2;                    
                            break;
                    }
                    //Obtenim el nom de la catgoria per mostrar
                    switch (arrayCat[i]){
                        case CAT1:
                            nomCat = CAT1_NOM;
                            break;
                        case CAT2:
                            nomCat = CAT2_NOM;
                            break;
                        case CAT3:
                            nomCat = CAT3_NOM;
                            break;
                        case CAT4:
                            nomCat = CAT4_NOM;
                            break;
                    }
                    //Obtenim el nom del Club
                    switch(arrayClub[i]){
                        case CLUB0:
                           nomClub = CLUB_NOM0;
                           break;
                        case CLUB1:
                           nomClub = CLUB_NOM1;
                           break;
                        case CLUB2:
                           nomClub = CLUB_NOM2;
                           break;
                        case CLUB3:
                           nomClub = CLUB_NOM3;
                           break;
                        case CLUB4:
                           nomClub = CLUB_NOM4;
                           break;
                        case CLUB5:
                           nomClub = CLUB_NOM5;
                           break;
                    }
                    System.out.println("------------------------------"
                            + "----------------------");
                    System.out.println("ID \tData Naixement \tGenere \tCategoria \tClub");
                    System.out.println(arrayIds[i]+"\t"+arrayMes[i]+"/"+arrayAny[i]
                            +"\t\t"+nomGenere+"\t"+""+nomCat+"\t"+nomClub);
                    System.out.println("---------------------------------------"
                            + "-------------");
                }
            }
        } else {
            System.out.println("Opcio incorrecta");
        }
        //Preguntem si es vol ordenar per un Club.
        System.out.println("\nVols mostrar el llistat ordenat per un Club?");
        System.out.println("NO - [0]");
        System.out.println("SI - [1]");
        dadaCorrecte = lector.hasNextInt();
        if (dadaCorrecte){//comprovem que és un número sencer
            seguir = lector.nextInt();//LLegim el valor introduït
            if(seguir == 1){//si és 1, els ordenara per club.
                //Demanem el club a l'usuari
                System.out.println("\nPer quin grup vols ordenar?");
                System.out.println("\t[0] - No federat");
                System.out.println("\t[1] - Barcelona");
                System.out.println("\t[2] - Tarragona");
                System.out.println("\t[3] - Hospitalet");
                System.out.println("\t[4] - Girona");
                System.out.println("\t[5] - Cerdanyola del Vallés");
                System.out.print("Ordena per: ");
                //Lectura de dades
                arrayClub[numUser] = lector.nextInt();
                //comprovem que els valor siguin els de les opcions
                for(int i = 0; i < numUser - 1; i++){
                    for (int j = i + 1; j < numUser; j++){
                        if(arrayClub[i] > arrayClub[j]){
                            canviClub = arrayClub[i];
                            arrayClub[i] = arrayClub[j];
                            arrayClub[j] = canviClub;
                            //Canviem la resta de valors.
                            canviId = arrayIds[i];
                            arrayIds[i] = arrayIds[j];
                            arrayIds[j] = canviId;
                            canviGenere = arrayGenere[i];
                            arrayGenere[i] = arrayGenere[j];
                            arrayGenere[j] = canviGenere;
                            canviMes = arrayMes[i];
                            arrayMes[i] = arrayMes[j];
                            arrayMes[j] = canviMes;
                            canviAny = arrayAny[i];
                            arrayAny[i] = arrayAny[j];
                            arrayAny[j] = canviAny;
                            canviCat = arrayCat[i];
                            arrayCat[i] = arrayCat[j];
                            arrayCat[j] = canviCat;
                        }
                    }
                }
                //Mostrem les dades ordenades
                System.out.println("\nLes dades ordenades per Club:");
                for (int i=0; i<numUser;i++){
                    //Obtenim el Genere
                    switch(arrayGenere[i]){
                        case GENERE1:
                            nomGenere = NOM_G1;                    
                            break;
                        case GENERE2:
                            nomGenere = NOM_G2;                    
                            break;
                    }
                    //Obtenim el nom de la catgoria per mostrar
                    switch (arrayCat[i]){
                        case CAT1:
                            nomCat = CAT1_NOM;
                            break;
                        case CAT2:
                            nomCat = CAT2_NOM;
                            break;
                        case CAT3:
                            nomCat = CAT3_NOM;
                            break;
                        case CAT4:
                            nomCat = CAT4_NOM;
                            break;
                    }
                    //Obtenim el nom del Club
                    switch(arrayClub[i]){
                        case CLUB0:
                           nomClub = CLUB_NOM0;
                           break;
                        case CLUB1:
                           nomClub = CLUB_NOM1;
                           break;
                        case CLUB2:
                           nomClub = CLUB_NOM2;
                           break;
                        case CLUB3:
                           nomClub = CLUB_NOM3;
                           break;
                        case CLUB4:
                           nomClub = CLUB_NOM4;
                           break;
                        case CLUB5:
                           nomClub = CLUB_NOM5;
                           break;
                    }
                    System.out.println("\n------------------------------"
                            + "----------------------");
                    System.out.println("ID \tData Naixement \tGenere \tCategoria \tClub");
                    System.out.println(arrayIds[i]+"\t"+arrayMes[i]+"/"+arrayAny[i]
                            +"\t\t"+nomGenere+"\t"+""+nomCat+"\t"+nomClub);
                    System.out.println("---------------------------------------"
                            + "-------------");
                }
            }
        } else {
            System.out.println("Opcio incorrecta");
        }
        //Mostrem el núm de participants introduïts
        System.out.println("S'han introduït "+numUser+" participants");
    }
}  