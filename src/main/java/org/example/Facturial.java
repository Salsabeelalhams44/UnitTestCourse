package org.example;

public class Facturial {
    public int  getFuctorial(int number){
        int factourial=1;
        for (int i=1; i<=number; i++)
            factourial*=i;
        return factourial;
    }
}
