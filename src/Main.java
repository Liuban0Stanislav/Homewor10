public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");

        /* Задача 1
        Представьте, что вы работаете в небольшой компании. Данные сотрудников хранятся в неструктурированном формате.
        Бухгалтерия попросила написать программу, в которой  можно работать с Ф. И. О. сотрудников.
        Напишите четыре строки:
        С именем firstName — для хранения имени.
        С именем middleName — для хранения отчества.
        С именем lastName — для хранения фамилии.
        С именем fullName — для хранения Ф. И. О. сотрудника в формате "Фамилия Имя Отчество".
        Выведите в консоль фразу: «ФИО сотрудника — …».
        В качестве данных для задачи используйте "Ivanov Ivan Ivanovich". */

        String firstName = "Иван";
        String middleName = "Иванович";
        String lastName = "Иванов";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");

        /*Задача 2
        Для ежемесячного отчета и ведения документации бухгалтерии нужны Ф. И. О. сотрудников,
        полностью написанные заглавными буквами (верхним регистром).
        Напишите программу, которая изменит написание Ф. И. О. сотрудника
        с "Ivanov Ivan Ivanovich" на полностью заглавные буквы.
        В качестве строки с исходными данными используйте строку fullName.
        Результат программы выведите в консоль в формате: "Данные ФИО сотрудника для заполнения отчета — …"*/

        String fullName = "Ivanov Ivan Ivanovich";
        String[] namesArray = fullName.split(" "); //создаем массив где будут хранить ФИО отдельно друг от друга
        String upperCasedFullName = "";                 //создаем переменную для финальной строки, пока пустая

        for (int i = 0; i < namesArray.length; i++) {   //перебираем массив...
            String name = namesArray[i].toUpperCase();  //...каждый элемент которого переписываем заглавными буквами
            upperCasedFullName = upperCasedFullName + " " + name;//соединяем в финально строке все элементы массива
        }

        upperCasedFullName = upperCasedFullName.trim(); //обрезаем пробел, который получился в цикле в начале строки
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + upperCasedFullName);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        /*Задача 3
        Система, в которой мы работаем, не принимает символ «ё».
        Напишите программу, которая заменяет символ «ё» на символ «е».
        В качестве исходных данных используйте строку fullName
        и данные в ней — "Иванов Семён Семёнович".
        Выведите результат программы в консоль в формате: «Данные ФИО сотрудника — ...».*/

        String fullName = "Иванов Семён Семёнович";
        String changedFullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + changedFullName);
    }
}