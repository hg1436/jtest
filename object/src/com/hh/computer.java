package com.hh;

public  class computer  {
    int age;
    String name;

    public computer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        computer computer = (computer) o;

        if (age != computer.age) return false;
        return name != null ? name.equals(computer.name) : computer.name == null;
    }

    @Override
    public String toString() {
        return "computer{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
