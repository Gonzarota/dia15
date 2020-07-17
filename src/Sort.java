import java.util.Random;

public class Sort {

    private int[]array;
    private int[]aux;

    public Sort(int size) {
        array = new int[size];
        Random random=new Random();
        for (int i = 0; i <array.length; i++) {
            array[i]=random.nextInt(20);
        }
    }


    public void ordenar(){

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;
                }
            }
        }


    }

    public void print(){
        for(int i=0;i<array.length-1;i++){
            System.out.println(array[i]);
        }
    }


}
