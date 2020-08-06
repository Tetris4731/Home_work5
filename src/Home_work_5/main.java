package Home_work_5;
public class main {
    public static void main( String[] args ) {
        emplooe[] persArr = new emplooe[5];
        persArr[0] = new emplooe("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "8(923)-123-12-10", 30000, 30);
        persArr[1] = new emplooe("Sasha Afanas'ev", "coriuer", "opop@mail.ru", "8(800)-555-35-35", 25000, 25);
        persArr[2] = new emplooe("Georgiy Ivanov", "director", "georg.4882@gmail.ru", "8(324)880-30-27", 150000, 44);
        persArr[3] = new emplooe("Alexsandr Alexsandrovich", "senior engineer", "alexsandr@myandex.ru", "8(916)346-64-12", 1000000, 55);
        persArr[4] = new emplooe("Nikolau' Nikolaevich", "developer", "nikola@mail.ru", "8(384)-454-09-11", 13300, 30);
        System.out.println("\n Сотрудники страше 40");
        for (int i = 0; i < persArr.length; i++) {
            if (persArr[i].getAge() > 40) {
                persArr[i].info();
            }
        }
    }
}
