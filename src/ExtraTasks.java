import java.util.Arrays;

public class ExtraTasks {
    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();

        String phone = "894384593845";
        String ohone = "7" + phone;
        System.out.println("ohone = " + ohone);

    }

    private static void task4() {
        System.out.println("Задача 4");
       /* ### Повышенная сложность. Задание 8
        Дана строка из букв английского алфавита "aabccddefgghiijjkk".
                Нужно найти и напечатать буквы, которые дублируются в строке.
                Обратите внимание, что строка отсортирована, т.е. дубли идут друг за другом.
                В итоге в консоль должен быть выведен результат программы: "acdgijk".
                - Критерии оценки
    – Данные в строке отсортированы корректно.
    – При изменении содержания строки результат программы выполняется.
    – Результат программы выведен в консоль согласно условиям задачи.*/
        String strBin = "aabccddefgghiijjkk";
        String strUno = "";                     //создаем строку куда потом запишем результат (не должна равняться null)
        StringBuilder str = new StringBuilder(strUno);//создаем объект класса StringBuilder, помещаем туда пустую строку
        char[] charArray = strBin.toCharArray();            //разделяем строку на символы и записываем в массив
        for (int i = 0; i < charArray.length - 1; i++) {    //массив перебираем циклом...
            if (charArray[i] == charArray[i + 1]) {         //если следующий элемент повторяется, то...
                strUno = String.valueOf(str.append(charArray[i]));//...то дописываем его в строку
            }
        }
        System.out.println(strUno);//результат выводим в консоль
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        /* Повышенная сложность. Задание 7**
        Имеется две строки.
        Первая: "135"
        Вторая: "246"
        Соберите из двух строк одну, содержащую данные "123456".
        Использовать сортировку нельзя.
        Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        Выведите результат в консоль в формате: “Данные строки — ….”
        - **Подсказка**
            Следует использовать StringBuilder.
        - Критерии оценки
            – Применен метод, меняющий написание данных строки.
            –При изменении содержания строки результат программы выполняется.
            – Результат программы выведен в консоль согласно условиям задачи.*/
        String numString1 = "135";
        String numString2 = "246";
        StringBuilder stb = new StringBuilder(numString1);  //создали объект stb и поместили в него numString1
        stb.append(numString2);                             //в объекте stb сливаем обе строки
        String numStingTotal = String.valueOf(stb);         //объект stb сохраняем как строку numStringTotal

        char[] charArray = numStingTotal.toCharArray(); //сохраняем строку как массив символов
        int[] intArray = new int[charArray.length];     //создаем пустой массив для сохранения сконвертированных чисел

        for (int i = 0; i < intArray.length; i++) { //пересохраняем charArray в int-формате поштучно
            intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }

        for (int i = 0; i < intArray.length - 1; i++) {//сортировка массива при помощи доп. переменной element.
            for (int j = 0; j < intArray.length - 1; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int element = intArray[j + 1];
                    intArray[j + 1] = intArray[j];
                    intArray[j] = element;
                }
            }
        }
        numStingTotal = Arrays.toString(intArray).replaceAll("\\[|]|,| ", "");/*сортированный массив
        чисел сохраняем как строку, удаляем скобки пробелы и запятые*/
        System.out.println("Данные строки — " + numStingTotal);//вывод результата в консоль
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача 2");
        /* Повышенная сложность. Задание 6
         Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
         Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О.
         в правильный формат.
         В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“,
         которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
         Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв —  …”
         - **Подсказка 1**
         Метод toCharArray() может быть полезен.
         - **Подсказка 2**
         Для преобразования символа в верхний регистр следует использовать
         метод Character.toUpperCase(c), где c — символ.
         - Критерии оценки
         – Применен метод, меняющий написание данных строки.
         – При изменении содержания строки результат программы выполняется.
         – Результат программы выведен в консоль согласно условиям задачи.*/
        String fullName = "ivanov ivan ivanovich";
        char[] phrase;                                  // создаем пустой символьный массив
        phrase = fullName.toCharArray();                //разбиваем фразу на символы и записываем в массив
        phrase[0] = Character.toUpperCase(phrase[0]);   //первый символ массива делаем заглавным
        for (int i = 0; i < phrase.length; i++) {       //перебирая все элементы массива,
            if (phrase[i] == ' ') {                     //находим пробелы...
                phrase[i + 1] = Character.toUpperCase(phrase[i + 1]);//и следующий за пробелом элемент делаем заглавным
            }
        }
        String assembledPhrase = String.valueOf(phrase);//массив символов переписываем в строку
        System.out.println(assembledPhrase);
        System.out.println();
    }

    private static void task1() {
        System.out.println("Задача 1");
/*### **Повышенная сложность. Задание 5**
К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм, разбивающий
одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
В качестве исходных данных используйте:
Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
переменная firstName — для хранения имени;
переменная middleName — для хранения отчества;
переменная lastName — для хранения фамилии.
Решите задание с помощью метода substring().
Результат программы выведите в формате:
“Имя сотрудника — …”
“Фамилия сотрудника — …”
“Отчество сотрудника — ...”

💡 **Важно**: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено.
Их должен вычислить компьютер.

- **Подсказка**
    Определить индексы символов помогут методы indexOf() и lastIndexOf().
- Критерии оценки
    –При изменении содержания строки результат программы выполняется.
    – Программа решена с помощью метода substring().
    – Результат программы выведен в консоль согласно условиям задачи.*/
        String fio = "Ivanov Ivan Ivanovich";
        String nameFromFio;
        String[] nameForms = new String[]{"Фамилия сотрудника — ", "Имя сотрудника — ", "Отчество сотрудника — "};
        String[] names = new String[nameForms.length];
        int whitespace = 0;

        for (int i = 0; i < names.length; i++) {
            whitespace = fio.indexOf(" ");                       //находим индекс первого пробела
            if (whitespace != -1) {         //если пробелы во фразе еще есть, то выделяем слова и записываем в массив
                nameFromFio = fio.substring(0, whitespace);       //записываем в переменную первое имя отделенное пробелом
                names[i] = nameFromFio;                           //записываем имя в массив
                fio = fio.substring(whitespace + 1);  //перезаписываем переменную fio с обрезанным первым словом
                System.out.println(nameForms[i] + nameFromFio);  //выводим результат в цикле
            } else {                //иначе фразу в которой осталось одно слово записываем в последний элемент массива
                names[names.length - 1] = fio;
                System.out.println(nameForms[nameForms.length - 1] + names[names.length - 1]);
            }
        }
        System.out.println();
    }
}
