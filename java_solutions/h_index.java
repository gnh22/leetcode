package java_solutions;
import java.util.Arrays;
public class h_index {
    public static void main(String[] args){
        int[] citations = {1,3,1};
        System.out.println(hIndex(citations));
    }
    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        if(citations[0]>=citations.length){ // max it could be is citations.length
            return citations.length;
        }
        int index = citations.length;
        for(int i=0; i<citations.length; i++){
            if(citations[i]<citations.length-i)
                index--;

            if(citations[i]==citations.length-i){
                return index;
            }
                
        }
        return index;
    }
    
}
