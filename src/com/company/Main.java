package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
       //Užduotis nr.1
        String pirmasPavadinimas = "Troškūnai";
        String antrasPavadinimas = "Kazlų Rūda";

            System.out.println('\n' + pirmasPavadinimas + '\n' + antrasPavadinimas + '\n');
       //------------------------------------------------------------------------
       //Užduotis nr.2
       int fibaPirmas;
       int fibaAntras;
       int fibaTrecias;

                fibaPirmas = 0;
                fibaAntras = 1;

        for (int i = 0; i <= 19; i++) {
            if (i!=0) {
                fibaTrecias=fibaPirmas + fibaAntras;
                System.out.println(fibaTrecias);
                fibaPirmas = fibaAntras;
                fibaAntras = fibaTrecias;
            }
            else {
                System.out.println(fibaPirmas);
                System.out.println(fibaAntras);
            }
        }

        //------------------------------------------------------------------------
        //Užduotis nr.3

        String phrase = "Mokausi programuoti Java programavimo kalba";
        String reversePhrase = "";
            for (int i = phrase.length()-1; i>=0; i--){
                reversePhrase = reversePhrase + phrase.charAt(i);
            }
            System.out.println('\n' + reversePhrase + '\n');

            //------------------------------------------------------------------------
        //Užduotis nr.4

        int[] arrayOne = {-10, 0, 2, 9, -5};
        int largest = arrayOne[0];
//        int[] arrayTwo = new int[10];


        for (int i = 0; i < arrayOne.length; i++){
            if (arrayOne[i] >= largest){
                largest = arrayOne[i];

                System.out.println(largest);
            }

        }
        //------------------------------------------------------------------------
        //Užduotis nr.5

    }

}
