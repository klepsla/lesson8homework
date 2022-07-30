public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Задание № 1.
        String firstName = "Ivan" + " ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov" + " ";
        String fullName = lastName + firstName + middleName;
        System.out.print("ФИО сотрудника - " + fullName + ".");
        System.out.println();
        //Задание № 2
        System.out.print("Данные ФИО сотрудника для заполнения отчёта - " + fullName.toUpperCase() + ".");
        System.out.println();
        //Задание № 3
        fullName = "Иванов Семён Семёнович";
        System.out.println(fullName.replace("ё", "е"));
    }
}

