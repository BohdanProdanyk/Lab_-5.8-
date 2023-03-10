public class Main {
    public static void main(String[] args) {
        //task 1
        int f = 74;
        if (50<f & f<100) {
            System.out.println("Число належить проміжку");
        } else{
            System.out.println("Число не належить проміжку");
        }



        //task 2
        int z = 374;
        int x = z / 100; //(1)
        int c = z % 10; //(3)
        int v = (x*100-z)/10;
        int b = (v-v-v); //(2)

        if (x>b & x>c){
            System.out.println("Найбільше число:" + x);
        }
        else if (b>x & b>c){
            System.out.println("Найбільше число:" + b);
        }
        else if (c>x & c>b) {
            System.out.println("Найбільше число:" + c);
        }




        //task 3
        int p = 2;
        if (p==9 | p==8 | p==7 | p==6 | p==5 | p==4 | p==3 | p==1){
            System.out.println("поверх " + p);
        }
        else if (p==2){
            p++;
            System.out.println("поверх 3");
        }
        else if (p>9 | p<1){
            System.out.println("*бум* ви застряли у ліфті");
        }


        //task 4
        System.out.println("Ви погоджуєтесь з умовами ?");
        String chat = "+";
        switch (chat){
            case "+":
                System.out.println("Я погоджуюсь!");
                break;
            case "Так":
                System.out.println("Я погоджуюсь!");
                break;
            case "Yes":
                System.out.println("Я погоджуюсь!");
                break;
            case "-":
                System.out.println("Я не погоджуюсь!");
                break;
            case "No":
                System.out.println("Я не погоджуюсь!");
                break;
            case "Ні":
                System.out.println("Я не погоджуюсь!");
                break;
            default:
                System.out.println("Ти що тютю?!)");
        }

    }
}