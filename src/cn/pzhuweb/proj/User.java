package cn.pzhuweb.proj;

public class User {
//    private String name;
//    private String age;
//    private String[] hobbys;
//
//    public User(String name, String age, String[] hobbys) {
//        this.name = name;
//        this.age = age;
//        this.hobbys = hobbys;
//    }
//
//    public User(String name, String age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public String[] getHobbys() {
//        return hobbys;
//    }

        private String name;
        private String password;
        public User() {
            super();
            // TODO Auto-generated constructor stub
        }
        public User(String name, String password) {
            super();
            this.name = name;
            this.password = password;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        @Override
        public String toString() {
            return "User [name=" + name + ", password=" + password + "]";
        }


    }


