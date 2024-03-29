package TelephoneDirectory;

import java.util.Objects;

public class Contact implements Comparable<Contact>{        // Используется интерфейс Comparable для сортировки имен контактов
    public String name;
    public String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public int compareTo(Contact contact) {                     // Переопределяем метод compareTo интерфейса Comparable где в передаем значение contact типа Contact
        return name.compareTo(contact.getName());               // И сравниваем через метод compareTo который используется в классе String
    }
}
