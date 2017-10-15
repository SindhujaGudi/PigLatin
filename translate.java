

import java.util.Scanner;


public class translate {


    public static void main(String [] args){

        int i;

        do{
            Scanner keyboard = new Scanner(System.in);
            System.out.println("choose 1 for Engligh - Latin, choose 2 for Latin - English ");
            i = keyboard.nextInt();
            
            switch(i){
                case 1:    eng2Latin();

                break;

                case 2:  latin2Eng();

                break;

                default : break;

            }return;
        
        }while(true);
        
    }

    private static void eng2Latin(){

        StringBuilder eng2LatinText = new StringBuilder();

        String add = "ay";

        Scanner sc = new Scanner(System.in);

        System.out.println("Keyboard input in English: ");


        String englishText = sc.nextLine();

        englishText = englishText.toLowerCase();

        String[] tokens = englishText.split("\\s+");

        for(String s : tokens){

            if(s.length()==0){

                return;
            }

            if(s.length()==1){

                eng2LatinText = eng2LatinText.append(s + add +" ");

            }else{

            char first= s.charAt(0);

            char last =s.charAt(s.length()-1);

            eng2LatinText = eng2LatinText.append(s.substring(1, s.length()-1) + last + first + add + " ");

            }

        }

        System.out.print("Latin: "+upperCaseFirst(eng2LatinText.toString()));

        System.out.println();

    }
    
    private static void latin2Eng(){

        StringBuilder latinToEnglishText = new StringBuilder();

        String latin2Eng;

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Keyboard input in Latin: ");


        latin2Eng = sc1.nextLine();

        latin2Eng = latin2Eng.toLowerCase();

        String[] Latin = latin2Eng.toString().split("\\s+");

        for(String s : Latin){

            if(s.length()==0){
                return;
            }
            if(s.length()<=2)
            {
                latinToEnglishText = latinToEnglishText.append("enter a string with vowels");
            }
            else if(s.length()==3)
            {
                s = s.substring(0, s.length()-2);
                latinToEnglishText = latinToEnglishText.append(s+" ");
            }
            else{
               s = s.substring(0, s.length()-2);
            char first= s.charAt(0);
            char last =s.charAt(s.length()-1);
            latinToEnglishText = latinToEnglishText.append(" "+last+first+s.substring(1, s.length()-1).toString()+" ");
            }

        }

        System.out.print("English: "+upperCaseFirst(latinToEnglishText.toString()));

        System.out.println();

    }

    private static String upperCaseFirst(String value) {

        char[] array = value.toCharArray();
        array[0] = Character.toUpperCase(array[0]);
        return new String(array);

    }

}
