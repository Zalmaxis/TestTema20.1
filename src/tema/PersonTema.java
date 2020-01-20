package tema;

public class PersonTema {
    public String nume;
    private long cnp;
    public char gen;


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public long getCnp() {
        return cnp;
    }

    public char getGen() {
        return gen;
    }

    public void setGen(char gen) {
        this.gen = gen;
    }

    public PersonTema(String nume, long cnp, char gen) {
        this.nume = nume;
        this.cnp = cnp;
        this.gen = gen;
    }
}
