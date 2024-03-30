import java.util.Scanner;

public class DataTypes {

    public static int dataTypes(String type) {
        // Write your code here
        switch(type){
            case "Integer":
                return 4;
            case "Long":
                return 8;
            case "Float":
                return 4;
            case "Double":
                return 8;
            case "Character":
                return 1;            
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the data type to get their size : ");
        String str = s.nextLine();
        int ans = dataTypes(str);
        System.out.println(ans);

        s.close();
    }
}
