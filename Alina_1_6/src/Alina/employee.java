package Alina;

public class employee {
    private String name; // Имя
    private String surname; // отчество
    private String patronymic; // отчество
    private String post; // класс
    private int age; // средняя масса
    private static int k = 0; //переменная для счетчика экземпляров

    employee() { // конструктор без параметров
        name = "";
        surname = "";
        patronymic = "";
        post = "";
        age = 0;
        k++;
    }

    employee(String name, String surname, String patronymic, String post, int age) { // Конструктор с параметрами
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.post = post;
        this.age = age;
        k++;
    }

    employee(employee e) { //Конструктор с объектом в качестве параметра
        name = e.name;
        surname = e.surname;
        patronymic = e.patronymic;
        post = e.post;
        age = e.age;
        k++;
    }

    public void show() {
        System.out.println("ФИО: "+surname+ " " +name+ " "+patronymic+", должность: "+post+", возраст: "+age);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return age;
    }

    public static int getK() {
        return  k;
    }

}
