public class SinoTibetan extends Linguagem {
    public SinoTibetan(String name, int numFalantes) {
        super(name, numFalantes, "Asia", "sujeito-objeto-verbo");
        if (this.name.contains("Chinês")) {
            this.ordemDasPalavras = "sujeito-verbo-objeto";
        }
    }
}