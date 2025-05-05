import java.util.Scanner;

public class Main {
    private static final String VALID_REGEX ="((([А-я]+)|([А-я-]+))\\s){2}(([А-я]+)|([А-я-]+))";

    public static void main(String[] args){
        changeFio();


    }
    private static void changeFio(){
        System.out.println("Введите ФИО");
        String fio = new Scanner(System.in).nextLine().trim();

        if (fio.matches(VALID_REGEX)){
            String [] sp = fio.split("\\s+");
            System.out.println("Фамилия: " + sp[0]);
            System.out.println("Имя: " + sp[1]);
            System.out.println("Отчество: " + sp[2]);

        }
        else {
            System.out.println("Введеная сторока не ФИО");
        }
    }
}





/*
    private static final String VALID = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕËЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ -";

    public static void main(String[] args) {
        //todo код писать тут. По желанию(рекомендуется) вынести код в методы
        System.out.println("Введите ФИО");
        String name = new Scanner(System.in).nextLine().trim();

        boolean isValid = true;
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (!VALID.contains(String.valueOf(name.charAt(i)))) {
                isValid = false;
                break;
            }
            if (name.charAt(i) == ' ') {
                count++;
            }
        }
        if (isValid && count == 2) {

            System.out.println(
                    "Фамилия: " + name.substring(0, name.indexOf(' ')).trim()
                            + "\nИмя: " + name.substring(name.indexOf(' '), name.lastIndexOf(' ')).trim()
                            + "\nОтчество: " + name.substring(name.lastIndexOf(' ')).trim());

        } else {
            System.out.println("Введеная строка не является ФИО");
        }
    }
}
*/
        /*
        System.out.println("Фамилия: "+ name.substring( 0, name.indexOf(' '))
                +"\nИмя: "+ name.substring(name.indexOf(' ')+1, name.lastIndexOf(' '))
                +"\nОтчество: " + name.substring(name.lastIndexOf(' ')));




        String test = name.substring( 0, name.indexOf(' '));
        System.out.println(test);
        String test1 = name.substring(name.indexOf(' ')+1, name.lastIndexOf(' '));
        System.out.println(test1);
        String test2 = name.substring(name.lastIndexOf(' '));
        System.out.println(test2);*/
