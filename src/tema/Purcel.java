package tema;

public class Purcel {


        private String numePurcel;
        private String numeProprietarPurcel;

        public Purcel(String numePurcel, String numeProprietarPurcel) {
            this.numePurcel = numePurcel;
            this.numeProprietarPurcel = numeProprietarPurcel;
        }
        public Purcel() {
        }
        public void setNumeProprietar(String numeProprietarPurcel) {
            this.numeProprietarPurcel = numeProprietarPurcel;
        }
        public void setProprietar(PersonTema proprietar){
            this.numeProprietarPurcel = proprietar.getNume();
        }
    }

