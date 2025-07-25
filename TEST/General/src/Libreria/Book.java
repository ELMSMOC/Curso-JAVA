package Libreria;

import java.util.Objects;

public class Book {
    public String name;
    private String author;
    private int age;
    public boolean isShared;
    private int numBooks;
    private int index;

    public Book(String name, String author, int age, boolean isShared) {
        this.name = name;
        this.author = author;
        this.age = age;
        this.isShared = isShared;
    }

    public boolean isShared() {
        return isShared;
    }

    public void setShared(boolean isShared) {
        this.isShared = isShared;
    }

    @Override
    public String toString() {
        String message = 
        """
        ========================
        Book Name: %s
        Author4: %s 
        Age: %s
        Es: %s 
        
         """.formatted(name, author, age, isShared);
        return  message;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Book other = (Book) obj;
        return name.equals(other.name) &&
            author.equals(other.author) &&
            age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, age);
    }



}
