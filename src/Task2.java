import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type start position of horse (in format a1-h8)");
        String startPoint = scanner.nextLine();
        System.out.println("Type end position of horse (in format a1-h8)");
        String endPoint = scanner.nextLine();
        int startRow = 8 - Character.getNumericValue(startPoint.charAt(1));
        int startCol = startPoint.charAt(0) - 'a';
        int endRow = 8 - Character.getNumericValue(endPoint.charAt(1));
        int endCol = endPoint.charAt(0) - 'a';
        boolean canMove = false;
        int rowDiff = Math.abs(endRow - startRow);
        int colDiff = Math.abs(endCol - startCol);
        if (rowDiff == 2 && colDiff == 1) {
            canMove = true;
        } else if (rowDiff == 1 && colDiff == 2) {
            canMove = true;
        }
        if (canMove) {
            System.out.println("The horse can move to the selected square");
        } else {
            System.out.println("The horse can't move to the selected square");
        }
    }
