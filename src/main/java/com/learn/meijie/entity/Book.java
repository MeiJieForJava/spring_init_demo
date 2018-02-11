package com.learn.meijie.entity;

/**
 * Created by hisen on 17-4-24.
 */
public class Book {
    private long bookId;
    private String name;
    private int number;
    private String detail;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Book{");
        sb.append("bookId=").append(bookId);
        sb.append(", name='").append(name).append('\'');
        sb.append(", number=").append(number);
        sb.append(", detail='").append(detail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}