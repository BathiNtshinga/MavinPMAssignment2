package org.bathi;
/**
 * Bathi Ntshinga
 * Part Time
 * 214198227
 * 26/02/2020
 */


public class App
{
    int age;
    String name;

    public App(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }

        if(obj == null || obj.getClass()!= this.getClass())
            return false;

        App app = (App) obj;

        return (app.name == this.name && app.age == this.age);
    }

}
