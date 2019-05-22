package les_03_strings;

public class Task02 {
    public static void main(String[] args) {
        String inDate="DD.MM.YYYY";
        System.out.println("outDate = " + ReplaceDate(inDate));
    }

    private static String ReplaceDate(String inDate) {
        String outDate="";

        String dd=inDate.substring(0,inDate.indexOf("."));
        String mm=inDate.substring(inDate.indexOf(".")+1,inDate.lastIndexOf("."));
        String yyyy=inDate.substring(inDate.lastIndexOf(".")+1);

        //outDate=yyyy+"."+mm+"."+dd;
        outDate=String.format("%s.%s.%s",yyyy,mm,dd);

        return outDate;
    }

}
