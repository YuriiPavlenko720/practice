package Lesson01;
public class ClassWork {
    public static void main(String[] args) {
        int a=5;
        System.out.println(--a); //4
        System.out.println(a--); //4
        System.out.println(a);   //3
        System.out.println(-a);  //-3
        System.out.println(-a);  //-3? Т.е. "++" и "--" меняют переменную, а "-" и "+" только выводят с нужным знаком,
        System.out.println(+a);  //3? но знак в самой переменной не меняется?
    }
}
