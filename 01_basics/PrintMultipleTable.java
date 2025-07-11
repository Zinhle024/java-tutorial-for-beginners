public class PrintMultipleTable {

    public void printMultiple(int number,int count){
        for(int i = 1; i <= count; i ++){
            System.out.println(number + "*" + i + "=" + number * i );
        }
    }
}
