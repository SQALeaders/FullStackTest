package UtilTest;

import com.github.javafaker.Faker;

public class Fakerdata {
    public  static String TestName ()
    {
        Faker fakertest=new Faker();
        String name=fakertest.name();
        return name;
    }
    public  static String TestPass ()
    {
        Faker fakertest=new Faker();
        String password=fakertest.phoneNumber();
        return password;
    }
    public  static String FName ()
    {
        Faker fakertest=new Faker();
        String FirstN=fakertest.firstName();
        return FirstN;
    }
    public  static String Lname ()
    {
        Faker fakertest=new Faker();
        String LastN=fakertest.lastName();
        return LastN;
    }
    public  static String CountryN ()
    {
        Faker fakertest=new Faker();
        String CName=fakertest.country();
        return CName;
    }

}
