
public class Main {
    public static void main(String[] args) {
        String[][] Spruce = GetSpruce(7);
        ShowArray(Spruce);
        ShowArrayOfNums();
    }



    private static String[][] GetSpruce(int count){
        String[][] Spruce = new String[count][count];
        int currentLevel = 1;
        for(int i = 0;i < count;i++){
            for(int j = 0; j < count; j++){
                if(j < currentLevel){
                    Spruce[i][j] = "i";
                }
                else{
                    Spruce[i][j] = "";
                }
            }
            currentLevel ++;
        }
        return Spruce;
    }

    private  static void ShowArrayOfNums() {
        int[][] array = new int[5][5];
        int startNum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = startNum;
                startNum += 3;
            }
        }
        String result = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                result += String.valueOf(array[i][j])+ " ";
            }
            result += "\n";
        }
        System.out.println(result);
    }

    private static  void ShowArray(String[][] array){
        String result = "";
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                result += array[i][j] + " ";
            }
            result += "\n";
        }

        System.out.println(result);
    }
}