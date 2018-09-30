package java_就当一堆来学习;

public class Student {
        private int age;		//成员变量
        private String name;

        private String sex;

        public Student(){}		//无参构造

                                //带参构造
        public Student(int age, String name, String sex){
            this.age = age;
            this.name = name;
            this.sex = sex;
        }


        // 成员方法或者叫做get  set 方法
        public int getAge(){
            return age;
        }

        public void setAge(int age){
            this.age = age;
        }

        public String getName(){
            return name;
        }

        public void setName(String name){
            this.name = name;
        }

        public String toString() {
            return "Student [age=" + age + ", name=" + name + ", sex=" + sex + "]";
        }

}
