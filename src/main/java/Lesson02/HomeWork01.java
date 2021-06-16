package Lesson02;

public class HomeWork01 {
    public static void main(String[] args) {
//Task1
        int a = 20;
        int b = 20;
        int result;
        if (a==b)
            result = a * b;
        else
            result = a + b;
        System.out.println("#1 Result:"+result);
        System.out.println("========================");
//Task2
        int time=1;
        boolean noise=false;
        boolean ok;
        if (time >=7 && time <20)
            ok = true;
            else if (noise==true)
            ok = false;
            else
            ok = true;
            System.out.println("#2 OK? "+ok);
        System.out.println("========================");
//Task3

        int c = 8;
        int d = 2;
        boolean check;
        if (c==10 || d==10||c+d==10)
            check = true;
        else
            check = false;
        System.out.println("#3 Result:"+check);
        System.out.println("========================");

//Task4
        int e = -8;
        int f = -2;
        boolean negative=false;
        boolean out;
        if (e<0 && f>=0)
            out = true;
        else if (e>=0 && f<0)
            out=true;
        else if (negative==true && e<0 && f<0)
            out=true;
        else
            out = false;
        System.out.println("#4 Result:"+out);
        System.out.println("========================");
//Task5
        int num=18;
        boolean div=false;
        if (num % 3 == 0 || num %5 ==0)
            div=true;
        System.out.println("#5 Division:"+div);
        System.out.println("========================");
//Task6
//Ошибка в тексте задания или в примере? Сделал по тексту, а не по примеру.
        int t1 = 120;
        int t2 = -1;
        boolean temp=false;
        if( t1 <0 && t2>120)
            temp=true;
        else if (t1>120 && t2<0)
            temp=true;
        System.out.println("#6 Temperature:"+temp);
        System.out.println("========================");

//Task7

        int sum=0;
        for (int number = 0; number <=112; number++) {
            if (number % 2 == 0)
                sum = sum + number;
        }
        System.out.println("#7 Total:"+sum);
        System.out.println("========================");

//Task8
        int fact=1;
        for (int n = 1; n <=15; n++) {
                fact = fact * n;
        }
        System.out.println("#8 Factоrial:"+fact);
        System.out.println("========================");
//Task9
        int g = 1;
        int h = 9;
        System.out.print("#9: ("+g+","+h+") -> "+g+",");
        if (g>h){
            for (int count=g;count>h;count--){
                System.out.print(count-1 +",");
            }}
        else if (g<h){
            for (int count=g;count<h;count++){
            System.out.print(count+1 +",");
        }}
        else
            System.out.print(" -числа одинаковые");
        System.out.println("");
        System.out.println("========================");
//Task10
        System.out.print("#10 Simple: ");
        boolean simple;
        for (int i = 2; i <=1000; i++) {
            simple=true;
            for (int x=2; x<i;x++)
            {
                if ((i%x)==0 )
                    simple=false;
            }
            if (simple==false) continue;
            System.out.print(i+",");
        }


    }

}
