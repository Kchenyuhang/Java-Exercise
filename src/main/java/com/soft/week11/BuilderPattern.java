package com.soft.week11;

/**
 * @Author yhChen
 * @Description 建造者模式
 * @Date 2020/2/25
 */
public class BuilderPattern {
    public static void main(String[] args) {
        Caster caster = Caster.builder()
                .name("Archer")
                .age(16)
                .gender("男")
                .build();
        System.out.println(caster);
    }
}

class Caster{
    private String name;
    private Integer age;
    private String gender;

    public Caster() {
        super();
    }

    public Caster(String name, Integer age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Caster{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static CasterBuilder builder() {
        return new CasterBuilder();
    }

    static class CasterBuilder{
        private String name;
        private Integer age;
        private String gender;

        public CasterBuilder name(String name) {
            this.name = name;
            return this;
        }

        public CasterBuilder age(Integer age) {
            this.age = age;
            return this;
        }

        public CasterBuilder gender(String gender) {
            this.gender = gender;
            return this;
        }

        public Caster build(){
            return new Caster(this.name,this.age,this.gender);
        }

        public CasterBuilder(){

        }
    }
}
