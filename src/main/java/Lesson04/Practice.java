package Lesson04;

public class Practice {
    public static void main(String[] args) {
//Task01
        //Ver.1
        String id = "UX-12345-AV";
        String number = id.replace("UX-", "").replace("-AV", "");
        System.out.println(number);
        String newId = id.replace("-", "_").replace("-", "_");
        System.out.println(newId);
        //Ver.2
        int numberV2 = extractNumberFrom(id);
        System.out.println(numberV2);
        String newIdV2=replaceDasches(id);
        System.out.println(newIdV2);
    }

    public static int extractNumberFrom(String ind) {
        int index1 = ind.indexOf("-");
        int index2 = ind.lastIndexOf("-");
        String num = ind.substring(index1 + 1, index2);
        return Integer.parseInt(num);
    }
    public static String replaceDasches (String ind) {
        return ind.replace("-", "_").replace("-", "_");
    }
}