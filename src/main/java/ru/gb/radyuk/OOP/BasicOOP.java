package ru.gb.radyuk.OOP;

public class BasicOOP {
    public static void main(String[] args) {
        User[] users = new User[5];
        users[0] = new User("Петр", "Петров", "S@k.ru", 21, true);
        users[1] = new User("Вася", "Васильев", "V@k.ru", 45, true);
        users[2] = new User("Марина", "Ро", "M@k.ru", 34, false);
        users[3] = new User("Дмитрий", "Дмитриев", "D@k.ru", 25, true);
        users[4] = new User("Георгия", "Олеговна", "G@k.ru", 57, false);
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() > 40) {
                System.out.println("Имя: " + users[i].getFirstName() + ", фамилия: " + users[i].getLastName() +
                        ", email: " + users[i].geteMail() + ", возраст: " + users[i].getAge() +
                        ", пол: " + users[i].geteMail());
            }
        }
            }
}
