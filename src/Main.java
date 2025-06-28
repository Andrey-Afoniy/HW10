public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstname = "Ivan";
        String middlename = "Ivanovich";
        String lastname = "Ivanov";
        String fullName = firstname + " " + middlename + " " + lastname;
        System.out.println("Ф. И. О. сотрудника — " + fullName);

        System.out.println("Задание 2");
        System.out.println("Ф. И. О. сотрудника — " + fullName.toUpperCase());

        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        String correctedFullName1 = fullName1.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + correctedFullName1);
    }
}


