package cn.pzhuweb.proj;

public class Car {
        private Integer car_id;
        private  String car_name;
        private  String car_type;
        private  Double car_price;
        public  Car(){

        }
        public Car(Integer car_id, String car_name, String car_type, Double car_price) {
            this.car_id = car_id;
            this.car_name = car_name;
            this.car_type = car_type;
            this.car_price = car_price;
        }

        public Integer getCar_id() {
            return car_id;
        }

        public void setCar_id(Integer car_id) {
            this.car_id = car_id;
        }

        public String getCar_name() {
            return car_name;
        }

        public void setCar_name(String car_name) {
            this.car_name = car_name;
        }

        public String getCar_type() {
            return car_type;
        }

        public void setCar_type(String car_type) {
            this.car_type = car_type;
        }

        public Double getCar_price() {
            return car_price;
        }

        public void setCar_price(Double car_price) {
            this.car_price = car_price;
        }
}
