package com.cody;

import java.util.Objects;

public class Customer {
  private Integer id;
  private String name;
  private String email;
  private Integer age;

  public Customer(Integer id, String name, String email, Integer age) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.age = age;
  }

  public Customer() {

  }

  public Integer getId() {
    return this.id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return this.email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return this.age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this)
      return true;
    if (!(o instanceof Customer)) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(id, customer.id) && Objects.equals(name, customer.name)
        && Objects.equals(email, customer.email) && Objects.equals(age, customer.age);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, email, age);
  }

  @Override
  public String toString() {
    return "{" +
        " id='" + getId() + "'" +
        ", name='" + getName() + "'" +
        ", email='" + getEmail() + "'" +
        ", age='" + getAge() + "'" +
        "}";
  }

}