package exercici_integracio;
/**
 *
 * @author hmorenol
 */
import java.util.Scanner;
public class Team_Project4 {
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
    //Definim la constant per al màxim d'intents
    public static final int MAX_INTENTS = 3;
    //Definim la constant per al màxim de participants
    public static final int MAX_PARTICIPANTS = 10;
    //Definim les constants per seguir introduïnt dades
    public static final int MIN_SEGUIR = 0;
    public static final int MAX_SEGUIR = 1;
    
    public static void main (String[] agrs){
        //Declarem els arrays
        int[] arrayIds = new int[MAX_PARTICIPANTS];
        int[] arrayGenere = new int[MAX_PARTICIPANTS];
        int[] arrayMes = new int[MAX_PARTICIPANTS];
        int[] arrayAny = new int[MAX_PARTICIPANTS];
        int[] arrayCat = new int[MAX_PARTICIPANTS];
        int[] arrayClub = new int[MAX_PARTICIPANTS];
        
        //Declarem les variables        
        int canviDada, club = 0, comptador = 0, numUser= 0, seguir = 0;
        String nomGenere= "", nomCat = "", nomClub = "";
        Scanner lector = new Scanner(System.in);
        boolean dadaCorrecte = true, mesParticipants, clubCorrecte = false;
       
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
                        System.out.println("Error de dades");
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
                        System.out.println("Error de dades");
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
                                System.out.println("Error de dades");
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
                    dadaCorrecte = lector.hasNextInt();
                    if(dadaCorrecte){
                        //Lectura de dada
                        arrayGenere[numUser] = lector.nextInt();
                        //Comprovem que els valors siguin 1 o 2
                        if(arrayGenere[numUser] < GENERE1 || arrayGenere[numUser] > GENERE2){
                            dadaCorrecte = false;
                            System.out.println("Error de dades");
                        }
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
                    dadaCorrecte = lector.hasNextInt();
                    if (dadaCorrecte){
                        //Lectura de dades
                        arrayCat[numUser] = lector.nextInt();
                        //Comprovem que els valors siguin els de les opcions
                        if(arrayCat[numUser] < CAT1 || arrayCat[numUser] > CAT4){
                            dadaCorrecte = false;
                            System.out.println("Error de dades");
                        }
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
                    dadaCorrecte = lector.hasNextInt();
                    if(dadaCorrecte){
                        //Lectura de dades
                        arrayClub[numUser] = lector.nextInt();
                        //comprovem que els valor siguin els de les opcions
                        if(arrayClub[numUser] < CLUB0 || arrayClub[numUser] > CLUB5){
                            dadaCorrecte = false;
                            System.out.println("Error de dades");
                        }                        
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
                seguir = lector.nextInt();//LLegim el valor introduït
                if(seguir == 1){//el lector es 1, continuará afegint participants
                    mesParticipants = true;
                }
            } else {
                System.out.println("Opcio incorrecta");
            }                        
        } while ((mesParticipants) && (numUser < MAX_PARTICIPANTS));
        for (int i=0; i<numUser;i++){
            //Obtenim el Genere
            if(arrayGenere [i] == 1){
                nomGenere = NOM_G1;
            } else {
                nomGenere = NOM_G2;
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
            System.out.println("----------------------------------------------------");
            System.out.println("ID \tData Naixement \tGenere \tCategoria \tClub");
            System.out.println(arrayIds[i]+"\t"+arrayMes[i]+"/"+arrayAny[i]
                    +"\t\t"+nomGenere+"\t"+""+nomCat+"\t\t"+nomClub);
            System.out.println("---------------------------------------"
                    + "-------------");
        }
        //Mostrem la quantitat de participants
        System.out.println("S'han introduït " +numUser+ " participants");
        //Entrara en aquesta condició si n'hi ha mes d'un participant
        if (numUser > 1){
            comptador = 0;
            do{
                //Preguntem si es vol ordenar per any de naixement.
                System.out.println("\nVols mostrar el llistat ordenat per any de naixement?");
                System.out.println("NO - [0]");
                System.out.println("SI - [1]");
                dadaCorrecte = lector.hasNextInt();
                if (dadaCorrecte){//comprovem que és un número sencer
                    seguir = lector.nextInt();//LLegim el valor introduït
                    if(seguir < MIN_SEGUIR || seguir > MAX_SEGUIR){//si és 1, els ordenara per any.
                        dadaCorrecte = false;
                    }
                }
                //Si la opció es incorrecte mostrará el error.
                if((!dadaCorrecte) && (comptador < MAX_INTENTS)){
                    System.out.println("Dada errònia. Tria un valor [1] o [0].");
                }
                if(comptador == MAX_INTENTS){
                    System.out.println("S'ha superat el número d'intents");
                }
            } while ((!dadaCorrecte) && (comptador < MAX_INTENTS)); 
            //Si s'ha triar ordenar per any de naixement.
            if(seguir == MAX_SEGUIR){
                //Bucle per ordenar les posicions per l'any de naixement.
                for(int i = 0; i < numUser - 1; i++){
                    for (int j = i + 1; j < numUser; j++){
                        if(arrayAny[i] > arrayAny[j]){
                            canviDada = arrayAny[i];
                            arrayAny[i] = arrayAny[j];
                            arrayAny[j] = canviDada;
                            //Canviem la resta de valors.
                            canviDada = arrayIds[i];
                            arrayIds[i] = arrayIds[j];
                            arrayIds[j] = canviDada;
                            canviDada = arrayGenere[i];
                            arrayGenere[i] = arrayGenere[j];
                            arrayGenere[j] = canviDada;
                            canviDada = arrayMes[i];
                            arrayMes[i] = arrayMes[j];
                            arrayMes[j] = canviDada;
                            canviDada = arrayCat[i];
                            arrayCat[i] = arrayCat[j];
                            arrayCat[j] = canviDada;
                            canviDada = arrayClub[i];
                            arrayClub[i] = arrayClub[j];
                            arrayClub[j] = canviDada;
                        }
                    }
                }
                //Mostrem les dades ordenades
                System.out.println("\nLes dades ordenades per Any de Naixement:");
                for (int i=0; i<numUser;i++){
                    //Obtenim el Genere
                    if(arrayGenere [i] == 1){
                        nomGenere = NOM_G1;
                    } else {
                        nomGenere = NOM_G2;
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
                            +"\t\t"+nomGenere+"\t"+""+nomCat+"\t\t"+nomClub);
                    System.out.println("---------------------------------------"
                            + "-------------");
                }              
            }
            //Reiniciem el comptador d'intents
            comptador = 0;
            do {
                //Preguntem si es vol ordenar per un Club.
                System.out.println("\nVols mostrar el llistat ordenat per un Club?");
                System.out.println("NO - [0]");
                System.out.println("SI - [1]");
                dadaCorrecte = lector.hasNextInt();
                //comprovem que és un número sencer
                if (dadaCorrecte) {
                    seguir = lector.nextInt();//LLegim el valor introduït
                    if(seguir < MIN_SEGUIR || seguir > MAX_SEGUIR){//si és 1, els ordenara per any.
                        dadaCorrecte = false;
                    }
                }                
                comptador++;
                //Si la opció es incorrecte mostrará el error.
                if((!dadaCorrecte) && (comptador < MAX_INTENTS)){
                    System.out.println("Dada errònia. Tria un valor [1] o [0].");
                }
                if(comptador == MAX_INTENTS){
                    System.out.println("S'ha superat el número d'intents");
                }
            } while ((!dadaCorrecte) && (comptador < MAX_INTENTS));
            //Si tria ordenar per club.
            if(seguir == 1){
                //Reiniciem el comptador.
                comptador = 0;
                do {
                    //Demanem el club a l'usuari
                    System.out.println("\nPer quin grup vols ordenar?");
                    System.out.println("\t[0] - No federat");
                    System.out.println("\t[1] - Barcelona");
                    System.out.println("\t[2] - Tarragona");
                    System.out.println("\t[3] - Hospitalet");
                    System.out.println("\t[4] - Girona");
                    System.out.println("\t[5] - Cerdanyola del Vallés");
                    System.out.print("Ordena per: \n");
                    //Lectura de dades
                    dadaCorrecte = lector.hasNextInt();
                    if (dadaCorrecte){
                        club = lector.nextInt();
                        //
                        if ((club < CLUB0)|| (club > CLUB5)){
                            dadaCorrecte = false;
                        } else {
                            //Obtenim el nom del Club
                            switch(club){
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
                            //Bucle per comprovar que el club hi estigui entre els dels participants
                            for (int i=0; i < numUser; i++){
                                if (arrayClub[i]==club){
                                    clubCorrecte = true;
                                }
                            }
                        }
                    }
                    //Incrementem la variable comptador
                    comptador++;
                    //Si la opció es incorrecte mostrará el error.
                    if((!dadaCorrecte) && (comptador < MAX_INTENTS)){
                        System.out.println("Dada errona. Tria un valor [1] o [0].");
                    }
                    //Mostra un missatge d'error si s'ha superat els intents
                    if(comptador == MAX_INTENTS){
                        System.out.println("S'ha superat el número d'intents");
                    }
                    //Mostra un missatge d'error si no es troba el club seleccionat.
                    if (dadaCorrecte==true && clubCorrecte==false){
                        System.out.println("No es troba participants amb aquest club");
                    }
                } while ((!dadaCorrecte) && (comptador < MAX_INTENTS) && comptador < MAX_INTENTS);
                //Si totes les dades son correctes
                if ((dadaCorrecte) && clubCorrecte == true){
                    //bucle per ordenar y filtrar els participants
                    for (int i = 0; i < numUser - 1; i++){
                        for (int j = i + 1; j < numUser; j++){
                            if(arrayClub[i] > arrayClub[j]){
                                canviDada = arrayClub[i];
                                arrayClub[i] = arrayClub[j];
                                arrayClub[j] = canviDada;
                                //Canviem la resta de valors.
                                canviDada = arrayIds[i];
                                arrayIds[i] = arrayIds[j];
                                arrayIds[j] = canviDada;
                                canviDada = arrayGenere[i];
                                arrayGenere[i] = arrayGenere[j];
                                arrayGenere[j] = canviDada;
                                canviDada = arrayMes[i];
                                arrayMes[i] = arrayMes[j];
                                arrayMes[j] = canviDada;
                                canviDada = arrayAny[i];
                                arrayAny[i] = arrayAny[j];
                                arrayAny[j] = canviDada;
                                canviDada = arrayCat[i];
                                arrayCat[i] = arrayCat[j];
                                arrayCat[j] = canviDada;
                            }
                        }
                        //Filtrem per club
                        if(arrayClub[i] == club){
                            if(arrayGenere [i] == 1){
                                nomGenere = NOM_G1;
                            } else {
                                nomGenere = NOM_G2;
                            }
                            
                            if (arrayCat[i] > 0 && arrayCat[i] > 5){
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
                            }
                            //Mostrem les dades ordenades  
                            System.out.println("------------------------------"
                                    + "----------------------");
                            System.out.println("ID \tData Naixement \tGenere \tCategoria \tClub");
                            System.out.println(arrayIds[i]+"\t"+arrayMes[i]+"/"+arrayAny[i]
                                    +"\t\t"+nomGenere+"\t"+""+nomCat+"\t\t"+nomClub);
                            System.out.println("---------------------------------------"
                                    + "-------------");
                        }
                    }
                    System.out.println("\nLes dades ordenades per el club: " +nomClub);
                }                    
            }
        }        
    }
}


