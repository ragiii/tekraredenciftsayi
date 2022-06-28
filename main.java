import java.util.Arrays;

public class TekrarEdenCiftSayi {
    public static void main(String[] args) {
        int[] list={3,5,16,98,76,55,1,3,7,11,21,66,32,23};
        int[] tekrarCift=new int[list.length];
        int index=0;

        for(int i=0; i < list.length - 1; i++){
            for(int j=0; j<list.length; j++){
                if(list[i] == list[j]){
                    if((! found(tekrarCift, list[i])) && list[i] %2 == 0){
                        tekrarCift[index++] = list[i];
                    }
                }
            }
        }
        System.out.println("Sayı  dizisi  :" +Arrays.toString(list));
        System.out.print("Dizide tekrar eden çift sayılar  :");
        for(int i =0; i <index; i++){
            System.out.print("," + tekrarCift[i]);
        }
    }

    static boolean found(int[] tekrarCift, int number){
        for(int i : tekrarCift){
            if(i == number){
                return true;
            }
        }
        return false;
    }
    
}
