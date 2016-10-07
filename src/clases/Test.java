/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author rmorales1
 */
public class Test {
    public static void main(String[] args) {
        int m[][]=new int[4][4];
        m[0][0]=1;
        m[0][1]=2;
        m[0][2]=3;
        m[0][3]=4;
        m[1][0]=5;
        m[1][1]=6;
        m[1][2]=7;
        m[1][3]=8;
        m[2][0]=9;
        m[2][1]=2;
        m[2][2]=1;
        m[2][3]=0;
        m[3][0]=4;
        m[3][1]=3;
        m[3][2]=5;
        m[3][3]=7;
        
     
        
        
        System.out.println(Helper.recorridoDiagonalSecundariaAbajo(m,1,2));
        
        
    }
}
