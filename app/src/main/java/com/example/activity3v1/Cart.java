package com.example.activity3v1;

import android.os.Parcel;
import android.os.Parcelable;

public class Cart implements Parcelable {
    private String title;
    private double price;

    public Cart(String title, double price) {
        this.title = title;
        this.price = price;
    }
    public String toString() {
        return title + " - $" + price;
    }
    protected Cart(Parcel in) {
        title = in.readString();
        price = in.readDouble();
    }

    public static final Creator<Cart> CREATOR = new Creator<Cart>() {
        @Override
        public Cart createFromParcel(Parcel in) {
            return new Cart(in);
        }

        @Override
        public Cart[] newArray(int size) {
            return new Cart[size];
        }
    };

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeDouble(price);
    }
}
