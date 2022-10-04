package level9_2;

/*
Кто меня вызывал?
*/

    public class Test {
        public static void main(String[] args) throws Exception {
            method1();
        }
        public static int method1() {
            method2();
            StackTraceElement[] a = Thread.currentThread().getStackTrace();
            System.out.println("Я метод "+a[1].getMethodName());
            System.out.println("Меня вызвал "+a[2].getMethodName());
            System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
            return  /*напишите тут ваш код*/ a[2].getLineNumber();
            //решение в одну строку:
            //return Thread.currentThread().getStackTrace()[2].getLineNumber();
            //дополнительно, как вызвать весь поток методов:
            //for (StackTraceElement b:a){
            //    System.out.println("Метод по очереди "+b.getMethodName());
            //}

        }
        public static int method2() {
            method3();
            StackTraceElement[] a = Thread.currentThread().getStackTrace();
            System.out.println("Я метод "+a[1].getMethodName());
            System.out.println("Меня вызвал "+a[2].getMethodName());
            System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
            return  /*напишите тут ваш код*/ a[2].getLineNumber();
        }
        public static int method3() {
            method4();
            StackTraceElement[] a = Thread.currentThread().getStackTrace();
            System.out.println("Я метод "+a[1].getMethodName());
            System.out.println("Меня вызвал "+a[2].getMethodName());
            System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
            return  /*напишите тут ваш код*/ a[2].getLineNumber();
        }
        public static int method4() {
            method5();
            StackTraceElement[] a = Thread.currentThread().getStackTrace();
            System.out.println("Я метод "+a[1].getMethodName());
            System.out.println("Меня вызвал "+a[2].getMethodName());
            System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
            return  /*напишите тут ваш код*/ a[2].getLineNumber();
        }
        public static int method5() {
            StackTraceElement[] a = Thread.currentThread().getStackTrace();
            System.out.println("Я метод "+a[1].getMethodName());
            System.out.println("Меня вызвал "+a[2].getMethodName());
            System.out.println("Вызов произошел из строки номер "+a[2].getLineNumber());
            return  /*напишите тут ваш код*/ a[2].getLineNumber();
        }
    }
