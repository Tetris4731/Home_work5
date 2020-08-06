package Home_work_5;

   public class emplooe {
        private String name;
        private String position;
        private String mail;
        private String mobile;
        private int salary;
        private int age;

        public emplooe( String name, String position, String mail, String mobile, int salary, int age ) {
            this.name = name;
            this.position = position;
            this.mail = mail;
            this.mobile = mobile;
            this.salary = salary;
            this.age = age;
        }
        public void info(){
            System.out.printf(" Имя - %s,\n Должность - %s,\n email - %s,\n Телефон - %s,\n Зарплата - %d,\n Возраст - %d\n",name,position,mail,mobile,salary,age);
        }

        public int getAge() {
            return age;
        }

    }