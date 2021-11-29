package com.company;

public class Autor {

    private String meno;
    private String email;
    private String pohlavie;

    public Autor(String meno, String email, String pohlavie) {
        this.meno = meno;
        this.email = email;
        this.pohlavie = pohlavie;
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPohlavie() {
        return pohlavie;
    }

    public void setPohlavie(String pohlavie) {
        this.pohlavie = pohlavie;
    }

    public String toString() {
        return "meno: " + meno + " e-mail: " + email + " pohlavie: " + pohlavie;
    }
}
