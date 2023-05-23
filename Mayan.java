public class Mayan extends Linguagem {
    public Mayan(String name, int numFalantes) {
        super(name, numFalantes, "America Central", "verbo-objeto-sujeito");
    }
    public void getInfo() {
        System.out.println("--------------------------------------------------------- \n");
        System.out.println(this.name + " é falado por " + this.numFalantes + " pessoas principalmente em " + this.regioesFaladas + "\n Fato interresante: " + this.name + " é uma lingua ergativa.");
        System.out.println("A linguagem segue a ordem das palavras: " + this.ordemDasPalavras + ".");
        System.out.println("--------------------------------------------------------- \n");

    }
}