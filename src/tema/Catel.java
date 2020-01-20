package tema;

public class Catel {


        private String numeCatel;
        private String numeProprietarCatel;

        public Catel(String numeCatel, String numeProprietarCatel) {
            this.numeCatel = numeCatel;
            this.numeProprietarCatel = numeProprietarCatel;
        }
        public Catel() {
        }
        public void setNumeProprietar(String numeProprietarCatel) {
            this.numeProprietarCatel = numeProprietarCatel;
        }
        public void setProprietar(PersonTema proprietar){
            this.numeProprietarCatel = proprietar.getNume();
        }
    }

