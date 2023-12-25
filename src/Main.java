/*
Scrivi un programma che accetti in input due vettori di interi (A e B) di 5 posti ciascuno e scriva su disco la loro somma;
in seguito caricare il file salvato in un vettore T (avente la stessa dimensione dei due precedenti) e stamparlo a video.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int nParam = 2;
        int[] vector1, vector2;
        if(args.length >= nParam){
            String[] v1S = args[0].split(" ");
            String[] v2S = args[1].split(" ");

            /* DEBUG param
            for (int i = 0; i < v1S.length; i++) {
                System.out.println(v1S[i]);
            }

             */

            vector1 = new int[v1S.length];
            vector2 = new int[v2S.length];
            for (int i = 0; i < vector1.length; i++) {
                vector1[i] = Integer.parseInt(v1S[i]);
            }
            for (int i = 0; i < vector2.length; i++) {
                vector2[i] = Integer.parseInt(v2S[i]);
            }

            for (int i = 0; i < vector1.length; i++) {
                System.out.print(vector1[i]+" ");
            }
            System.out.println("");
            for (int i = 0; i < vector2.length; i++) {
                System.out.print(vector2[i]+" ");
            }

        }

    }
}