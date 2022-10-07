package homework.v3.entities;

public class Instructor {
    private String nameSurname;
    private String mail;

    public Instructor(String nameSurname, String mail) {
        this.nameSurname = nameSurname;
        this.mail = mail;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
