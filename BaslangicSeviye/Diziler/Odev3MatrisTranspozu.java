package BaslangicSeviye.Diziler;

/*çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının
yer değiştirmesi demektir. Bu işlem sonucu elde edilen matris, başlangıçtaki
matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
*/
public class Odev3MatrisTranspozu {
    public static void main(String[] args) {
        int[][] matris={{1,2,3},{4,5,6}};
        int[][] Tmatris=new int[3][2];

        for(int i=0;i< matris.length;i++){
            for(int j =0;j< matris[i].length;j++){
                Tmatris[j][i]= matris[i][j];
            }
        }

        for(int[] i:Tmatris){
            for(int j:i){
                System.out.print(" " +j);
            }
            System.out.println();
        }
    }
}
