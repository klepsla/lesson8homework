public class Main {
    public static void main(String[] args) {System.out.println("Hello world!");

    //Задание № 1.
        String firstName = "Ivan" + " ";
        String middleName = "Ivanovich";
        String lastName = "Ivanov" + " ";
        String fullName = lastName + firstName + middleName;
        System.out.print("ФИО сотрудника - " + fullName + ".");
        System.out.println();
    //Задание № 2
        String s = fullName;
        String s1 = s.toUpperCase();
        System.out.print("Данные ФИО сотрудника для заполнения отчёта - " + s1 + ".");
    //Задание № 3
        System.out.println();
        String firstNameS = "Семён" + " ";
        String middleNameS = "Семёнович";
        String lastNameS = "Иванов" + " ";
        String fullNameS = lastNameS + firstNameS + middleNameS;
        String d = fullNameS;
        String d1 = d.replace('ё', 'е');
        System.out.print("Данные ФИО сотрудника - " + d1 + "." );

    }
}

