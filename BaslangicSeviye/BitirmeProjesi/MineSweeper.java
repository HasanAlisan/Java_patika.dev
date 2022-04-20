package BaslangicSeviye.BitirmeProjesi;

/*Oyun Kuralları :

   - Oyun metin tabanlıdır.
   - Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
   - Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
   - Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3
    boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda
    mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi
    oluşturabilirsiniz.)

   - Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
   - Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar
    nokta istenmeli.

   - Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
   - Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz,
    sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya
    yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
   - Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int gameRow = 0, gameColum = 0;
    int gameSize=0;
    int mineNumbers = 0;
    int succeededSteps =0;
    Character[][] userMatrix;
    Character[][] mineLocationsMatrix;
    boolean GameRunning =true;

    Scanner input = new Scanner(System.in);

    MineSweeper(int gameRow, int gameColum) {
        this.gameRow = gameRow;
        this.gameColum = gameColum;
        this.userMatrix=new Character[gameRow][gameColum];
        this.mineLocationsMatrix=new Character[gameRow][gameColum];
        this.gameSize=(gameRow*gameColum);
        this.mineNumbers=gameSize/4;
    }

    //game run method
    public void runMineSweeperGame(){
        int row,col=0;

        assignRandomMineLocationsToMatrix();
        printMatrix(mineLocationsMatrix);

        userMatrixDecleration();
        printMatrix(userMatrix);

        System.out.println("----Game Running----");
        while (GameRunning){
            //taking user input values
            System.out.println("------------------------------------");
            System.out.println("enter matrix index/location values");
            System.out.print("0 - " + gameRow + "(excluding) enter row value in range: ");
            row=input.nextInt(); //row
            System.out.print("0 - " + gameColum + "(excluding) enter colum value in range: ");
            col=input.nextInt();//colum

            //checking user's location values range
            if ((row < 0 || row >= gameRow) || (col < 0 || col >= gameColum)) {
                continue;
            }

            if(mineLocationsMatrix[row][col]=='*'){
                GameRunning =false;
                System.out.println("There is a mine :(");
                System.out.println("----Game Over----");
            }
            else{
                System.out.println("There is no mine, keep playing :)");
                gameAlgorithm(row,col);
                printMatrix(userMatrix);
                succeededSteps++;
                if (succeededSteps ==(gameSize-mineNumbers)){
                    System.out.println("congratulations you won the game");
                    break;
                }
            }
        }

    }

    //assign random generated mine locations to matrix(mine location matrix)
    public void assignRandomMineLocationsToMatrix() {
        System.out.println("mine locations are indicated by '*'");
        int count=0;
        int randomRow,randomColum;
        Random randomValues = new Random();

        //mine index declaration
        //unique random numbers
        while (count!=mineNumbers){
            randomRow=randomValues.nextInt(gameRow);
            randomColum=randomValues.nextInt(gameColum);

            if(mineLocationsMatrix[randomRow][randomColum] == null){
                mineLocationsMatrix[randomRow][randomColum] = '*';
                count++;
            }
        }

        for (int i = 0; i < mineLocationsMatrix.length; i++) {
            for (int j = 0; j < mineLocationsMatrix[i].length; j++) {
               if(mineLocationsMatrix[i][j]==null) {
                   mineLocationsMatrix[i][j]='-';
               }
            }
        }
    }

    // generate user matrix
    public void userMatrixDecleration(){
        System.out.println("Welcome to minesweeper game");
        for (int i = 0; i < userMatrix.length; i++) {
            Arrays.fill(userMatrix[i], '-');
        }
    }

    //print matrix
    public void printMatrix(Character[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");
    }

    //game algorithm
    public void gameAlgorithm(int row,int col) {
        int mineCheckCounter=0;

        //sağı(r,c+1)
        if((col < gameColum-1) && (mineLocationsMatrix[row][col+1]=='*')){
            mineCheckCounter++;
        }
        //solu(r,c-1)
        if((col > 0) && (mineLocationsMatrix[row][col-1]=='*')){
            mineCheckCounter++;
        }
        //yukarısı(r-1,c)
        if((row > 0) && (mineLocationsMatrix[row-1][col]=='*')){
            mineCheckCounter++;
        }
        //aşağısı(r+1,c)
        if((row < gameRow-1) && (mineLocationsMatrix[row+1][col]=='*') ){
            mineCheckCounter++;
        }
        //sol üst çapraz(r-1,c-1)
        if(((row > 0) && (col > 0)) && (mineLocationsMatrix[row-1][col-1]=='*')){
            mineCheckCounter++;
        }
        //sağ üst çapraz(r-1,c+1)
        if(((row >0) && (col < gameColum-1)) && (mineLocationsMatrix[row-1][col+1]=='*')){
            mineCheckCounter++;
        }
        //sağ alt çapraz(r+1,c+1)
        if(((row < gameRow-1) && (col) < gameColum-1) && (mineLocationsMatrix[row+1][col+1]=='*')){
            mineCheckCounter++;
        }
        //sol alt çapraz(r+1,c-1)
        if(((row < gameRow-1) && (col) > 0) && (mineLocationsMatrix[row+1][col-1]=='*')){
            mineCheckCounter++;
        }

        userMatrix[row][col]=(char)(mineCheckCounter+48); //(mineCheckCounter+'0')
        mineCheckCounter=0;
    }

}
