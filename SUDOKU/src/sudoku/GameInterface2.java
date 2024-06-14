/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudoku;

//importar paquete de logica para relacionar ambos paquetes.
import java.awt.Color;
import java.awt.event.KeyEvent;
import logic.Level;

/**
 *
 * @author Paulina
 */
public class GameInterface2 extends javax.swing.JFrame {
    // Composition of the logic level to the game interface of level 2
    private Level level;
    // matriz de la informacion que ingrese el usuario
    public int matrizChecar[][] = new int[9][9];
    //contador para verificar si todas las tuvo correctas
    private int contador =0;
    /**
     * Creates new form GameInterface2
     */
    
    //Metodo donde asignamos a Level y empezamos por default el sudoku y los valores que se van a visualizar para qeu el usuario pueda jugar
    public GameInterface2() {
        this.level = new Level();
        initComponents();
        empezarJuego();
    }
    //Metodo para empezar por default el juego con ciertas condiciones ya implemnetadas desde el inicio
    public void empezarJuego(){
        //Mensaje en el textfield de qeu el juego ha iniciado
        Message.setText("JUEGO INICIADO");
        // color del fondo de la textfield
        Message.setBackground(Color.YELLOW);
        // false para que el usuario no pueda editar esa textfield
        Message.setEditable(false);
        //ASIGNACION DE CADA VALOR FIJO DE CIERTAS TEXTFIEL DEPENDIENDO EL NIVEL DEL SUDOKU QUE SE JUEGE APARECEN EN AUTOMATICO DISTINTAS CELDAS FIJAS SIN PODER SER EDITADAS
        block2.setText(String.valueOf(level.matrizCorrecta2[0][1]));
        //COLOR DEL FONDO DE LA TEXTFIELD
        block2.setBackground(Color.YELLOW);
        // FALSE PARA QUE EL USUARIO NO PUEDA EDITAR ESA TEXTFIELD
        block2.setEditable(false);
        block6.setText(String.valueOf(level.matrizCorrecta2[1][2]));
        block6.setBackground(Color.YELLOW);
        block6.setEditable(false);
        block7.setText(String.valueOf(level.matrizCorrecta2[2][0]));
        block7.setBackground(Color.YELLOW);
        block7.setEditable(false);
        block10.setText(String.valueOf(level.matrizCorrecta2[3][0]));
        block10.setBackground(Color.YELLOW);
        block10.setEditable(false);
        block15.setText(String.valueOf(level.matrizCorrecta2[4][2]));
        block15.setBackground(Color.YELLOW);
        block15.setEditable(false);
        block16.setText(String.valueOf(level.matrizCorrecta2[5][0]));
        block16.setBackground(Color.YELLOW);
        block16.setEditable(false);
        block19.setText(String.valueOf(level.matrizCorrecta2[6][0]));
        block19.setBackground(Color.YELLOW);
        block19.setEditable(false);
        block24.setText(String.valueOf(level.matrizCorrecta2[7][2]));
        block24.setBackground(Color.YELLOW);
        block24.setEditable(false);
        block26.setText(String.valueOf(level.matrizCorrecta2[8][1]));
        block26.setBackground(Color.YELLOW);
        block26.setEditable(false);
        block28.setText(String.valueOf(level.matrizCorrecta2[0][3]));
        block28.setBackground(Color.YELLOW);
        block28.setEditable(false);
        block30.setText(String.valueOf(level.matrizCorrecta2[0][5]));
        block30.setBackground(Color.YELLOW);
        block30.setEditable(false);
        block31.setText(String.valueOf(level.matrizCorrecta2[1][3]));
        block31.setBackground(Color.YELLOW);
        block31.setEditable(false);
        block33.setText(String.valueOf(level.matrizCorrecta2[1][5]));
        block33.setBackground(Color.YELLOW);
        block33.setEditable(false);
        block37.setText(String.valueOf(level.matrizCorrecta2[3][3]));
        block37.setBackground(Color.YELLOW);
        block37.setEditable(false);
        block39.setText(String.valueOf(level.matrizCorrecta2[3][5]));
        block39.setBackground(Color.YELLOW);
        block39.setEditable(false);
        block43.setText(String.valueOf(level.matrizCorrecta2[5][3]));
        block43.setBackground(Color.YELLOW);
        block43.setEditable(false);
        block45.setText(String.valueOf(level.matrizCorrecta2[5][5]));
        block45.setBackground(Color.YELLOW);
        block45.setEditable(false);
        block49.setText(String.valueOf(level.matrizCorrecta2[7][3]));
        block49.setBackground(Color.YELLOW);
        block49.setEditable(false);
        block51.setText(String.valueOf(level.matrizCorrecta2[7][5]));
        block51.setBackground(Color.YELLOW);
        block51.setEditable(false);
        block52.setText(String.valueOf(level.matrizCorrecta2[8][3]));
        block52.setBackground(Color.YELLOW);
        block52.setEditable(false);
        block54.setText(String.valueOf(level.matrizCorrecta2[8][5]));
        block54.setBackground(Color.YELLOW);
        block54.setEditable(false);
        block56.setText(String.valueOf(level.matrizCorrecta2[0][7]));
        block56.setBackground(Color.YELLOW);
        block56.setEditable(false);
        block58.setText(String.valueOf(level.matrizCorrecta2[1][6]));
        block58.setBackground(Color.YELLOW);
        block58.setEditable(false);
        block63.setText(String.valueOf(level.matrizCorrecta2[2][8]));
        block63.setBackground(Color.YELLOW);
        block63.setEditable(false);
        block66.setText(String.valueOf(level.matrizCorrecta2[3][8]));
        block66.setBackground(Color.YELLOW);
        block66.setEditable(false);
        block67.setText(String.valueOf(level.matrizCorrecta2[4][6]));
        block67.setBackground(Color.YELLOW);
        block67.setEditable(false);
        block72.setText(String.valueOf(level.matrizCorrecta2[5][8]));
        block72.setBackground(Color.YELLOW);
        block72.setEditable(false);
        block75.setText(String.valueOf(level.matrizCorrecta2[6][8]));
        block75.setBackground(Color.YELLOW);
        block75.setEditable(false);
        block76.setText(String.valueOf(level.matrizCorrecta2[7][6]));
        block76.setBackground(Color.YELLOW);
        block76.setEditable(false);
        block80.setText(String.valueOf(level.matrizCorrecta2[8][7]));
        block80.setBackground(Color.YELLOW);
        block80.setEditable(false);
    }
    //Metodo de asignacion de valores que ingresa el usuario a las textfield hacia la matrizChecar para usar despue slogica y comparar
    public void valores(){
        //Asignacion de valor en cierta posicion en la matriz de lo que ingresa el usuario a la textfield
        matrizChecar[0][0] = Integer.parseInt(block1.getText());
        matrizChecar[0][1] = Integer.parseInt(block2.getText());
        matrizChecar[0][2] = Integer.parseInt(block3.getText());
        matrizChecar[0][3] = Integer.parseInt(block28.getText());
        matrizChecar[0][4] = Integer.parseInt(block29.getText());
        matrizChecar[0][5] = Integer.parseInt(block30.getText());
        matrizChecar[0][6] = Integer.parseInt(block55.getText());
        matrizChecar[0][7] = Integer.parseInt(block56.getText());
        matrizChecar[0][8] = Integer.parseInt(block57.getText());
        
        matrizChecar[1][0] = Integer.parseInt(block4.getText());
        matrizChecar[1][1] = Integer.parseInt(block5.getText());
        matrizChecar[1][2] = Integer.parseInt(block6.getText());
        matrizChecar[1][3] = Integer.parseInt(block31.getText());
        matrizChecar[1][4] = Integer.parseInt(block32.getText());
        matrizChecar[1][5] = Integer.parseInt(block33.getText());
        matrizChecar[1][6] = Integer.parseInt(block58.getText());
        matrizChecar[1][7] = Integer.parseInt(block59.getText());
        matrizChecar[1][8] = Integer.parseInt(block60.getText());
        
        matrizChecar[2][0] = Integer.parseInt(block7.getText());
        matrizChecar[2][1] = Integer.parseInt(block8.getText());
        matrizChecar[2][2] = Integer.parseInt(block9.getText());
        matrizChecar[2][3] = Integer.parseInt(block34.getText());
        matrizChecar[2][4] = Integer.parseInt(block35.getText());
        matrizChecar[2][5] = Integer.parseInt(block36.getText());
        matrizChecar[2][6] = Integer.parseInt(block61.getText());
        matrizChecar[2][7] = Integer.parseInt(block62.getText());
        matrizChecar[2][8] = Integer.parseInt(block63.getText());
        
        matrizChecar[3][0] = Integer.parseInt(block10.getText());
        matrizChecar[3][1] = Integer.parseInt(block11.getText());
        matrizChecar[3][2] = Integer.parseInt(block12.getText());
        matrizChecar[3][3] = Integer.parseInt(block37.getText());
        matrizChecar[3][4] = Integer.parseInt(block38.getText());
        matrizChecar[3][5] = Integer.parseInt(block39.getText());
        matrizChecar[3][6] = Integer.parseInt(block64.getText());
        matrizChecar[3][7] = Integer.parseInt(block65.getText());
        matrizChecar[3][8] = Integer.parseInt(block66.getText());
        
        matrizChecar[4][0] = Integer.parseInt(block13.getText());
        matrizChecar[4][1] = Integer.parseInt(block14.getText());
        matrizChecar[4][2] = Integer.parseInt(block15.getText());
        matrizChecar[4][3] = Integer.parseInt(block40.getText());
        matrizChecar[4][4] = Integer.parseInt(block41.getText());
        matrizChecar[4][5] = Integer.parseInt(block42.getText());
        matrizChecar[4][6] = Integer.parseInt(block67.getText());
        matrizChecar[4][7] = Integer.parseInt(block68.getText());
        matrizChecar[4][8] = Integer.parseInt(block69.getText());
        
        matrizChecar[5][0] = Integer.parseInt(block16.getText());
        matrizChecar[5][1] = Integer.parseInt(block17.getText());
        matrizChecar[5][2] = Integer.parseInt(block18.getText());
        matrizChecar[5][3] = Integer.parseInt(block43.getText());
        matrizChecar[5][4] = Integer.parseInt(block44.getText());
        matrizChecar[5][5] = Integer.parseInt(block45.getText());
        matrizChecar[5][6] = Integer.parseInt(block70.getText());
        matrizChecar[5][7] = Integer.parseInt(block71.getText());
        matrizChecar[5][8] = Integer.parseInt(block72.getText());
        
        matrizChecar[6][0] = Integer.parseInt(block19.getText());
        matrizChecar[6][1] = Integer.parseInt(block20.getText());
        matrizChecar[6][2] = Integer.parseInt(block21.getText());
        matrizChecar[6][3] = Integer.parseInt(block46.getText());
        matrizChecar[6][4] = Integer.parseInt(block47.getText());
        matrizChecar[6][5] = Integer.parseInt(block48.getText());
        matrizChecar[6][6] = Integer.parseInt(block73.getText());
        matrizChecar[6][7] = Integer.parseInt(block74.getText());
        matrizChecar[6][8] = Integer.parseInt(block75.getText());
        
        matrizChecar[7][0] = Integer.parseInt(block22.getText());
        matrizChecar[7][1] = Integer.parseInt(block23.getText());
        matrizChecar[7][2] = Integer.parseInt(block24.getText());
        matrizChecar[7][3] = Integer.parseInt(block49.getText());
        matrizChecar[7][4] = Integer.parseInt(block50.getText());
        matrizChecar[7][5] = Integer.parseInt(block51.getText());
        matrizChecar[7][6] = Integer.parseInt(block76.getText());
        matrizChecar[7][7] = Integer.parseInt(block77.getText());
        matrizChecar[7][8] = Integer.parseInt(block78.getText());
        
        matrizChecar[8][0] = Integer.parseInt(block25.getText());
        matrizChecar[8][1] = Integer.parseInt(block26.getText());
        matrizChecar[8][2] = Integer.parseInt(block27.getText());
        matrizChecar[8][3] = Integer.parseInt(block52.getText());
        matrizChecar[8][4] = Integer.parseInt(block53.getText());
        matrizChecar[8][5] = Integer.parseInt(block54.getText());
        matrizChecar[8][6] = Integer.parseInt(block79.getText());
        matrizChecar[8][7] = Integer.parseInt(block80.getText());
        matrizChecar[8][8] = Integer.parseInt(block81.getText()); 

    }
    // Metodo de comparacion una vez implementada la logica, de si es correcto el valor que ingreso el usuario
    public void colores(){
        //condicion de If para verificar si esta bien o mal la respuesta del usuario  en cada casilla a adivinar
        if(level.colors[0][0]==1){
            //Si se cumple, la casilla se torna de color verde, indicando que la respuesta es correcta
            block1.setBackground(Color.GREEN);
            //contador mas 1 para ver cuantas respuestas son correctas
            contador++;
        }else{
            //Si no, la casilla se torna de color rojo indicando que la respuesta es erronea
            block1.setBackground(Color.RED);
        }
        if(level.colors[0][2]==1){
            block3.setBackground(Color.GREEN);
            contador++;
        }else{
            block3.setBackground(Color.RED);
        }
        if(level.colors[1][0]==1){
            block4.setBackground(Color.GREEN);
            contador++;
        }else{
            block4.setBackground(Color.RED);
        }
        if(level.colors[1][1]==1){
            block5.setBackground(Color.GREEN);
            contador++;
        }else{
            block5.setBackground(Color.RED);
        }
        if(level.colors[2][1]==1){
            block8.setBackground(Color.GREEN);
            contador++;
        }else{
            block8.setBackground(Color.RED);
        }
        if(level.colors[2][2]==1){
            block9.setBackground(Color.GREEN);
            contador++;
        }else{
            block9.setBackground(Color.RED);
        }
        if(level.colors[3][1]==1){
            block11.setBackground(Color.GREEN);
            contador++;
        }else{
            block11.setBackground(Color.RED);
        }
        if(level.colors[3][2]==1){
            block12.setBackground(Color.GREEN);
            contador++;
        }else{
            block12.setBackground(Color.RED);
        }
        if(level.colors[4][0]==1){
            block13.setBackground(Color.GREEN);
            contador++;
        }else{
            block13.setBackground(Color.RED);
        }
        if(level.colors[4][1]==1){
            block14.setBackground(Color.GREEN);
            contador++;
        }else{
            block14.setBackground(Color.RED);
        }
        if(level.colors[5][1]==1){
            block17.setBackground(Color.GREEN);
            contador++;
        }else{
            block17.setBackground(Color.RED);
        }
        if(level.colors[5][2]==1){
            block18.setBackground(Color.GREEN);
            contador++;
        }else{
            block18.setBackground(Color.RED);
        }
        if(level.colors[6][1]==1){
            block20.setBackground(Color.GREEN);
            contador++;
        }else{
            block20.setBackground(Color.RED);
        }
        if(level.colors[6][2]==1){
            block21.setBackground(Color.GREEN);
            contador++;
        }else{
            block21.setBackground(Color.RED);
        }
        if(level.colors[7][0]==1){
            block22.setBackground(Color.GREEN);
            contador++;
        }else{
            block22.setBackground(Color.RED);
        }
        if(level.colors[7][1]==1){
            block23.setBackground(Color.GREEN);
            contador++;
        }else{
            block23.setBackground(Color.RED);
        }
        if(level.colors[8][0]==1){
            block25.setBackground(Color.GREEN);
            contador++;
        }else{
            block25.setBackground(Color.RED);
        }
        if(level.colors[8][2]==1){
            block27.setBackground(Color.GREEN);
            contador++;
        }else{
            block27.setBackground(Color.RED);
        }
        if(level.colors[0][4]==1){
            block29.setBackground(Color.GREEN);
            contador++;
        }else{
            block29.setBackground(Color.RED);
        }
        if(level.colors[1][4]==1){
            block32.setBackground(Color.GREEN);
            contador++;
        }else{
            block32.setBackground(Color.RED);
        }
        if(level.colors[2][3]==1){
            block34.setBackground(Color.GREEN);
            contador++;
        }else{
            block34.setBackground(Color.RED);
        }
        if(level.colors[2][4]==1){
            block35.setBackground(Color.GREEN);
            contador++;
        }else{
            block35.setBackground(Color.RED);
        }
        if(level.colors[2][5]==1){
            block36.setBackground(Color.GREEN);
            contador++;
        }else{
            block36.setBackground(Color.RED);
        }
        if(level.colors[3][4]==1){
            block38.setBackground(Color.GREEN);
            contador++;
        }else{
            block38.setBackground(Color.RED);
        }
        if(level.colors[4][3]==1){
            block40.setBackground(Color.GREEN);
            contador++;
        }else{
            block40.setBackground(Color.RED);
        }
        if(level.colors[4][4]==1){
            block41.setBackground(Color.GREEN);
            contador++;
        }else{
            block41.setBackground(Color.RED);
        }
        if(level.colors[4][5]==1){
            block42.setBackground(Color.GREEN);
            contador++;
        }else{
            block42.setBackground(Color.RED);
        }
        if(level.colors[5][4]==1){
            block44.setBackground(Color.GREEN);
            contador++;
        }else{
            block44.setBackground(Color.RED);
        }
        if(level.colors[6][3]==1){
            block46.setBackground(Color.GREEN);
            contador++;
        }else{
            block46.setBackground(Color.RED);
        }
        if(level.colors[6][4]==1){
            block47.setBackground(Color.GREEN);
            contador++;
        }else{
            block47.setBackground(Color.RED);
        }
        if(level.colors[6][5]==1){
            block48.setBackground(Color.GREEN);
            contador++;
        }else{
            block48.setBackground(Color.RED);
        }
        if(level.colors[7][4]==1){
            block50.setBackground(Color.GREEN);
            contador++;
        }else{
            block50.setBackground(Color.RED);
        }
        if(level.colors[8][4]==1){
            block53.setBackground(Color.GREEN);
            contador++;
        }else{
            block53.setBackground(Color.RED);
        }
        if(level.colors[0][6]==1){
            block55.setBackground(Color.GREEN);
            contador++;
        }else{
            block55.setBackground(Color.RED);
        }
        if(level.colors[0][8]==1){
            block57.setBackground(Color.GREEN);
            contador++;
        }else{
            block57.setBackground(Color.RED);
        }
        if(level.colors[1][7]==1){
            block59.setBackground(Color.GREEN);
            contador++;
        }else{
            block59.setBackground(Color.RED);
        }
        if(level.colors[1][8]==1){
            block60.setBackground(Color.GREEN);
            contador++;
        }else{
            block60.setBackground(Color.RED);
        }
        if(level.colors[2][6]==1){
            block61.setBackground(Color.GREEN);
            contador++;
        }else{
            block61.setBackground(Color.RED);
        }
        if(level.colors[2][7]==1){
            block62.setBackground(Color.GREEN);
            contador++;
        }else{
            block62.setBackground(Color.RED);
        }
        if(level.colors[3][6]==1){
            block64.setBackground(Color.GREEN);
            contador++;
        }else{
            block64.setBackground(Color.RED);
        }
        if(level.colors[3][7]==1){
            block65.setBackground(Color.GREEN);
            contador++;
        }else{
            block65.setBackground(Color.RED);
        }
        if(level.colors[4][7]==1){
            block68.setBackground(Color.GREEN);
            contador++;
        }else{
            block68.setBackground(Color.RED);
        }
        if(level.colors[4][8]==1){
            block69.setBackground(Color.GREEN);
            contador++;
        }else{
            block69.setBackground(Color.RED);
        }
        if(level.colors[5][6]==1){
            block70.setBackground(Color.GREEN);
            contador++;
        }else{
            block70.setBackground(Color.RED);
        }
        if(level.colors[5][7]==1){
            block71.setBackground(Color.GREEN);
            contador++;
        }else{
            block71.setBackground(Color.RED);
        }
        if(level.colors[6][6]==1){
            block73.setBackground(Color.GREEN);
            contador++;
        }else{
            block73.setBackground(Color.RED);
        }
        if(level.colors[6][7]==1){
            block74.setBackground(Color.GREEN);
            contador++;
        }else{
            block74.setBackground(Color.RED);
        }
        if(level.colors[7][7]==1){
            block77.setBackground(Color.GREEN);
            contador++;
        }else{
            block77.setBackground(Color.RED);
        }
        if(level.colors[7][8]==1){
            block78.setBackground(Color.GREEN);
            contador++;
        }else{
            block78.setBackground(Color.RED);
        }
        if(level.colors[8][6]==1){
            block79.setBackground(Color.GREEN);
            contador++;
        }else{
            block79.setBackground(Color.RED);
        }
        if(level.colors[8][8]==1){
            block81.setBackground(Color.GREEN);
            contador++;
        }else{
            block81.setBackground(Color.RED);
        }
    }
    // Metodo para reinicar el juego, borrando el dato de cada casilla que ingreso anteriormente el usuario antes de querer reiniicar el juego
    public void delate(){
        //Mensaje de que se reinicio el juego
        Message.setText("JUEGO REINICIADO");
        // color del fondo de la textfield
        Message.setBackground(Color.PINK);
        // false para que el usuario no pueda editar esa textfield
        Message.setEditable(false);
        // se borra la informacion que en usuario proporciono en cada casilla a adivinar, para reiniciar el juego
        block1.setText("");
        // color del fondo de la textfield para reiniciar juego
        block1.setBackground(Color.WHITE);
        block3.setText("");
        block3.setBackground(Color.WHITE);
        block4.setText("");
        block4.setBackground(Color.WHITE);
        block5.setText("");
        block5.setBackground(Color.WHITE);
        block8.setText("");
        block38.setBackground(Color.WHITE);
        block9.setText("");
        block9.setBackground(Color.WHITE);
        block11.setText("");
        block11.setBackground(Color.WHITE);
        block12.setText("");
        block12.setBackground(Color.WHITE);
        block13.setText("");
        block13.setBackground(Color.WHITE);
        block14.setText("");
        block14.setBackground(Color.WHITE);
        block17.setText("");
        block17.setBackground(Color.WHITE);
        block18.setText("");
        block18.setBackground(Color.WHITE);
        block20.setText("");
        block20.setBackground(Color.WHITE);
        block21.setText("");
        block21.setBackground(Color.WHITE);
        block22.setText("");
        block22.setBackground(Color.WHITE);
        block23.setText("");
        block23.setBackground(Color.WHITE);
        block25.setText("");
        block25.setBackground(Color.WHITE);
        block27.setText("");
        block27.setBackground(Color.WHITE);
        block29.setText("");
        block29.setBackground(Color.WHITE);
        block32.setText("");
        block32.setBackground(Color.WHITE);
        block34.setText("");
        block34.setBackground(Color.WHITE);
        block35.setText("");
        block35.setBackground(Color.WHITE);
        block36.setText("");
        block36.setBackground(Color.WHITE);
        block38.setText("");
        block38.setBackground(Color.WHITE);
        block40.setText("");
        block40.setBackground(Color.WHITE);
        block41.setText("");
        block41.setBackground(Color.WHITE);
        block42.setText("");
        block42.setBackground(Color.WHITE);
        block44.setText("");
        block44.setBackground(Color.WHITE);
        block46.setText("");
        block46.setBackground(Color.WHITE);
        block47.setText("");
        block47.setBackground(Color.WHITE);
        block48.setText("");
        block48.setBackground(Color.WHITE);
        block50.setText("");
        block50.setBackground(Color.WHITE);
        block53.setText("");
        block53.setBackground(Color.WHITE);
        block55.setText("");
        block55.setBackground(Color.WHITE);
        block57.setText("");
        block57.setBackground(Color.WHITE);
        block59.setText("");
        block59.setBackground(Color.WHITE);
        block60.setText("");
        block60.setBackground(Color.WHITE);
        block61.setText("");
        block61.setBackground(Color.WHITE);
        block62.setText("");
        block62.setBackground(Color.WHITE);
        block64.setText("");
        block64.setBackground(Color.WHITE);
        block65.setText("");
        block65.setBackground(Color.WHITE);
        block68.setText("");
        block68.setBackground(Color.WHITE);
        block69.setText("");
        block69.setBackground(Color.WHITE);
        block70.setText("");
        block70.setBackground(Color.WHITE);
        block71.setText("");
        block71.setBackground(Color.WHITE);
        block73.setText("");
        block73.setBackground(Color.WHITE);
        block74.setText("");
        block74.setBackground(Color.WHITE);
        block77.setText("");
        block77.setBackground(Color.WHITE);
        block78.setText("");
        block78.setBackground(Color.WHITE);
        block79.setText("");
        block79.setBackground(Color.WHITE);
        block81.setText("");
        block81.setBackground(Color.WHITE);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        block43 = new javax.swing.JTextField();
        block44 = new javax.swing.JTextField();
        block45 = new javax.swing.JTextField();
        block46 = new javax.swing.JTextField();
        block47 = new javax.swing.JTextField();
        block48 = new javax.swing.JTextField();
        block49 = new javax.swing.JTextField();
        block50 = new javax.swing.JTextField();
        block51 = new javax.swing.JTextField();
        block52 = new javax.swing.JTextField();
        block9 = new javax.swing.JTextField();
        block53 = new javax.swing.JTextField();
        block10 = new javax.swing.JTextField();
        block54 = new javax.swing.JTextField();
        block11 = new javax.swing.JTextField();
        block55 = new javax.swing.JTextField();
        block12 = new javax.swing.JTextField();
        block56 = new javax.swing.JTextField();
        block13 = new javax.swing.JTextField();
        block57 = new javax.swing.JTextField();
        block14 = new javax.swing.JTextField();
        block58 = new javax.swing.JTextField();
        block15 = new javax.swing.JTextField();
        block16 = new javax.swing.JTextField();
        block17 = new javax.swing.JTextField();
        block18 = new javax.swing.JTextField();
        block1 = new javax.swing.JTextField();
        block2 = new javax.swing.JTextField();
        block3 = new javax.swing.JTextField();
        block4 = new javax.swing.JTextField();
        block5 = new javax.swing.JTextField();
        block6 = new javax.swing.JTextField();
        block7 = new javax.swing.JTextField();
        block8 = new javax.swing.JTextField();
        block59 = new javax.swing.JTextField();
        block60 = new javax.swing.JTextField();
        block61 = new javax.swing.JTextField();
        block62 = new javax.swing.JTextField();
        block19 = new javax.swing.JTextField();
        block63 = new javax.swing.JTextField();
        block20 = new javax.swing.JTextField();
        block64 = new javax.swing.JTextField();
        block21 = new javax.swing.JTextField();
        block65 = new javax.swing.JTextField();
        block22 = new javax.swing.JTextField();
        block66 = new javax.swing.JTextField();
        block23 = new javax.swing.JTextField();
        block67 = new javax.swing.JTextField();
        block24 = new javax.swing.JTextField();
        block68 = new javax.swing.JTextField();
        block25 = new javax.swing.JTextField();
        block26 = new javax.swing.JTextField();
        block27 = new javax.swing.JTextField();
        block28 = new javax.swing.JTextField();
        block69 = new javax.swing.JTextField();
        block70 = new javax.swing.JTextField();
        block71 = new javax.swing.JTextField();
        block72 = new javax.swing.JTextField();
        block29 = new javax.swing.JTextField();
        block73 = new javax.swing.JTextField();
        block30 = new javax.swing.JTextField();
        block74 = new javax.swing.JTextField();
        block31 = new javax.swing.JTextField();
        block75 = new javax.swing.JTextField();
        block32 = new javax.swing.JTextField();
        block76 = new javax.swing.JTextField();
        block33 = new javax.swing.JTextField();
        block77 = new javax.swing.JTextField();
        block34 = new javax.swing.JTextField();
        block78 = new javax.swing.JTextField();
        block35 = new javax.swing.JTextField();
        block36 = new javax.swing.JTextField();
        block37 = new javax.swing.JTextField();
        block38 = new javax.swing.JTextField();
        block79 = new javax.swing.JTextField();
        block80 = new javax.swing.JTextField();
        block81 = new javax.swing.JTextField();
        BackMenu = new javax.swing.JButton();
        block39 = new javax.swing.JTextField();
        RestartGame = new javax.swing.JButton();
        block40 = new javax.swing.JTextField();
        CheckAnswer = new javax.swing.JButton();
        block41 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        block42 = new javax.swing.JTextField();
        Message = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        block43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block43.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block43.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block43KeyTyped(evt);
            }
        });

        block44.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block44.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block44.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block44KeyTyped(evt);
            }
        });

        block45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block45.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block45.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block45KeyTyped(evt);
            }
        });

        block46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block46.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block46.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block46KeyTyped(evt);
            }
        });

        block47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block47.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block47.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block47KeyTyped(evt);
            }
        });

        block48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block48.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block48.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block48KeyTyped(evt);
            }
        });

        block49.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block49.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block49.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block49KeyTyped(evt);
            }
        });

        block50.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block50.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block50.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block50KeyTyped(evt);
            }
        });

        block51.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block51.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block51.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block51KeyTyped(evt);
            }
        });

        block52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block52.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block52.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block52KeyTyped(evt);
            }
        });

        block9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block9.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block9KeyTyped(evt);
            }
        });

        block53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block53.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block53.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block53KeyTyped(evt);
            }
        });

        block10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block10.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block10KeyTyped(evt);
            }
        });

        block54.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block54.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block54.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block54KeyTyped(evt);
            }
        });

        block11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block11.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block11KeyTyped(evt);
            }
        });

        block55.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block55.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block55.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block55KeyTyped(evt);
            }
        });

        block12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block12.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block12KeyTyped(evt);
            }
        });

        block56.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block56.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block56.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block56KeyTyped(evt);
            }
        });

        block13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block13.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block13KeyTyped(evt);
            }
        });

        block57.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block57.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block57.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block57KeyTyped(evt);
            }
        });

        block14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block14.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block14KeyTyped(evt);
            }
        });

        block58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block58.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block58.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block58KeyTyped(evt);
            }
        });

        block15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block15.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block15KeyTyped(evt);
            }
        });

        block16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block16.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block16KeyTyped(evt);
            }
        });

        block17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block17.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block17KeyTyped(evt);
            }
        });

        block18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block18.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block18KeyTyped(evt);
            }
        });

        block1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block1.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block1ActionPerformed(evt);
            }
        });
        block1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block1KeyTyped(evt);
            }
        });

        block2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block2.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block2KeyTyped(evt);
            }
        });

        block3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block3.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block3KeyTyped(evt);
            }
        });

        block4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block4.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block4KeyTyped(evt);
            }
        });

        block5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block5.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block5KeyTyped(evt);
            }
        });

        block6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block6.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block6KeyTyped(evt);
            }
        });

        block7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block7.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block7KeyTyped(evt);
            }
        });

        block8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block8.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block8KeyTyped(evt);
            }
        });

        block59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block59.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block59.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block59KeyTyped(evt);
            }
        });

        block60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block60.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block60.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block60KeyTyped(evt);
            }
        });

        block61.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block61.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block61.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block61KeyTyped(evt);
            }
        });

        block62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block62.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block62.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block62KeyTyped(evt);
            }
        });

        block19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block19.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block19KeyTyped(evt);
            }
        });

        block63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block63.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block63.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block63KeyTyped(evt);
            }
        });

        block20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block20.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block20KeyTyped(evt);
            }
        });

        block64.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block64.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block64.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block64KeyTyped(evt);
            }
        });

        block21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block21.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block21KeyTyped(evt);
            }
        });

        block65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block65.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block65.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block65KeyTyped(evt);
            }
        });

        block22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block22.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block22KeyTyped(evt);
            }
        });

        block66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block66.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block66.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block66KeyTyped(evt);
            }
        });

        block23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block23.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block23KeyTyped(evt);
            }
        });

        block67.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block67.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block67.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block67KeyTyped(evt);
            }
        });

        block24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block24.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block24KeyTyped(evt);
            }
        });

        block68.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block68.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block68.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block68KeyTyped(evt);
            }
        });

        block25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block25.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block25KeyTyped(evt);
            }
        });

        block26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block26.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block26KeyTyped(evt);
            }
        });

        block27.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block27.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block27KeyTyped(evt);
            }
        });

        block28.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block28.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block28KeyTyped(evt);
            }
        });

        block69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block69.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block69.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block69KeyTyped(evt);
            }
        });

        block70.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block70.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block70.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block70KeyTyped(evt);
            }
        });

        block71.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block71.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block71.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block71KeyTyped(evt);
            }
        });

        block72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block72.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block72.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block72KeyTyped(evt);
            }
        });

        block29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block29.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block29KeyTyped(evt);
            }
        });

        block73.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block73.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block73.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block73KeyTyped(evt);
            }
        });

        block30.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block30.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block30KeyTyped(evt);
            }
        });

        block74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block74.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block74.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block74KeyTyped(evt);
            }
        });

        block31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block31.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block31KeyTyped(evt);
            }
        });

        block75.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block75.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block75.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block75KeyTyped(evt);
            }
        });

        block32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block32.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block32KeyTyped(evt);
            }
        });

        block76.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block76.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block76.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block76KeyTyped(evt);
            }
        });

        block33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block33.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block33KeyTyped(evt);
            }
        });

        block77.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block77.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block77.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block77KeyTyped(evt);
            }
        });

        block34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block34.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block34KeyTyped(evt);
            }
        });

        block78.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block78.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block78.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block78KeyTyped(evt);
            }
        });

        block35.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block35.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block35KeyTyped(evt);
            }
        });

        block36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block36.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                block36ActionPerformed(evt);
            }
        });
        block36.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block36KeyTyped(evt);
            }
        });

        block37.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block37.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block37.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block37KeyTyped(evt);
            }
        });

        block38.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block38.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block38KeyTyped(evt);
            }
        });

        block79.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block79.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block79.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block79KeyTyped(evt);
            }
        });

        block80.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block80.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block80.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block80KeyTyped(evt);
            }
        });

        block81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block81.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block81.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block81KeyTyped(evt);
            }
        });

        BackMenu.setBackground(new java.awt.Color(255, 255, 255));
        BackMenu.setText("Back to menu");
        BackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackMenuActionPerformed(evt);
            }
        });

        block39.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block39.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block39.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block39KeyTyped(evt);
            }
        });

        RestartGame.setBackground(new java.awt.Color(255, 255, 255));
        RestartGame.setText("Restart game");
        RestartGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestartGameActionPerformed(evt);
            }
        });

        block40.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block40.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block40.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block40KeyTyped(evt);
            }
        });

        CheckAnswer.setBackground(new java.awt.Color(255, 255, 255));
        CheckAnswer.setText("Check answers");
        CheckAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckAnswerActionPerformed(evt);
            }
        });

        block41.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block41.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block41.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block41KeyTyped(evt);
            }
        });

        jLabel1.setText("LEVEL 2");

        block42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        block42.setMargin(new java.awt.Insets(2, 10, 2, 2));
        block42.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                block42KeyTyped(evt);
            }
        });

        Message.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        Message.setMargin(new java.awt.Insets(2, 10, 2, 2));
        Message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Deben estar TODAS las casillas llenas antes de checar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block70, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block71, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(BackMenu)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(RestartGame)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(block79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block80, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(block81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(CheckAnswer))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block29, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block30, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block31, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block32, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block33, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block34, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block35, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block36, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(block10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block12, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block37, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block38, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block39, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(block13, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block14, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block15, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block40, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block41, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block42, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(block16, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block43, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block44, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block45, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(block64, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block65, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block66, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(block67, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block68, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block69, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(block70, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block71, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(block72, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block55, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block56, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block57, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block58, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block59, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block60, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block61, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block62, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block63, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block19, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block20, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block21, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block46, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block47, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block48, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block22, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block23, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block24, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block49, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block50, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block51, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block25, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block26, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block52, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block54, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block73, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block74, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block75, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block76, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block77, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block78, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(block79, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block80, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(block81, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RestartGame)
                    .addComponent(CheckAnswer)
                    .addComponent(BackMenu))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void block43KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block43KeyTyped
        // TODO add your handling code here:
        //CONDICION PARA QUE CADA UNA DE LAS TEXTFIELD SOLO ACEPTE VALOES ENTRE 0 Y 9, NO LETRAS
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        //CONDICION PARA QUE SOLO ACEPTE UN CARACTER EN CADA TEXTFIELD, QUE LO DEMAS LO IGNORE Y NO LO GUARDE NI SE ESCRIBA EN EL TEXTFIELD
        if(block43.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block43KeyTyped

    private void block44KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block44KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block44.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block44KeyTyped

    private void block45KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block45KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block45.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block45KeyTyped

    private void block46KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block46KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block46.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block46KeyTyped

    private void block47KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block47KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block47.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block47KeyTyped

    private void block48KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block48KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block48.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block48KeyTyped

    private void block49KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block49KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block49.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block49KeyTyped

    private void block50KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block50KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block50.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block50KeyTyped

    private void block51KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block51KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block51.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block51KeyTyped

    private void block52KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block52KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block52.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block52KeyTyped

    private void block9KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block9KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block9.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block9KeyTyped

    private void block53KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block53KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block53.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block53KeyTyped

    private void block10KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block10KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block10.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block10KeyTyped

    private void block54KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block54KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block54.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block54KeyTyped

    private void block11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block11KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block11.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block11KeyTyped

    private void block55KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block55KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block55.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block55KeyTyped

    private void block12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block12KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block12.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block12KeyTyped

    private void block56KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block56KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block56.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block56KeyTyped

    private void block13KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block13KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block13.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block13KeyTyped

    private void block57KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block57KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block57.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block57KeyTyped

    private void block14KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block14KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block14.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block14KeyTyped

    private void block58KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block58KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block58.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block58KeyTyped

    private void block15KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block15KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block15.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block15KeyTyped

    private void block16KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block16KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block16.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block16KeyTyped

    private void block17KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block17KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block17.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block17KeyTyped

    private void block18KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block18KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block18.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block18KeyTyped

    private void block1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block1ActionPerformed

    }//GEN-LAST:event_block1ActionPerformed

    private void block1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block1KeyTyped
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block1.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block1KeyTyped

    private void block2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block2KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block2.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block2KeyTyped

    private void block3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block3KeyTyped
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block3.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block3KeyTyped

    private void block4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block4KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block4.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block4KeyTyped

    private void block5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block5.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block5KeyTyped

    private void block6KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block6KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block6.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block6KeyTyped

    private void block7KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block7KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block7.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block7KeyTyped

    private void block8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block8KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block8.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block8KeyTyped

    private void block59KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block59KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block59.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block59KeyTyped

    private void block60KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block60KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block60.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block60KeyTyped

    private void block61KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block61KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block61.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block61KeyTyped

    private void block62KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block62KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block62.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block62KeyTyped

    private void block19KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block19KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block19.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block19KeyTyped

    private void block63KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block63KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block63.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block63KeyTyped

    private void block20KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block20KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block20.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block20KeyTyped

    private void block64KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block64KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block64.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block64KeyTyped

    private void block21KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block21KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block21.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block21KeyTyped

    private void block65KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block65KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block65.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block65KeyTyped

    private void block22KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block22KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block22.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block22KeyTyped

    private void block66KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block66KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block66.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block66KeyTyped

    private void block23KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block23KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block23.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block23KeyTyped

    private void block67KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block67KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block67.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block67KeyTyped

    private void block24KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block24KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block24.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block24KeyTyped

    private void block68KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block68KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block68.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block68KeyTyped

    private void block25KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block25KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block25.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block25KeyTyped

    private void block26KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block26KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block26.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block26KeyTyped

    private void block27KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block27KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block27.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block27KeyTyped

    private void block28KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block28KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block28.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block28KeyTyped

    private void block69KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block69KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block69.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block69KeyTyped

    private void block70KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block70KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block70.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block70KeyTyped

    private void block71KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block71KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block71.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block71KeyTyped

    private void block72KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block72KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block72.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block72KeyTyped

    private void block29KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block29KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block29.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block29KeyTyped

    private void block73KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block73KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block73.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block73KeyTyped

    private void block30KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block30KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block30.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block30KeyTyped

    private void block74KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block74KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block74.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block74KeyTyped

    private void block31KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block31KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block31.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block31KeyTyped

    private void block75KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block75KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block75.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block75KeyTyped

    private void block32KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block32KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block32.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block32KeyTyped

    private void block76KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block76KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block76.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block76KeyTyped

    private void block33KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block33KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block33.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block33KeyTyped

    private void block77KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block77KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block77.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block77KeyTyped

    private void block34KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block34KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block34.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block34KeyTyped

    private void block78KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block78KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block78.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block78KeyTyped

    private void block35KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block35KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block35.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block35KeyTyped

    private void block36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_block36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_block36ActionPerformed

    private void block36KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block36KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block36.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block36KeyTyped

    private void block37KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block37KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block37.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block37KeyTyped

    private void block38KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block38KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block38.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block38KeyTyped

    private void block79KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block79KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block79.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block79KeyTyped

    private void block80KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block80KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block80.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block80KeyTyped

    private void block81KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block81KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block81.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block81KeyTyped

    private void BackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackMenuActionPerformed
       //When the button of back to menu is press the interafce disappear and the menu appear
        Menu newMenu = new Menu();
        newMenu.setVisible(true);
        GameInterface2.this.dispose();
    }//GEN-LAST:event_BackMenuActionPerformed

    private void block39KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block39KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block39.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block39KeyTyped

    private void RestartGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestartGameActionPerformed
        //Llama a metodo para reinicar juego
        delate();
    }//GEN-LAST:event_RestartGameActionPerformed

    private void block40KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block40KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block40.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block40KeyTyped

    private void CheckAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckAnswerActionPerformed
        // llamar a metodo, para siganr valores del usuario a una matriz
        valores();
        // Llamar metodo de logico de otro paquete, para comparar la matriz correcta con la qeu el usuario ingreso
        level.check(matrizChecar, level.matrizCorrecta2);
        //Metodo para verificar y mostrar al usiario sus repsuestas correctas e incorrectas
        colores();
        //Condicion para ver is tiene todas buenas y gano o si se equivoco
        if(contador == 51){
            Message.setText("GANASTE");
            Message.setBackground(Color.GREEN);
        }else{
            Message.setText("BASTANTE CERCA");
            Message.setBackground(Color.ORANGE);
        }
    }//GEN-LAST:event_CheckAnswerActionPerformed

    private void block41KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block41KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block41.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block41KeyTyped

    private void block42KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_block42KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)){
            evt.consume();
        }
        if(block42.getText().length()>=1){
            evt.consume();
        }
    }//GEN-LAST:event_block42KeyTyped

    private void MessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MessageActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameInterface2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameInterface2().setVisible(true);
            }
        });
    }
    //CREACION DE LOS TEXTFIELD Y BOTONES

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackMenu;
    private javax.swing.JButton CheckAnswer;
    private javax.swing.JTextField Message;
    private javax.swing.JButton RestartGame;
    private javax.swing.JTextField block1;
    private javax.swing.JTextField block10;
    private javax.swing.JTextField block11;
    private javax.swing.JTextField block12;
    private javax.swing.JTextField block13;
    private javax.swing.JTextField block14;
    private javax.swing.JTextField block15;
    private javax.swing.JTextField block16;
    private javax.swing.JTextField block17;
    private javax.swing.JTextField block18;
    private javax.swing.JTextField block19;
    private javax.swing.JTextField block2;
    private javax.swing.JTextField block20;
    private javax.swing.JTextField block21;
    private javax.swing.JTextField block22;
    private javax.swing.JTextField block23;
    private javax.swing.JTextField block24;
    private javax.swing.JTextField block25;
    private javax.swing.JTextField block26;
    private javax.swing.JTextField block27;
    private javax.swing.JTextField block28;
    private javax.swing.JTextField block29;
    private javax.swing.JTextField block3;
    private javax.swing.JTextField block30;
    private javax.swing.JTextField block31;
    private javax.swing.JTextField block32;
    private javax.swing.JTextField block33;
    private javax.swing.JTextField block34;
    private javax.swing.JTextField block35;
    private javax.swing.JTextField block36;
    private javax.swing.JTextField block37;
    private javax.swing.JTextField block38;
    private javax.swing.JTextField block39;
    private javax.swing.JTextField block4;
    private javax.swing.JTextField block40;
    private javax.swing.JTextField block41;
    private javax.swing.JTextField block42;
    private javax.swing.JTextField block43;
    private javax.swing.JTextField block44;
    private javax.swing.JTextField block45;
    private javax.swing.JTextField block46;
    private javax.swing.JTextField block47;
    private javax.swing.JTextField block48;
    private javax.swing.JTextField block49;
    private javax.swing.JTextField block5;
    private javax.swing.JTextField block50;
    private javax.swing.JTextField block51;
    private javax.swing.JTextField block52;
    private javax.swing.JTextField block53;
    private javax.swing.JTextField block54;
    private javax.swing.JTextField block55;
    private javax.swing.JTextField block56;
    private javax.swing.JTextField block57;
    private javax.swing.JTextField block58;
    private javax.swing.JTextField block59;
    private javax.swing.JTextField block6;
    private javax.swing.JTextField block60;
    private javax.swing.JTextField block61;
    private javax.swing.JTextField block62;
    private javax.swing.JTextField block63;
    private javax.swing.JTextField block64;
    private javax.swing.JTextField block65;
    private javax.swing.JTextField block66;
    private javax.swing.JTextField block67;
    private javax.swing.JTextField block68;
    private javax.swing.JTextField block69;
    private javax.swing.JTextField block7;
    private javax.swing.JTextField block70;
    private javax.swing.JTextField block71;
    private javax.swing.JTextField block72;
    private javax.swing.JTextField block73;
    private javax.swing.JTextField block74;
    private javax.swing.JTextField block75;
    private javax.swing.JTextField block76;
    private javax.swing.JTextField block77;
    private javax.swing.JTextField block78;
    private javax.swing.JTextField block79;
    private javax.swing.JTextField block8;
    private javax.swing.JTextField block80;
    private javax.swing.JTextField block81;
    private javax.swing.JTextField block9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
