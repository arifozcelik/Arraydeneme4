import java.util.Arrays;
public class Arraydeneme4 {
    static boolean isFind(int[] arr,int value){
        for(int i : arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3,7,3,3,2,9,10,21,1,33,1};
        int[] tekrareden = new int[list.length];
        int startindex = 0;
        for (int i = 0; i< list.length;i++){
            for(int j = 0; j< list.length;j++){
                if((i != j) && (list[i] == list[j])){
                    if (!isFind(tekrareden,list[i])){
                        tekrareden[startindex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arraydeneme4.toString(tekrareden));
    }
}
