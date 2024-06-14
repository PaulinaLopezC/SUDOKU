/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

//Importar paquete de sudoku para que las interfaces puedan interactuar con la logica
import sudoku.*;

/**
 *
 * @author Paulina
 */
public class Level {
    //matriz para determinar cuales respuestas estan bien o mal
    public int [][] colors = new int [9][9];
    //Matriz de nivel 1 correcta
    public int matrizCorrecta1[][] = {{8,7,6,4,9,1,2,5,3},
                      {4,1,3,5,2,8,9,7,6},
                      {5,9,2,3,6,7,1,8,4},
                      {7,2,4,6,3,5,8,1,9},
                      {9,5,8,7,1,4,6,3,2},
                      {6,3,1,2,8,9,5,4,7},
                      {3,4,9,8,5,2,7,6,1},
                      {1,8,7,9,4,6,3,2,5},
                      {2,6,5,1,7,3,4,9,8}};
    //matriz del nivel dos correcta
    public int matrizCorrecta2[][] = {{9,6,3,1,7,4,2,5,8},
                      {1,7,8,3,2,5,6,4,9},
                      {2,5,4,6,8,9,7,3,1},
                      {8,2,1,4,3,7,5,9,6},
                      {4,9,6,8,5,2,3,1,7},
                      {7,3,5,9,6,1,8,2,4},
                      {5,8,9,7,1,3,4,6,2},
                      {3,1,7,2,4,6,9,8,5},
                      {6,4,2,5,9,8,1,7,3}};
    //matriz del nivel tres correcta
    public int matrizCorrecta3[][] = {{5,3,4,6,7,8,9,1,2},
                      {6,7,2,1,9,5,3,4,8},
                      {1,9,8,3,4,2,5,6,7},
                      {8,5,9,7,6,1,4,2,3},
                      {4,2,6,8,5,3,7,9,1},
                      {7,1,3,9,2,4,8,5,6},
                      {9,6,1,5,3,7,2,8,4},
                      {2,8,7,4,1,9,6,3,5},
                      {3,4,5,2,8,6,1,7,9}};
    
        //Metodo de la logica para checar si el usuario se equivoco o tuvo respuestas correctas
    //tiene como parametros, la matriz correcta a comparar dependiendo del nivel y la matriz que el usuario ingreso
    public void check(int[][] usuario,int[][] matriz ){
        int posicion =1;
        //ciclo que recorre las matrices para compararlas
        for (int i = 0; i < 9; i++){
            for (int j = 0; j < 9; j++){
                if(usuario[i][j]== matriz[i][j]){
                    colors[i][j]=1;
                }else{
                    colors[i][j]=0;
                }
            }
        }
    }
}
