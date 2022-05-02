package CP_3;

public class animal {
    private String name; // название
    private String klass; // класс
    private int avmass; // средняя масса
    private static int k = 0; //переменная для счетчика экземпляров

    animal() { // конструктор без параметров
        name = "";
        klass = "";
        avmass = 0;
        k++;
    }

    animal(String name, String klass, int avmass) { // Конструктор с параметрами
        this.name = name;
        this.klass = klass;
        this.avmass = avmass;
        k++;
    }

    animal(animal a) { //Конструктор с объектом в качестве параметра
        name = a.name;
        klass = a.klass;
        avmass = a.avmass;
        k++;
    }

    public void show() {
        System.out.println("Имя: "+name+", класс: "+klass+", средняя масса: "+avmass);
    }

    public String getName() {
        return name;
    }

    public String getKlass() {
        return klass;
    }

    public int getAvmass() {
        return avmass;
    }

    public static int getK() {
        return  k;
    }
}
