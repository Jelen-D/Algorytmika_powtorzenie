public class ModuloFromName {

    private String name;

    public ModuloFromName(String name) {
        this.name = name;
    }

    //A     B 	C 	D 	E 	F 	G 	H 	I 	J 	K 	L 	M 	N 	O 	P 	Q 	R 	S 	T 	U 	V 	W 	X 	Y 	Z
    //char[] alfabet = " abc"

    public void modulo(){
       char[] word = name.toLowerCase().toCharArray();
       int[] wordInNumber = new int[word.length];

       for (int i=0; i < word.length; i++){
            switch (word[i]){
               case 'a':
                   wordInNumber[i] = 1;
                   break;
                case 'b':
                    wordInNumber[i] = 2;
                    break;
                case 'c':
                    wordInNumber[i] = 3;
                    break;
                case 'd':
                    wordInNumber[i] = 4;
                    break;
                case 'e':
                    wordInNumber[i] = 5;
                    break;
                case 'f':
                    wordInNumber[i] = 6;
                    break;
                case 'g':
                    wordInNumber[i] = 7;
                    break;
                case 'h':
                    wordInNumber[i] = 8;
                    break;
                case 'i':
                    wordInNumber[i] = 9;
                    break;
                case 'j':
                    wordInNumber[i] = 10;
                    break;
                case 'k':
                    wordInNumber[i] = 11;
                    break;
                case 'l':
                    wordInNumber[i] = 12;
                    break;
                case 'm':
                    wordInNumber[i] = 13;
                    break;
                case'n':
                    wordInNumber[i] = 14;
                    break;
                case'o':
                    wordInNumber[i] = 15;
                    break;
                case 'p':
                    wordInNumber[i] = 16;
                    break;
                case 'q':
                    wordInNumber[i] = 17;
                    break;
                case 'r':
                    wordInNumber[i] = 18;
                    break;
                case 's':
                    wordInNumber[i] = 19;
                    break;
                case 't':
                    wordInNumber[i] = 20;
                    break;
                case 'u':
                    wordInNumber[i] = 21;
                    break;
                case 'v':
                    wordInNumber[i] = 22;
                    break;
                case 'w':
                    wordInNumber[i] = 23;
                    break;
                case 'x':
                    wordInNumber[i] = 24;
                    break;
                case 'y':
                    wordInNumber[i] = 25;
                    break;
                case 'z':
                    wordInNumber[i] = 26;
                    break;
                    default:
                        wordInNumber[i] = 0;
                        break;

           }
       }

       int nameSum = 0;
       for (int j =0; j<wordInNumber.length; j++){
           int x = wordInNumber[j];
           nameSum = nameSum + x;
       }
        System.out.println("Imię to:" + name);
        System.out.println("Suma dla imienia wynosi: " + nameSum);
        System.out.println("Modulo z 2 dla sumy z imienia wynosi: " + nameSum%2);
    }
}
