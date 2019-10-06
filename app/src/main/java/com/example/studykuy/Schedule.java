package com.example.studykuy;

import android.os.Parcel;
import android.os.Parcelable;

public class Schedule implements Parcelable {
    private String nama;
    private String matkul;
    private String photo;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMatkul() {
        return matkul;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.matkul);
        dest.writeString(this.photo);
    }

    public Schedule() {
    }

    protected Schedule(Parcel in) {
        this.nama = in.readString();
        this.matkul = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<Schedule> CREATOR = new Parcelable.Creator<Schedule>() {
        @Override
        public Schedule createFromParcel(Parcel source) {
            return new Schedule(source);
        }

        @Override
        public Schedule[] newArray(int size) {
            return new Schedule[size];
        }
    };
}
