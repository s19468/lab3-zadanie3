/*
    Zadanie 3: Stworzenie klasy Account używając wzorcu.
    Autor: Rafał Tęcza
    Index: s19468
*/
package pjwstk.lab3.zadanie3;

public class Main {

    public static void main(String[] args) {
        Account account = new Account("0", "Maciej Nowakowski", 6420);
        System.out.println(account);

        account.credit(1000);
        System.out.println(account);

        account.debit(2000);
        System.out.println(account);
    }
}
