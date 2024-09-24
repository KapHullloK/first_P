public class Main {

    public static void main(String[] args) {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;

        System.out.format("Ф. И. О. сотрудника — %s\n", fullName);

        System.out.format("Данные Ф. И. О. сотрудника для заполнения отчета — %s\n", fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";

        System.out.format("Данные Ф. И. О. сотрудника —  %s", fullName.replace("ё", "е"));
    }
}
