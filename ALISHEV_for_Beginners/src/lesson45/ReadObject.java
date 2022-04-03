package lesson45;

import java.io.*;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Person person1 = (Person) ois.readObject(); //��� �� ����������� ������ ����������� �� ������ Person
            Person person2 = (Person) ois.readObject(); //��� �� ����������� ������ ����������� �� ������ Person

            System.out.println(person1);
            System.out.println(person2);

            ois.close();
        } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) { //��� ��������� ���������� � ������, ���� �� ���������� ���� ����, ���
                                                 //��� ����� Person �� ������
            e.printStackTrace();
        }
    }
}