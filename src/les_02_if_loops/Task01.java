package les_02_if_loops;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input PIB:");
        String fio=scanner.nextLine();

        Boolean pr=fio.contains(" ");
        int lastIndex=0;

        while (pr) {
            if(pr)
            {
                lastIndex=fio.indexOf(" ");
                System.out.println(fio.substring(0,lastIndex));
                fio=fio.substring(lastIndex+1);

                pr=fio.contains(" ");
            }
        }
        System.out.println(fio);

        /*
        String[] fioArray;

        fioArray=fio.split(" ");

        for (int i = 0; i < fioArray.length; i++) {
            System.out.println(fioArray[i]);
        }
        */
    }
}
